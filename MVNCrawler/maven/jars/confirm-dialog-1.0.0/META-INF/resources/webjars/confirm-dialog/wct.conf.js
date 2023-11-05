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
var envIndex = process.argv.indexOf('--env') + 1;
var env = envIndex ? process.argv[envIndex] : undefined;

module.exports = {
    testTimeout: 180 * 1000,
    verbose: true,
    plugins: {
        local: {
            browsers: ["chrome"],
            browserOptions: {
                chrome: [
                    'headless',
                    'disable-gpu',
                    'no-sandbox'
                ]
            }
        }
    }
};
