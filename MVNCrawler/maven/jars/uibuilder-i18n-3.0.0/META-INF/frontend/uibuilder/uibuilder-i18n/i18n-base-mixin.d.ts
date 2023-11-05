///
///
/// Copyright © 2018 Webvalto Ltd.
///
/// Licensed under the Apache License, Version 2.0 (the "License");
/// you may not use this file except in compliance with the License.
/// You may obtain a copy of the License at
///
///     http://www.apache.org/licenses/LICENSE-2.0
///
/// Unless required by applicable law or agreed to in writing, software
/// distributed under the License is distributed on an "AS IS" BASIS,
/// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
/// See the License for the specific language governing permissions and
/// limitations under the License.
///

import type { Constructor } from '@open-wc/dedupe-mixin';

export declare function I18NBaseMixin<T extends Constructor<HTMLElement>>(componentName: string, base: T): Constructor<I18NBaseMixinClass> & T;

export declare class I18NBaseMixinClass {

    protected tr(msgid: string, ...args): string;

    protected trc(msgctx: string, msgid: string, ...args): string;

    protected trfp(msgid: string, msgidPlural: string, itemCount: number, ...args): string;

    protected trfpc(msgctx: string, msgid: string, msgidPlural: string, itemCount: number, ...args): string;

}
