/*
 *
 * Copyright © 2018 Webvalto Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
window.Uibuilder = window.Uibuilder || {};
window.Uibuilder.i18n = window.Uibuilder.i18n || {};
window.Uibuilder.i18n.messages = window.Uibuilder.i18n.messages || {};
window.Uibuilder.i18n.mergeMessages = function (messages) {
    for (let componentName in messages) {
        window.Uibuilder.i18n.messages[componentName] = messages[componentName];
    }
};

/**
 *
 * A base mixin which provides a few i18n related methods.
 *
 * @param componentName The id of the component.
 *                      Must match the path of the translation files as in: `translations/<component-id>/base.pot`.
 *                      You can set this in the `pom.xml` of the module.
 * @param superClass
 *
 * @returns {{new(): UIBuilderI18NBaseMixin, prototype: UIBuilderI18NBaseMixin}}
 * @constructor
 */
Uibuilder.I18NBaseMixin = (componentName, superClass) => class UIBuilderI18NBaseMixin extends superClass {

    constructor() {
        super();
    }

    _formatString(fmt, args) {
        return fmt.replace(/{(\d+)}/g, function (str, p1) {
            return args[p1];
        });
    };

    tr(msgid /* , extra */) {
        let extraArgs = Array.prototype.slice.call(arguments, 1);
        let formatString = this._findFormatStringForMessageAndContext('_NO_CONTEXT_', msgid);
        return this._formatString(formatString, extraArgs)
    }

    trc(msgctx, msgid /* , extra */) {
        let extraArgs = Array.prototype.slice.call(arguments, 2);
        let formatString = this._findFormatStringForMessageAndContext(msgctx, msgid);
        return this._formatString(formatString, extraArgs)
    }

    trfp(msgid, msgidPlural, itemCount /* , extra */) {
        let extraArgs = Array.prototype.slice.call(arguments, 3);
        let formatString = this._findFormatStringForPluralMessageAndContext('_NO_CONTEXT_', msgid, msgidPlural, itemCount);
        return this._formatString(formatString, extraArgs)
    }

    trfpc(msgctx, msgid, msgidPlural, itemCount /* , extra */) {
        let extraArgs = Array.prototype.slice.call(arguments, 4);
        let formatString = this._findFormatStringForPluralMessageAndContext(msgctx, msgid, msgidPlural, itemCount);
        return this._formatString(formatString, extraArgs)
    }

    _findFormatStringForMessageAndContext(msgctx, msgid) {
        let formatString = undefined;
        if (window.Uibuilder.i18n.messages[componentName]) {
            if (window.Uibuilder.i18n.messages[componentName][msgctx]) {
                if (window.Uibuilder.i18n.messages[componentName][msgctx][msgid]) {
                    formatString = window.Uibuilder.i18n.messages[componentName][msgctx][msgid];
                    if ('object' === typeof formatString) {
                        formatString = formatString[0]
                    } else if ('string' !== typeof formatString) {
                        throw new Error(this._formatString('Msgid "{0}" is not a valid translatable string', msgid));
                    }
                }
            }
        }
        if (formatString === undefined) {
            formatString = msgid;
        }
        return formatString;
    }

    _findFormatStringForPluralMessageAndContext(msgctx, msgid, msgidPlural, itemCount) {
        let formatString = undefined;
        if (window.Uibuilder.i18n.messages[componentName]) {
            if (window.Uibuilder.i18n.messages[componentName][msgctx]) {
                if (window.Uibuilder.i18n.messages[componentName][msgctx][msgid]) {
                    formatString = window.Uibuilder.i18n.messages[componentName][msgctx][msgid];
                    if ('object' === typeof formatString) {
                        let translationLenght = formatString.length;
                        let correctIdx = Math.min(itemCount, translationLenght) - 1;
                        if (correctIdx < 0) {
                            correctIdx = translationLenght - 1;
                        }
                        formatString = formatString[correctIdx]
                    } else if ('string' !== typeof formatString) {
                        throw new Error(this._formatString('Msgid "{0}" is not a valid translatable string', msgid));
                    }
                }
            }
        }
        if (formatString === undefined) {
            if (itemCount === 1) {
                formatString = msgid;
            } else {
                formatString = msgidPlural;
            }
        }
        return formatString;
    }
};

export const I18NBaseMixin = Uibuilder.I18NBaseMixin;
