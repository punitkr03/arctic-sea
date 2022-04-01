/*
 * Copyright 2015-2022 52°North Initiative for Geospatial Open Source
 * Software GmbH
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.n52.iceland.coding.encode;

import org.n52.janmayen.component.ClassBasedComponentKey;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann
 */
public class ResponseWriterKey extends ClassBasedComponentKey<Object> {

    /**
     * Creates a new {@code ResponseWriterKey} for the specified {@code type}.
     *
     * @param type the type the writer associated with this key can handle
     */
    public ResponseWriterKey(Class<?> type) {
        super(type);
    }

}
