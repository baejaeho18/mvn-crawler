var ButterFaces;
(function (ButterFaces) {
    var Guid = (function () {
        function Guid() {
        }
        Guid.newGuid = function () {
            return 'xxxxxxxx-xxxx-xxxx-yxxx-xxxxxxxxxxxx'.replace(/[xy]/g, function (c) {
                var r = Math.random() * 16 | 0, v = c == 'x' ? r : (r & 0x3 | 0x8);
                return v.toString(16);
            });
        };
        return Guid;
    })();
    ButterFaces.Guid = Guid;
})(ButterFaces || (ButterFaces = {}));

///<reference path="definitions/external/tsd.d.ts"/>
///<reference path="butterfaces-guid.ts"/>
var ButterFaces;
(function (ButterFaces) {
    var Overlay = (function () {
        function Overlay(delay, isTransparentBlockingOverlayActive, selector) {
            if (delay === void 0) { delay = 500; }
            if (isTransparentBlockingOverlayActive === void 0) { isTransparentBlockingOverlayActive = true; }
            if (selector === void 0) { selector = 'body'; }
            this.isHiding = true;
            this.delay = delay;
            this.isTransparentBlockingOverlayActive = isTransparentBlockingOverlayActive;
            this.selector = selector;
            void 0;
        }
        Overlay.prototype.show = function () {
            var _this = this;
            var $elementsToDisable = $(this.selector);
            ButterFaces.Overlay.fadeOutDetachtedOverlays();
            $elementsToDisable.each(function (index, elementToDisable) {
                var $elementToDisable = $(elementToDisable);
                _this.isHiding = false;
                if ($elementToDisable.attr('data-overlay-uuid') !== undefined) {
                    if (ButterFaces.Overlay.findOverlay($elementToDisable.attr('data-overlay-uuid')).length > 0) {
                        void 0;
                        return;
                    }
                    else {
                        $elementToDisable.removeAttr('data-overlay-uuid');
                    }
                }
                void 0;
                var uuid = ButterFaces.Guid.newGuid();
                var $overlay = $('<div class="butter-component-overlay" data-overlay-uuid="' + uuid + '"><div class="butter-component-spinner"><div></div><div></div><div></div><div></div></div></div>');
                $elementToDisable.attr('data-overlay-uuid', uuid);
                if (_this.selector === 'body') {
                    $overlay.addClass('overlay-body');
                }
                else {
                    // TODO if blockpage is true set it to max size
                    $overlay.offset($elementToDisable.offset())
                        .width($elementToDisable.outerWidth())
                        .height($elementToDisable.outerHeight())
                        .addClass('overlay-body-child')
                        .css({ 'position': 'absolute' }); // IE overrides css position so set it here
                }
                $('body').append($overlay);
                if (_this.isTransparentBlockingOverlayActive) {
                    void 0;
                    $overlay.show();
                }
                window.setTimeout(function () {
                    if (!_this.isHiding && !_this.isTransparentBlockingOverlayActive) {
                        void 0;
                        $overlay.show();
                    }
                    if (!_this.isHiding) {
                        void 0;
                        $overlay
                            .stop(true)
                            .animate({
                            opacity: 1
                        }, 300, function () {
                            void 0;
                        });
                    }
                }, _this.delay);
                //}
            });
        };
        Overlay.prototype.hide = function () {
            void 0;
            var $elementsToDisable = $(this.selector);
            this.isHiding = true;
            ButterFaces.Overlay.fadeOutDetachtedOverlays();
            $elementsToDisable.each(function (index, elementToDisable) {
                var $elementToDisable = $(elementToDisable);
                var overlayUuid = $elementToDisable.attr('data-overlay-uuid');
                if (overlayUuid !== undefined && ButterFaces.Overlay.findOverlay(overlayUuid).length > 0) {
                    var $overlay = ButterFaces.Overlay.findOverlay($elementToDisable.attr('data-overlay-uuid'));
                    ButterFaces.Overlay.fadeOutOverlay($overlay);
                }
            });
        };
        Overlay.hideAll = function () {
            void 0;
            ButterFaces.Overlay.fadeOutDetachtedOverlays();
            ButterFaces.Overlay.fadeOutAttachtedOverlays();
        };
        Overlay.fadeOutDetachtedOverlays = function () {
            // remove unbinded elements
            $('.butter-component-overlay').each(function (index, elementToCheck) {
                var $overlay = $(elementToCheck);
                var uuidToCheck = $(elementToCheck).attr('data-overlay-uuid');
                if ($('[data-overlay-uuid=' + uuidToCheck + ']').length == 1) {
                    ButterFaces.Overlay.fadeOutOverlay($overlay);
                }
            });
        };
        ;
        Overlay.fadeOutAttachtedOverlays = function () {
            // remove binded elements
            $('.butter-component-overlay').each(function (index, elementToCheck) {
                var $overlay = $(elementToCheck);
                var uuidToCheck = $(elementToCheck).attr('data-overlay-uuid');
                var elements = $('[data-overlay-uuid=' + uuidToCheck + ']');
                if (elements.length > 1) {
                    ButterFaces.Overlay.fadeOutOverlay($overlay);
                    elements.each(function (index, element) {
                        var $element = $(element);
                        $element.removeAttr('data-overlay-uuid');
                    });
                }
            });
        };
        ;
        Overlay.fadeOutOverlay = function ($overlay) {
            $overlay
                .stop(true)
                .animate({
                opacity: 0
            }, 300, function () {
                $overlay.remove();
                void 0;
            });
        };
        ;
        Overlay.findOverlay = function (uuid) {
            return $("body .butter-component-overlay[data-overlay-uuid='" + uuid + "']");
        };
        return Overlay;
    })();
    ButterFaces.Overlay = Overlay;
})(ButterFaces || (ButterFaces = {}));

///<reference path="definitions/external/tsd.d.ts"/>
///<reference path="butterfaces-overlay.ts"/>
var ButterFaces;
(function (ButterFaces) {
    var Ajax = (function () {
        function Ajax() {
        }
        Ajax.sendRequest = function (clientId, event, renderIds, /*optional string */ params, disableRenderIds) {
            jsf.ajax.request(clientId, event, {
                "javax.faces.behavior.event": event,
                render: renderIds.join(", "),
                params: params,
                onevent: (function (data) {
                    //console.log(data);
                    if (disableRenderIds) {
                        ButterFaces.Ajax.disableElementsOnRequest(data, renderIds);
                    }
                })
            });
        };
        ;
        Ajax.disableElementsOnRequest = function (data, ids) {
            var status = data.status;
            // console.log(data);
            // console.log(ids);
            switch (status) {
                case "begin":
                    // console.log('ajax request begin');
                    for (var i = 0; i < ids.length; i++) {
                        var $elementToDisable = $(document.getElementById(ids[i]));
                        if ($elementToDisable.length !== 0) {
                            //console.log('disable ' + ids[i]);
                            new ButterFaces.Overlay(0, false, document.getElementById(ids[i])).show();
                        }
                    }
                    break;
                case "complete":
                    // console.log('ajax request complete');
                    break;
                case "success":
                    // console.log('ajax request success');
                    for (i = 0; i < ids.length; i++) {
                        var $elementToEmable = $(document.getElementById(ids[i]));
                        if ($elementToEmable.length !== 0) {
                            //console.log('enable ' + ids[i]);
                            new ButterFaces.Overlay(0, false, document.getElementById(ids[i])).hide();
                        }
                    }
                    break;
            }
        };
        ;
        return Ajax;
    })();
    ButterFaces.Ajax = Ajax;
})(ButterFaces || (ButterFaces = {}));

var ButterFaces;
(function (ButterFaces) {
    var CommandLink = (function () {
        function CommandLink() {
        }
        /**
         * Submit given form.
         * @param formId the target form id to submit
         * @param params a list of params to be added to form as hidden input fields
         * @param target the target of the form submission
         */
        CommandLink.submitForm = function (formId, params, target) {
            var form = document.getElementById(formId);
            ButterFaces.CommandLink.addParametersAsHiddenFieldsToForm(form, params);
            var oldFormTarget = ButterFaces.CommandLink.setFormTarget(form, target);
            if (form.onsubmit) {
                var result = form.onsubmit();
                if ((typeof result == 'undefined') || result) {
                    form.submit();
                }
            }
            else {
                form.submit();
            }
            form.target = oldFormTarget;
            ButterFaces.CommandLink.removeHiddenFieldsFromForm(form);
        };
        CommandLink.addParametersAsHiddenFieldsToForm = function (form, params) {
            var bfHiddenInputFields = new Array();
            form.bfHiddenInputFields = bfHiddenInputFields;
            var i = 0;
            for (var k in params) {
                if (params.hasOwnProperty(k)) {
                    var p = document.createElement("input");
                    p.type = "hidden";
                    p.name = k;
                    p.value = params[k];
                    form.appendChild(p);
                    bfHiddenInputFields[i++] = p;
                }
            }
        };
        CommandLink.removeHiddenFieldsFromForm = function (form) {
            var bfHiddenInputFields = form.bfHiddenInputFields;
            if (bfHiddenInputFields !== null) {
                for (var i = 0; i < bfHiddenInputFields.length; i++) {
                    form.removeChild(bfHiddenInputFields[i]);
                }
            }
        };
        /**
         * Updates form target (if exists) and returns previous form target
         * @param form the torm to add the new target to
         * @param target the target to add (if not null)
         * @return the previous form target
         */
        CommandLink.setFormTarget = function (form, target) {
            var previousTarget = form.target;
            if (target) {
                form.target = target;
            }
            return previousTarget;
        };
        return CommandLink;
    })();
    ButterFaces.CommandLink = CommandLink;
})(ButterFaces || (ButterFaces = {}));

var ButterFaces;
(function (ButterFaces) {
    var String = (function () {
        function String() {
        }
        String.format = function (format) {
            var args = Array.prototype.slice.call(arguments, 1);
            return format.replace(/{(\d+)}/g, function (match, number) {
                return typeof args[number] != 'undefined' ? args[number] : match;
            });
        };
        ;
        return String;
    })();
    ButterFaces.String = String;
})(ButterFaces || (ButterFaces = {}));

///<reference path="definitions/external/jquery/jquery.d.ts"/>
///<reference path="butterfaces-util-string.ts"/>
(function ($) {
    $.fn.butterMaxLength = function (maxLength, maxLengthText) {
        var ERROR_STYLE_CLASS = "has-error";
        return this.each(function () {
            //console.log("initializing max length");
            var $root = $(this);
            var $valueElement = $root.find("textarea");
            var $maxLength = $root.find(".butter-component-maxlength-counter");
            if ($maxLength.length > 0) {
                //console.log("found max length element");
                var hasInitialValidationError = $root.hasClass(ERROR_STYLE_CLASS);
                var _checkValue = function () {
                    var value = $valueElement.val();
                    // console.log("checking value");
                    // console.log(value);
                    if (typeof value !== 'undefined') {
                        var freeLetterCount = maxLength - value.length;
                        var formatted = ButterFaces.String.format(maxLengthText, freeLetterCount, maxLength);
                        $maxLength.text(formatted);
                        if (!hasInitialValidationError) {
                            if (freeLetterCount < 0) {
                                $root.addClass(ERROR_STYLE_CLASS);
                            }
                            else {
                                $root.removeClass(ERROR_STYLE_CLASS);
                            }
                        }
                    }
                };
                $valueElement.on("focus blur keyup cut paste", _checkValue);
                // initial check
                _checkValue();
            }
        });
    };
}(jQuery));

///<reference path="definitions/external/tsd.d.ts"/>
(function ($) {
    // extend jQuery --------------------------------------------------------------------
    $.fn.multilinePlaceholder = function () {
        return this.each(function () {
            var $originalElement = $(this);
            var $textarea = $originalElement.find('textarea');
            var placeholder = $textarea.attr('placeholder');
            var multilinePlaceholder = placeholder.replace(/\\n/g, '\n');
            $textarea.attr('placeholder', multilinePlaceholder);
        });
    };
}(jQuery));

var ButterFaces;
(function (ButterFaces) {
    var RadioBox = (function () {
        function RadioBox() {
        }
        RadioBox.addStyleClassClickEvent = function (radioBoxId) {
            var radioBox = document.getElementById(radioBoxId);
            radioBox.addEventListener("change", function (event) {
                void 0;
                [].forEach.call(document.querySelectorAll('.radio'), function (el) {
                    void 0;
                    el.classList.remove("butter-radio-item-selected");
                });
                void 0;
                event.target.parentNode.classList.add("butter-radio-item-selected");
            });
        };
        return RadioBox;
    })();
    ButterFaces.RadioBox = RadioBox;
})(ButterFaces || (ButterFaces = {}));

///<reference path="definitions/external/tsd.d.ts"/>
///<reference path="butterfaces-ajax.ts"/>
(function ($) {
    $.fn.selectTableRow = function (data) {
        return this.each(function () {
            var $originalElement = $(this);
            void 0;
            void 0;
            $originalElement.find('tr').removeClass('butter-table-row-selected');
            var listItems = $originalElement.find('tr[rowindex=' + data.rowIndex + ']');
            $(listItems[listItems.length - 1]).addClass('butter-table-row-selected');
        });
    };
}(jQuery));
(function ($) {
    $.fn.sortTableRow = function (renderIds, disableRenderIds, columnNumber) {
        return this.each(function () {
            var $table = $(this);
            var rows = $table.find('tbody > tr').size();
            var columns = $table.find('thead th').size();
            ButterFaces.Ajax.sendRequest($table.attr('id'), 'sort_' + columnNumber, renderIds, columnNumber, disableRenderIds);
        });
    };
}(jQuery));

///<reference path="definitions/external/tsd.d.ts"/>
var ButterFaces;
(function (ButterFaces) {
    var Tooltip = (function () {
        function Tooltip(popoverMaxWidthByBootstrap, popoverMaxHeightByButterFaces) {
            if (popoverMaxWidthByBootstrap === void 0) { popoverMaxWidthByBootstrap = 276; }
            if (popoverMaxHeightByButterFaces === void 0) { popoverMaxHeightByButterFaces = 110; }
            this.popoverMaxWidthByBootstrap = popoverMaxWidthByBootstrap;
            this.popoverMaxHeightByButterFaces = popoverMaxHeightByButterFaces;
            void 0;
        }
        Tooltip.prototype.calculateTooltipPosition = function (popover, source) {
            var offsetBottom = $(window).height() - $(source).offset().top - $(source).outerHeight();
            var offsetRight = $(window).width() - $(source).offset().left - $(source).outerWidth();
            void 0;
            void 0;
            if (offsetBottom < this.popoverMaxHeightByButterFaces) {
                if (offsetRight < this.popoverMaxWidthByBootstrap) {
                    void 0;
                    if ($(source).offset().left < this.popoverMaxWidthByBootstrap) {
                        void 0;
                        return 'top';
                    }
                    void 0;
                    return 'left';
                }
                void 0;
                return 'right';
            }
            void 0;
            return 'bottom';
        };
        ;
        return Tooltip;
    })();
    ButterFaces.Tooltip = Tooltip;
})(ButterFaces || (ButterFaces = {}));

var ButterFaces;
(function (ButterFaces) {
    var TreeBox = (function () {
        function TreeBox() {
        }
        TreeBox.removeTrivialTreeDropDown = function (treeBoxId) {
            this.removeTrivialTreeDropDownById(treeBoxId);
            this.removeUnAssociatedTrivialTreeDropDowns();
        };
        TreeBox.removeUnAssociatedTrivialTreeDropDowns = function () {
            var dropdowns = document.querySelectorAll('.tr-dropdown[data-tree-box-id]');
            Array.prototype.slice.call(dropdowns, 0).forEach(function (dropdown) {
                var dropdownId = dropdown.getAttribute('data-tree-box-id');
                if (document.querySelectorAll('.butter-component-treebox[data-tree-box-id=' + dropdownId + ']').length == 0) {
                    dropdown.parentNode.removeChild(dropdown);
                }
            });
        };
        TreeBox.removeTrivialTreeDropDownById = function (treeBoxId) {
            // in jQuery: $('.tr-dropdown[data-tree-box-id=' + treeBoxId + ']').remove();
            // plain javascript:
            var dropdowns = document.querySelectorAll('.tr-dropdown[data-tree-box-id=' + treeBoxId + ']');
            Array.prototype.slice.call(dropdowns, 0).forEach(function (dropdown) {
                dropdown.parentNode.removeChild(dropdown);
            });
        };
        ;
        return TreeBox;
    })();
    ButterFaces.TreeBox = TreeBox;
})(ButterFaces || (ButterFaces = {}));

///<reference path="definitions/external/tsd.d.ts"/>
///<reference path="butterfaces-overlay.ts"/>
var ButterFaces;
(function (ButterFaces) {
    var WaitingPanel = (function () {
        function WaitingPanel(overlay) {
            this.overlay = overlay;
        }
        WaitingPanel.prototype.processAjaxUpdate = function () {
            var _this = this;
            var ajaxRequestsRunning = 0;
            return function (_a) {
                var status = _a.status;
                void 0;
                if (status == 'begin') {
                    ajaxRequestsRunning++;
                }
                else if (status == 'success') {
                    ajaxRequestsRunning--;
                }
                if (ajaxRequestsRunning > 0) {
                    void 0;
                    _this.overlay.show();
                }
                else {
                    void 0;
                    _this.overlay.hide();
                }
            };
        };
        WaitingPanel.prototype.processOnError = function (data) {
            if (data) {
                void 0;
                ButterFaces.Overlay.hideAll();
            }
        };
        return WaitingPanel;
    })();
    ButterFaces.WaitingPanel = WaitingPanel;
})(ButterFaces || (ButterFaces = {}));
(function ($) {
    // extend jQuery --------------------------------------------------------------------
    var eventRegistered = false;
    var overlay;
    $.fn.waitingPanel = function (_a) {
        var waitingPanelDelay = _a.waitingPanelDelay, blockpage = _a.blockpage;
        return this.each(function () {
            // I found no way to remove event listener from jsf js.
            // I tried to register a callback once and change it on render waiting panel but after this
            // no waiting panel appears anymore.
            // Actually on each rendering of this component a new callback is put on event listener collection.
            if (!eventRegistered) {
                //console.log('waitingPanel - register: ' + _elementId);
                overlay = new ButterFaces.Overlay(waitingPanelDelay, blockpage);
                var waitingPanel = new ButterFaces.WaitingPanel(overlay);
                jsf.ajax.addOnEvent(waitingPanel.processAjaxUpdate());
                jsf.ajax.addOnError(waitingPanel.processOnError);
                eventRegistered = true;
            }
            overlay.delay = waitingPanelDelay;
            overlay.isTransparentBlockingOverlayActive = blockpage;
        });
    };
}(jQuery));
