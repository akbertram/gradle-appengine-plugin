/*
 * Copyright 2011 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.appengine.task.appcfg

/**
 * Google App Engine task updating cron definition on the server.
 *
 * @see <a href="http://code.google.com/appengine/docs/java/tools/uploadinganapp.html#Managing_Scheduled_Tasks">Documentation</a>
 * @author Benjamin Muschko
 */
class UpdateCronTask extends AppConfigTaskTemplate {
    static final String COMMAND = 'update_cron'

    @Override
    String startLogMessage() {
        'Starting updating scheduled tasks...'
    }

    @Override
    String errorLogMessage() {
        'An error occurred updating scheduled tasks.'
    }

    @Override
    String finishLogMessage() {
        'Finished updating scheduled tasks.'
    }

    @Override
    List getParams() {
        [COMMAND, getWebAppSourceDirectory().canonicalPath]
    }
}