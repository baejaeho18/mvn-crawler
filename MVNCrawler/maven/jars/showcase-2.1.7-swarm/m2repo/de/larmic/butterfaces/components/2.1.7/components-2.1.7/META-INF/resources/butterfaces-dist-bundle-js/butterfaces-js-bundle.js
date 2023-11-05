/* Simple JavaScript Inheritance
 * By John Resig http://ejohn.org/
 * MIT Licensed.
 */
// Inspired by base2 and Prototype
(function(){
    var initializing = false, fnTest = /xyz/.test(function(){xyz;}) ? /\b_super\b/ : /.*/;

    // The base Class implementation (does nothing)
    this.Class = function(){};

    // Create a new Class that inherits from this class
    Class.extend = function(prop) {
        var _super = this.prototype;

        // Instantiate a base class (but only create the instance,
        // don't run the init constructor)
        initializing = true;
        var prototype = new this();
        initializing = false;

        // Copy the properties over onto the new prototype
        for (var name in prop) {
            // Check if we're overwriting an existing function
            prototype[name] = typeof prop[name] == "function" &&
            typeof _super[name] == "function" && fnTest.test(prop[name]) ?
                    (function(name, fn){
                        return function() {
                            var tmp = this._super;

                            // Add a new ._super() method that is the same method
                            // but on the super-class
                            this._super = _super[name];

                            // The method only need to be bound temporarily, so we
                            // remove it when we're done executing
                            var ret = fn.apply(this, arguments);
                            this._super = tmp;

                            return ret;
                        };
                    })(name, prop[name]) :
                    prop[name];
        }

        // The dummy class constructor
        function Class() {
            // All construction is actually done in the init method
            if ( !initializing && this.init )
                this.init.apply(this, arguments);
        }

        // Populate our constructed prototype object
        Class.prototype = prototype;

        // Enforce the constructor to be what we expect
        Class.prototype.constructor = Class;

        // And make this class extendable
        Class.extend = arguments.callee;

        return Class;
    };
})();
/**
 * jQuery-Plugin "butterHandleAutoComplete" for text autocomplete tag. Initializes auto complete functionality to
 * text component.
 *
 * How to use:
 * jQuery("#selector")._butterAutoCompleteInit();
 */
(function ($) {
    // extend jQuery --------------------------------------------------------------------

    $.fn._butterAutoCompleteInit = function () {
        return this.each(function () {
            new AutocompleteList(this);
        });
    };

    // define objects --------------------------------------------------------------------

    var AutocompleteList = Class.extend({
        init: function (rootElement) {
            this.SEARCH_REQUEST_DELAY = 300;// in ms

            var $autocompleteTmp = $(rootElement);
            this.$input = $autocompleteTmp.prev();
            this.$input.parent().css({position: "relative"});
            this.autocompleteId = $autocompleteTmp.attr("id");
            this.$selectedOption = null;
            this.ignoreKeyupEvent = false;
            this.requestDelayTimerId = null;
            this.isRequestRunning = false;
            this.areChangesMadeWhileRequestWasRunning = false;

            this._keyCodes = {
                //backspace: 8,
                tab: 9,
                enter: 13,
                shift: 16,
                ctrl: 17,
                alt: 18,
                pause: 19,
                caps_lock: 20,
                escape: 27,
                page_up: 33,
                page_down: 34,
                end: 35,
                home: 36,
                arrow_left: 37,
                arrow_up: 38,
                arrow_right: 39,
                arrow_down: 40,
                insert: 45,
                // 'delete' is a reserved key word
                delete_key: 46,
                left_window_key: 91,
                right_window_key: 92,
                select_key: 93,
                num_lock: 144,
                scroll_lock: 145
            };

            var self = this;
            self.$input
                    .on("keydown", function (event) {
                        if (event.which === self._keyCodes.enter) {
                            self._handleEnterKeyDown(event);
                        } else if (event.which === self._keyCodes.arrow_up
                                || event.which === self._keyCodes.arrow_down) {
                            self._handleArrowUpAndDownKeyDown(event);
                        } else if (event.which === self._keyCodes.escape) {
                            self._handleEscapeKeyDown(event);
                        }
                    })
                    .on("keyup", function (event) {
                        // don't handle other keys than character keys
                        for (keyName in self._keyCodes) {
                            if (self._keyCodes[keyName] === event.which) {
                                self._stopEvent(event);
                                return;
                            }
                        }

                        if (self.ignoreKeyupEvent) {
                            self._stopEvent(event);
                            self.ignoreKeyupEvent = false;
                            return;
                        }

                        if (self.$input.val().length === 0) {
                            self._stopEvent(event);
                            self._hideAutocompleteResultList();
                            return;
                        }

                        self._trySendJsfAjaxRequest();
                    })
                    .on("blur", function (event) {
                        window.setTimeout(function () {
                            self._hideAutocompleteResultList();
                        }, 100);
                    });
        },

        _handleEnterKeyDown: function (event) {
            if (this.$selectedOption !== null) {
                this._stopEvent(event);
                this._setSelectedValue();
            }
        },

        _handleArrowUpAndDownKeyDown: function (event) {
            this._stopEvent(event);
            var $autocomplete = this._getAutocompleteElement();
            if (!$autocomplete.is(":visible") && this.$input.val().length > 0) {
                this._trySendJsfAjaxRequest();
            } else if ($autocomplete.is(":visible") && $autocomplete.find("li").length > 0) {
                if (this.$selectedOption === null) {
                    this._selectResultOptionElement($autocomplete.find("li")[0]);
                } else {
                    this._moveResultOptionElementSelectionCursor(
                            $autocomplete, event.which === this._keyCodes.arrow_up ? -1 : 1);
                }
            }
        },

        _handleEscapeKeyDown: function (event) {
            this._stopEvent(event);
            this._hideAutocompleteResultList();
        },

        _trySendJsfAjaxRequest: function () {
            var self = this;

            if (self.isRequestRunning) {
                // console.log("request is active, so remember that changes has been made while request was running");
                self.areChangesMadeWhileRequestWasRunning = true;
            }

            if (self.requestDelayTimerId !== null) {
                window.clearTimeout(self.requestDelayTimerId)
            }

            self.requestDelayTimerId = window.setTimeout(function () {
                self.requestDelayTimerId = null;
                self._sendJsfAjaxRequest();
            }, self.SEARCH_REQUEST_DELAY);
        },

        _sendJsfAjaxRequest: function () {
            var self = this;

            if (self.isRequestRunning) {
                // console.log("request is running, abort");
                return;
            }
            self.isRequestRunning = true;

            self.areChangesMadeWhileRequestWasRunning = false;
            self._showLoadingSpinner();

            // console.log("starting request");

            var id = self.$input.parent().parent().attr('id');

            jsf.ajax.request(id, "autocomplete", {
                "javax.faces.behavior.event": "autocomplete",
                render: self.autocompleteId,
                params: self.$input.val(),
                onevent: function (data) {
                    if (data.status === "success") {
                        // console.log("request finished");

                        // only show result if input field still has focus
                        if (self.$input.is(":focus")) {
                            self._handleAutocompleteResultListVisibility();
                        }
                        self._hideLoadingSpinner();
                        self.isRequestRunning = false;

                        if (self.areChangesMadeWhileRequestWasRunning) {
                            // console.log("changes made while request was running, start new request automatically");
                            self._sendJsfAjaxRequest();
                        }
                    }
                }
            });
        },

        _handleAutocompleteResultListVisibility: function () {
            var self = this;
            var $autocomplete = self._getAutocompleteElement();

            if ($autocomplete.find("li").length > 0) {
                self._initAndShowAutocompleteResultList();
            } else {
                self._hideAutocompleteResultList();
            }
        },

        _showLoadingSpinner: function () {
            $('<div class="butter-dropdownlist-spinner-container"><div class="butter-dropdownlist-spinner"></div></div>')
                    .appendTo(this.$input.parent());
        },

        _hideLoadingSpinner: function () {
            this.$input.parent().find(".butter-dropdownlist-spinner").remove();
        },

        _initAndShowAutocompleteResultList: function () {
            var self = this;
            var $autocomplete = self._getAutocompleteElement();
            $autocomplete
                    .show()
                    .css({
                        width: self.$input.innerWidth()
                    })
                    .highlight(self.$input.val());

            $autocomplete.find("ul")
                    .on("mouseleave", function () {
                        self._clearResultOptionSelection();
                    });

            $autocomplete.find("li")
                    .on("mousedown", function () {
                        self._setSelectedValue();
                    })
                    .on("mouseenter", function () {
                        self._selectResultOptionElement(this);
                    });
        },

        _selectResultOptionElement: function (optionElement) {
            this._clearResultOptionSelection();
            var $selectedOptionElement = $(optionElement);
            $selectedOptionElement.addClass("butter-dropdownlist-resultItem-selected");
            this.$selectedOption = $selectedOptionElement;
        },

        _clearResultOptionSelection: function () {
            this.$selectedOption = null;
            this._getAutocompleteElement()
                    .find(".butter-dropdownlist-resultItem-selected")
                    .removeClass("butter-dropdownlist-resultItem-selected");
        },

        _moveResultOptionElementSelectionCursor: function ($autocomplete, direction) {
            if (direction > 0) {
                var $next = this.$selectedOption.next();
                if ($next.length > 0) {
                    this._selectResultOptionElement($next[0]);
                } else {
                    //there is no next
                    this._selectResultOptionElement($autocomplete.find("li")[0]);
                }
            } else {
                var $prev = this.$selectedOption.prev();
                if ($prev.length > 0) {
                    this._selectResultOptionElement($prev[0]);
                } else {
                    //there is no previous
                    var resultListOptions = $autocomplete.find("li");
                    this._selectResultOptionElement(resultListOptions[resultListOptions.length - 1]);
                }
            }
        },

        _setSelectedValue: function () {
            if (this.$selectedOption !== null) {
                this.ignoreKeyupEvent = true;
                this.$input
                        .val(this.$selectedOption.attr("data-select-value"))
                        .change()
                        .focus()
                        .keyup();
                this._hideAutocompleteResultList();
            }
        },

        _hideAutocompleteResultList: function () {
            if (this.requestDelayTimerId !== null) {
                window.clearTimeout(this.requestDelayTimerId)
            }
            this.$selectedOption = null;
            this._getAutocompleteElement().hide();
        },

        _getAutocompleteElement: function () {
            return $(document.getElementById(this.autocompleteId));
        },

        _stopEvent: function (event) {
            event.stopPropagation();
            event.preventDefault();
        }
    });

}(jQuery));
/**
 * jQuery-Plugin to handle bootstrap fixes.
 * Works with at least jQuery 1.3.2.
 *
 * How to use:
 * jQuery("#someTreeSelector").fixBootstrapDropDown();
 */
(function ($) {
    $.fn.fixBootstrapDropDown = function () {

        return this.each(function () {
            $('.dropdown-menu').on('click', function(e) {
                if($(this).hasClass('dropdown-menu-form')) {
                    e.stopPropagation();
                }
            });
        });

    };
}(jQuery));
/**
 * butterItemFilterField is a jQuery plugin that filters html element with the css class <code>filterable-item</code>.
 * It is applied to the search field.<br/>
 * If no filter text is entered, then all filterable-items are displayed. Else the search field value is matched against <b>all</b> text contained by a filterable-item.
 *
 * How to use:
 * jQuery("#someInputSelector").butterItemFilterField();
 *
 * Author: Yann Massard
 */
(function ($) {
    var delay = (function () {
        var timer = 0;
        return function (callback, ms) {
            clearTimeout(timer);
            timer = setTimeout(callback, ms);
        };
    })();

    // extend jQuery --------------------------------------------------------------------
    $.fn.butterItemFilterField = function (filterableItemContainerSelector) {
        return this.each(function () {
            var $this = $(this);
            $this.keyup(function () {
                delay(function () {
                    var filterValue = $this.val();

                    // find container again every time, because it could have been rerendered.
                    var $filterableItemContainer;
                    if (filterableItemContainerSelector) {
                        $filterableItemContainer = $(filterableItemContainerSelector);
                    } else {
                        var containerSelector = $this.attr('data-filterable-item-container');
                        $filterableItemContainer = $(containerSelector);
                    }

                    $filterableItemContainer.find('.filterable-item').each(function () {
                        var $filterableItem = $(this);
                        if ($filterableItem.is(':containsIgnoreCase(' + filterValue + ')')) {
                            $filterableItem.removeClass("hidden");
                            $filterableItem.highlight(filterValue);
                        } else {
                            $filterableItem.addClass("hidden");
                        }

                    });
                }, 300);
            });
        });
    };
}(jQuery));

(function ($) {
    $.expr[":"].containsIgnoreCase = $.expr.createPseudo(function (arg) {
        return function (elem) {
            return !arg || $(elem).text().toUpperCase().indexOf(arg.toUpperCase()) >= 0;
        };
    });
}(jQuery));
/**
 * jQuery-Plugin "Animate dots" for tree animation. Animates a waiting dot line (4 dots) in an interval of 200 millis
 * as html string in given component. Note: existing html code will be cleared.
 * Works with at least jQuery 1.3.2.
 *
 * How to use:
 * jQuery("#selector").startDots();
 * jQuery("#selector").stopDots();
 */
(function ($) {
    // extend jQuery --------------------------------------------------------------------

    var intervalTrigger = null;

    $.fn.startDots = function () {
        return this.each(function () {
            var $originalElement = $(this);

            $originalElement.html('');

            intervalTrigger = setInterval(function () {
                $originalElement.append('.');

                if ($originalElement.html().length > 5) {
                    $originalElement.html('');
                }
            }, 200);
        });
    };

    $.fn.stopDots = function () {
        return this.each(function () {
            var $originalElement = $(this);

            $originalElement.html('');
            window.clearInterval(intervalTrigger);
        });
    };

}(jQuery));
/**
 * jQuery-Plugin "Expanded TextAreas" for expandable text areas. It is used for the JSF-Component "b:textarea".
 * Works with at least jQuery 1.7.
 *
 * How to use:
 * jQuery("#someTextAreaSelector").butterExpandable();
 */
(function ($) {
    // extend jQuery --------------------------------------------------------------------
    $.fn.butterExpandable = function () {
        return this.each(function () {
            if ($(this).find("textarea").length > 0) {
                new TextareaExpandable(this);
            } else {
                new DivExpandable(this);
            }
        });
    };

    // define objects --------------------------------------------------------------------

    var _AbstractExpandable = Class.extend({
        init: function (rootElement) {
            this.EXPAND_HEIGHT = 250; //in px
            this.EXPAND_WIDTH = 500; //in px
            this.ANIMATION_DURATION = 200; //in ms
            this.REPOSITION_INTERVAL = 500; //in ms
            this.EASING = "swing";
            this.KEYCODE_ESCAPE = 27;

            this.$rootElement = $(rootElement);

            this.$ghostElement = null;
            this.$originalElement;
            this.initialHeight;
            this.initialWidth;
            this.initialOffset;
            this.positionTriggerInterval;

            this.initialize();
        },

        initialize: function () {
            // should intentionally be overridden
        },

        isExpansionEventIgnored: function (event) {
            // should intentionally be overridden
            return false;
        },

        onGhostElementCreated: function () {
            // should intentionally be overridden
        },

        onGhostElementCollapsed: function (isCancelled) {
            // should intentionally be overridden
        },

        transferValueToGhostElement: function () {
            // should intentionally be overridden
        },

        expandElement: function (event) {
            if (this.isExpansionEventIgnored(event)) {
                return;
            }

            // console.log("expanding element");

            this.initialHeight = this.$originalElement.outerHeight();
            this.initialWidth = this.$originalElement.outerWidth();
            this.initialOffset = this.$originalElement.offset();

            //create a ghost element that be animated on gets the focus
            var self = this;
            this.$ghostElement = this.createGhostElement();
            this.transferValueToGhostElement();
            this.$ghostElement.css("width", this.initialWidth)
                    .css("height", this.initialHeight)
                    .css("position", "absolute")
                    .css("top", this.initialOffset.top)
                    .css("left", this.initialOffset.left)
                    .css("z-index", 2000)
                    .css("box-shadow", "5px 5px 5px 0 #999")
                    .addClass("butter-component-expandable-ghost")
                    .appendTo($("body"))
                    .animate({
                        height: self.EXPAND_HEIGHT,
                        width: self.initialWidth > self.EXPAND_WIDTH ? self.initialWidth : self.EXPAND_WIDTH
                    }, self.ANIMATION_DURATION, self.EASING, function () {
                        $(document)
                                .on("click.expandable", function (event) {
                                    self._handleMouseClick(event);
                                })
                                .on("keydown.expandable", function (event) {
                                    self._handleEscapeKey(event);
                                });

                        $(window).on("resize.expandable", function (event) {
                            self._repositionGhostElement(event);
                        });

                        //keep track of the orginal element's position
                        self.positionTriggerInterval =
                                window.setInterval(self._repositionGhostElement, self.REPOSITION_INTERVAL);
                    });

            //make original invisible
            this.$originalElement
                    .css("visibility", "hidden")
                    .siblings()
                    .css("visibility", "hidden");

            this.onGhostElementCreated();
        },

        /**
         * @returns {*|HTMLElement}
         */
        createGhostElement: function () {
            // should intentionally be overridden
            return null;
        },

        /**
         * Collapses the ghost element and sets the value if not isCancelled
         * @param isCancelled
         */
        collapseElement: function (cancelled) {
            // console.log("collapsing element");

            // 'cancelled' can be an event object
            var isCancelled = typeof cancelled === "boolean" && cancelled;

            $(document)
                    .off("click.expandable")
                    .off("keydown.expandable");

            //make original visible again
            this.$originalElement
                    .css("visibility", "visible")
                    .siblings()
                    .css("visibility", "visible");

            var self = this;
            this.$ghostElement.animate({
                height: self.initialHeight,
                width: self.initialWidth
            }, self.ANIMATION_DURATION, self.EASING, function () {
                //on animation complete

                self.onGhostElementCollapsed(isCancelled);

                //delete the ghost element
                self.$ghostElement.remove();
                self.$ghostElement = null;

                //delete position trigger timeout and resize listener
                window.clearInterval(self.positionTriggerInterval);
                $(window).off("resize.expandable");
            });
        },

        _handleMouseClick: function (event) {
            // collapse ghost element if user clicks beside it
            if (!$(event.target).is(".butter-component-expandable-ghost")) {
                this.collapseElement(false);
            }
        },

        _handleEscapeKey: function (event) {
            if (event.which === this.KEYCODE_ESCAPE) {
                this.collapseElement(true);
            }
        },

        _repositionGhostElement: function () {
            //keep track of window resizing and reposition the ghost element
            if (this.$ghostElement !== undefined && this.$ghostElement != null) {
                this.initialOffset = this.$originalElement.offset();
                this.$ghostElement
                        .css("top", this.initialOffset.top)
                        .css("left", this.initialOffset.left);
            }
        }
    });

    var DivExpandable = _AbstractExpandable.extend({
        initialize: function () {
            this.$originalElement = this.$rootElement.find(".butter-component-value-readonly");
            this._rearrangeOriginalElementStructure();
        },

        _rearrangeOriginalElementStructure: function () {
            var self = this;
            var _label = this.$rootElement.find(".butter-component-label");

            this.$originalElement
                    .addClass("butter-component-expandable-original")
                    .click(function (event) {
                        self.expandElement(event);
                    })
                    .detach();

            var _container = $("<div>")
                    .addClass("butter-component-expandable-readonly-container")
                    .insertAfter(_label);

            var _icon = $("<span>").addClass("glyphicon glyphicon-resize-full");

            this.$originalElement.appendTo(_container);
            $("<div>")
                    .addClass("butter-component-expandable-readonly-icon")
                    .append(_icon)
                    .appendTo(_container);
        },

        createGhostElement: function () {
            return $("<div>");
        },

        transferValueToGhostElement: function () {
            $("<div>")
                    .html(this.$originalElement.html())
                    .addClass("butter-component-expandable-ghost-readonlyContent")
                    .appendTo(this.$ghostElement);
        }
    });

    var TextareaExpandable = _AbstractExpandable.extend({
        initialize: function () {
            this.blockFocusEventOnOriginal = false;
            this.blockBlurEventOnOriginal = false;

            this.$originalElement = this.$rootElement.find("textarea");
            this.$originalElement.addClass("butter-component-expandable-original");

            var self = this;
            this.$originalElement.focus(function (event) {
                self.expandElement(event);
            });
            this.$originalElement.blur(function (event) {
                self._handleBlurEvent(event);
            });

            this._addInputGroupAddon();
        },

        _addInputGroupAddon: function () {
            this.$originalElement
                    .addClass("form-control")
                    .parent()
                    .addClass("input-group");
            $("<span class='input-group-addon'><span class='glyphicon glyphicon-resize-full'></span></span>")
                    .insertAfter(this.$originalElement);
        },

        _handleBlurEvent: function (event) {
            if (this.blockBlurEventOnOriginal) {
                // prevent blur event bubbling, so it will not be triggered in jsf
                event.preventDefault();
            }
        },

        createGhostElement: function () {
            return $("<textarea>");
        },

        transferValueToGhostElement: function () {
            this.$ghostElement.val(this.$originalElement.val());
        },

        isExpansionEventIgnored: function (event) {
            this.blockBlurEventOnOriginal = true;
            if (this.blockFocusEventOnOriginal) {
                event.preventDefault();
                return true;
            } else {
                return false;
            }
        },

        onGhostElementCreated: function () {
            var self = this;
            this.$ghostElement
                    .blur(function (event) {
                        self.collapseElement(event);
                    })
                    .focus();
            this._moveCaretToEnd(this.$ghostElement);
        },

        onGhostElementCollapsed: function (isCancelled) {
            if (!isCancelled) {
                //transfer value back from ghost to original
                this.$originalElement.val(this.$ghostElement.val())

                // trigger blur and keyup event on original textarea and don't block
                // it for jsf
                this.blockBlurEventOnOriginal = false;
                this.blockFocusEventOnOriginal = true;
                // defer the events a little bit, look at
                // (http://stackoverflow.com/questions/8380759/why-isnt-this-textarea-focusing-with-focus#8380785)
                var self = this;
                window.setTimeout(function () {
                    self.$originalElement.trigger('keyup');
                    self.$originalElement.trigger('change');
                    self.$originalElement.trigger('blur');
                    self.blockFocusEventOnOriginal = false;
                }, 50);
            } else {
                this.blockBlurEventOnOriginal = true;
                this.blockFocusEventOnOriginal = false;
            }
        },

        _moveCaretToEnd: function (element) {
            if (typeof element.selectionStart == "number") {
                element.selectionStart = element.selectionEnd = element.value.length;
            } else if (typeof element.createTextRange !== "undefined") {
                var range = element.createTextRange();
                range.collapse(false);
                range.select();
            } else {
                var strLength= this.$ghostElement.val().length * 2;
                this.$ghostElement[0].setSelectionRange(strLength, strLength);
            }

        }
    });
}(jQuery));
(function ($) {
    $.fn.highlight = function (searchString) {
        var highlightClassName = "search-highlighted";
        var regex = new RegExp(searchString, "gi");

        var elements = this.find('*');
        this.each(function () {
            elements.push(this);
            $(this).find('.' + highlightClassName).contents().unwrap();
            this.normalize();
        });

        return elements.each(function () {
            var $this = $(this);

            if (searchString && searchString !== '') {
                $this.contents()
                    .filter(function () {
                        return this.nodeType === 3 && regex.test(this.nodeValue);
                    })
                    .replaceWith(function () {
                        return (this.nodeValue || "").replace(regex, function (match) {
                            return "<span class=\"" + highlightClassName + "\">" + match + "</span>";
                        });
                    });
            }
        });
    };
}(jQuery));
if (typeof butter === 'undefined') {
    butter = {};
}
butter.link = {};

butter.link.disableOnClick = function(data, showDots, linkText, linkProcessingText, linkGlyphicon, linkProcessingGlyphicon, hideGlyphicon, disableRenderRegionsIds) {
    var status = data.type === "error" ? "error" : data.status;

    // console.log(data.source.id);

    var $commandLink = $(document.getElementById(data.source.id));

    switch (status) {
        case "begin": // Before the ajax request is sent.
            // console.log('ajax request begin');
            $commandLink.addClass("disabled");

            var $glyphicon = $commandLink.find('.butter-component-glyphicon');

            if (hideGlyphicon) {
                $glyphicon.hide();
            }
            if (linkProcessingGlyphicon.length > 0) {
                $glyphicon.removeAttr('class');
                $glyphicon.addClass('butter-component-glyphicon');
                $glyphicon.addClass(linkProcessingGlyphicon);
                if (linkProcessingText.length > 0 && linkGlyphicon.length == 0) {
                    // glyphicon only appears on ajax request
                    $glyphicon.addClass('butter-component-glyphicon-width-margin');
                }
            }

            if (showDots) {
                $commandLink.find('.butter-component-glyphicon-processing').startDots();
                $commandLink.find('.butter-component-glyphicon-processing').css('display', 'inline-block');
                $commandLink.find('.butter-component-glyphicon-text').html(linkProcessingText);
            }
            if (disableRenderRegionsIds != 'undefined') {
                // console.log('Disable field');
                new ButterFaces.Overlay(0, false, disableRenderRegionsIds).show();
            }
            break;

        case "complete": // After the ajax response is arrived.
            // console.log('ajax request complete');
            break;

        case "success": // After update of HTML DOM based on ajax response..
        case "error": // After update of HTML DOM based on ajax response..
            // console.log('ajax request success');
            $commandLink.removeClass("disabled");
            if (showDots) {
                $commandLink.find('.butter-component-glyphicon-processing').stopDots();
                $commandLink.find('.butter-component-glyphicon-processing').css('display', 'none');
                $commandLink.find('.butter-component-glyphicon-text').html(linkText ? linkText : '');
            }

            var $glyphicon = $commandLink.find('.butter-component-glyphicon');
            $glyphicon.removeAttr('class');
            $glyphicon.addClass('butter-component-glyphicon');

            if (hideGlyphicon) {
                $glyphicon.show();
            }
            if (linkGlyphicon.length > 0) {
                $glyphicon.addClass(linkGlyphicon);
            }

            if (disableRenderRegionsIds != 'undefined') {
                // console.log('Enable field');
                new ButterFaces.Overlay(0, false, disableRenderRegionsIds).hide();
            }
            break;
    }
};
(function ($) {
    // extend jQuery --------------------------------------------------------------------
    $.fn.markdownReadonly = function () {
        var root = $(this);

        var $readonlyMarkdown = root.find('.butter-component-value-readonly-wrapper');
        var markdownText = $readonlyMarkdown.html().replace('&gt;', '>');
        var markdownTextToHtml = markdown.toHTML(markdownText);

        $readonlyMarkdown.empty();
        $readonlyMarkdown.append(markdownTextToHtml);
    };
}(jQuery));
if (typeof butter === 'undefined') {
    butter = {};
}
butter.modal = {};

butter.modal.open = function (/* string */ modalPanelId) {
    // console.log('Opening modal panel with data-modal-id ' + modalPanelId);
    $('.butter-modal[data-modal-id=' + modalPanelId + ']').modal({show: true, keyboard: false, backdrop: 'static'})
};

butter.modal.close = function (/* string */ modalPanelId) {
    // console.log('Closing modal panel with data-modal-id ' + modalPanelId);
    $('.butter-modal[data-modal-id=' + modalPanelId + ']').modal('hide');
};
/**
 * jQuery-Plugin "Number Spinner" for input fields.
 * Works with at least jQuery 1.3.2.
 *
 * How to use:
 * jQuery("someButterComponentSelector").butterNumberSpinner();
 */
(function ($) {
    // extend jQuery --------------------------------------------------------------------
    $.fn.butterNumberSpinner = function (options) {
        return this.each(function () {
            new NumberSpinner(this, options);
        });
    };

    // define classes --------------------------------------------------------------------
    var NumberSpinner = Class.extend({
        init: function (element, options) {
            this.$input = $(element).find("input");
            this._initInput();
            this._initOptions(options);
            this._counter = null;
            this.setCounter(0);
            this._isValueSet = false;
            this._initButtons();
            this._initArrowKeys();
            this._initMouseWheel();
        },

        _initInput: function () {
            var self = this;
            this.$input
                .addClass("butter-component-number-input")
                .blur(function () {
                    self._setValueOnBlur();
                })
                .parent().addClass("input-group");
        },

        _initOptions: function (options) {
            var defaultOptions = {
                step: 1,
                disabled: false
            };
            this._options = $.extend({}, defaultOptions, options);

            // ensure that this values are numbers
            if (this._options.step !== undefined) {
                this._options.step = this._options.step * 1;
            }
            if (this._options.min !== undefined) {
                this._options.min = this._options.min * 1;
            }
            if (this._options.max !== undefined) {
                this._options.max = this._options.max * 1;
            }
        },

        _initButtons: function () {
            var $addon = $("<span>")
                .addClass("input-group-addon")
                .addClass("butter-component-number-buttons")
                .insertAfter(this.$input);

            var self = this;
            $("<span>")
                .addClass("glyphicon glyphicon-chevron-up")
                .addClass("butter-component-number-button")
                .addClass(function () {
                    return self._options.disabled ? "disabled" : "";
                })
                .click(function () {
                    if (!self._options.disabled) {
                        self.increaseCounter();
                    }
                })
                .appendTo($addon);

            $("<span>")
                .addClass("glyphicon glyphicon-chevron-down")
                .addClass("butter-component-number-button")
                .addClass(function () {
                    return self._options.disabled ? "disabled" : "";
                })
                .click(function () {
                    if (!self._options.disabled) {
                        self.decreaseCounter();
                    }
                })
                .appendTo($addon);
        },

        _initArrowKeys: function () {
            var self = this;
            this.$input.keydown(function (event) {
                if (event.which === 38) {
                    event.stopPropagation();
                    event.preventDefault();
                    self.increaseCounter();
                } else if (event.which === 40) {
                    event.stopPropagation();
                    event.preventDefault();
                    self.decreaseCounter();
                }
            });
        },

        _initMouseWheel: function () {
            var self = this;
            this.$input.on("mousewheel DOMMouseScroll", function (event) {
                if (!self.$input.is(':focus')) {
                    return;
                }

                var delta = event.originalEvent.wheelDelta || -event.originalEvent.deltaY || -event.originalEvent.detail;

                event.stopPropagation();
                event.preventDefault();

                if (delta < 0) {
                    self.decreaseCounter();
                } else {
                    self.increaseCounter();
                }
            });
        },

        _setValueOnBlur: function () {
            var value = this.$input.val();
            if (this._isStringEmpty(value)) {
                this.$input.val("");
                this.setCounter(0);
                this._isValueSet = false;
            } else {
                var parsedInt = parseInt(value);
                if (isNaN(parsedInt)) {
                    if (this._isValueSet) {
                        this.$input.val(this._counter);
                    } else {
                        this.$input.val("");
                        this.setCounter(0);
                        this._isValueSet = false;
                    }
                } else {
                    this.setCounter(parsedInt);
                    this.$input.val(this._counter);
                    this._isValueSet = true;
                }
            }
        },

        increaseCounter: function () {
            if (this._isValueSet) {
                this.setCounter(this._counter + this._options.step);
            } else {
                this._isValueSet = true;
            }
            this.$input.val(this._counter);
            this.$input.change();
        },

        decreaseCounter: function () {
            if (this._isValueSet) {
                this.setCounter(this._counter - this._options.step);
            } else {
                this._isValueSet = true;
            }
            this.$input.val(this._counter);
            this.$input.change();
        },

        _isStringEmpty: function (value) {
            return (value.length === 0 || !value.trim());
        },

        setCounter: function (value) {
            if (this._options.min !== undefined && value < this._options.min) {
                this._counter = this._options.min;
            } else if (this._options.max !== undefined && value > this._options.max) {
                this._counter = this._options.max;
            } else {
                this._counter = value;
            }
        }
    });
}(jQuery));
if (typeof butter === 'undefined') {
    butter = {};
}
butter.prettyprint = {};

/**
 * calls pretty print javascript framework and removes first and last empty children.
 */
butter.prettyprint.cleanup = function() {
    prettyPrint();

    jQuery('.butter-component-prettyprint').each(function () {
        var $firstPreChild = jQuery(this).find("pre span").first();
        var $lastPreChild = jQuery(this).find("pre span").last();


        if (!(typeof $firstPreChild.html() === "undefined")) {
            if (!$firstPreChild.html().trim()) {
                $firstPreChild.remove();
            }
        }
        if (!(typeof $lastPreChild.html() === "undefined")) {
            if (!$lastPreChild.html().trim()) {
                $lastPreChild.remove();
            }
        }
    });
};
/**
 * How to use:
 * jQuery("#someSelector").scrollToFirst() or jQuery("#someSelector").scrollToLast();
 */
(function ($) {
    // extend jQuery --------------------------------------------------------------------
    $.fn.butterScrollToFirst = function (/* int */ offset) {
        void 0;
        var _offset = offset === undefined ? $(this).first().offset().top : $(this).first().offset().top + offset;
        $('html, body').animate({scrollTop: _offset + 'px'}, 'fast');
    };

    $.fn.butterScrollToLast = function (/* int */ offset) {
        void 0;
        var _offset = offset === undefined ? $(this).last().offset().top : $(this).last().offset().top + offset;
        $('html, body').animate({scrollTop: _offset + 'px'}, 'fast');
    };
}(jQuery));
/**
 * jQuery-Plugin to handle selection style classes on JSF-Component "b:table".
 * Works with at least jQuery 1.3.2.
 *
 * How to use:
 * jQuery("#someTreeSelector").selectRow( {rowIndex: '6'} );
 */
(function ($) {
    // extend jQuery --------------------------------------------------------------------
    $.fn.toggleColumnVisibilty = function (renderIds, disableRenderIds) {

        return this.each(function () {
            var $toolbar = $(this);

            var json = JSON.stringify(createColumnVisibilty($toolbar));
            ButterFaces.Ajax.sendRequest($toolbar.attr('id'), 'toggle', renderIds, json, disableRenderIds);
        });

        function createColumnVisibilty($toolbar) {
            var columns = [];

            $toolbar.find('.butter-table-toolbar-column-option input[type=checkbox]').each(function (index, checkbox) {
                var $checkbox = $(checkbox).parent('.butter-table-toolbar-column-option');
                columns.push({
                    identifier: $checkbox.attr('data-column-model-identifier'),
                    visible: $checkbox.find('input[type=checkbox]').is(':checked')
                });
            });

            return columns;
        }
    };

    $.fn.orderColumn = function (renderIds, disableRenderIds, toLeft, columnNumber) {

        return this.each(function () {
            var $toolbar = $(this);

            if (toLeft) {
                //console.log('order column ' + columnNumber + ' to left');
                orderColumnLeft($toolbar, columnNumber);
            } else {
                //console.log('order column ' + columnNumber + ' to right');
                orderColumnRight($toolbar, columnNumber);
            }

            var json = JSON.stringify(createColumnOrder($toolbar));
            ButterFaces.Ajax.sendRequest($toolbar.attr('id'), 'order', renderIds, json, disableRenderIds);
        });

        function createColumnOrder($toolbar) {
            var columns = [];

            $toolbar.find('.butter-table-toolbar-column-option input[type=checkbox]').each(function (index, checkbox) {
                var $checkbox = $(checkbox).parent('.butter-table-toolbar-column-option');
                columns.push({
                    identifier: $checkbox.attr('data-column-model-identifier'),
                    position: index
                });
            });

            return columns;
        }

        function orderColumnLeft(/* jquery toolbar */ $toolbar, columnNumber) {
            //console.log($toolbar);

            var $column = $toolbar.find('li[data-original-column="' + columnNumber + '"]');
            var $nextColumn = $column.prev();

            //console.log($column);
            //console.log($nextColumn);

            var $detachtedColumn = $column.detach();
            $nextColumn.before($detachtedColumn);
        }

        function orderColumnRight(/* jquery toolbar */ $toolbar, columnNumber) {
            //console.log($toolbar);

            var $column = $toolbar.find('li[data-original-column="' + columnNumber + '"]');
            var $nextColumn = $column.next();

            //console.log($column);
            //console.log($nextColumn);

            var $detachtedColumn = $column.detach();
            $nextColumn.after($detachtedColumn);
        }
    };
}(jQuery));
(function ($) {

    $.fn._butterTagsInit = function () {
        var root = $(this);

        var _tagBoxWrapper = root.find('.tr-input-wrapper');
        _tagBoxWrapper.addClass("form-control");
    };

}(jQuery));
(function ($) {

    $.fn._butterTooltip = function (/* object */ data) {
        var root = $(this);

        //console.log(data);

        var content = jQuery('[name=' + data.contentByName + ']');

        var newData = {
            trigger: data.trigger,
            title: data.title,
            placement: data.placement,
            placementFunction: data.placementFunction,
            minVerticalOffset: data.minVerticalOffset,
            minHorizontalOffset: data.minHorizontalOffset,
            content: content.html().trim()
        };

        //console.log(newData);

        content.remove();

        root.butterTooltip(newData);
    };

    $.fn.butterTooltip = function (/* object */ data) {
        return this.each(function () {
            var root = $(this);
            var tooltip = new ButterFaces.Tooltip();
            var trigger = data.trigger ? data.trigger : 'hover';

            //console.log(data);
            //console.log('placement: ' + placement);
            //console.log('trigger: ' + trigger);
            //console.log('viewport: ' + data.viewport);

            if (data.minVerticalOffset) {
                root.attr('data-tooltip-min-vertical-offset', data.minVerticalOffset);
            }
            if (data.minHorizontalOffset) {
                root.attr('data-tooltip-min-horizontal-offset', data.minHorizontalOffset);
            }
            if (root.next().hasClass('popover')) {
                root.next().remove();
            }


            root.popover({
                trigger: trigger,
                placement: function(popover, source) {
                    return data.placement ? data.placement : (data.placementFunction ? data.placementFunction : new ButterFaces.Tooltip().calculateTooltipPosition(popover, source));
                },
                title: data.title,
                html: 'true',
                content: data.content,
                viewport: data.viewport
            });
        });
    };
}(jQuery));