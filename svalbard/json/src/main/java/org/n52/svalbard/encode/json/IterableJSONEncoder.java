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
package org.n52.svalbard.encode.json;

import org.n52.svalbard.encode.exception.EncodingException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;

/**
 * TODO JavaDoc
 *
 * @author Christian Autermann
 */
public class IterableJSONEncoder extends JSONEncoder<Iterable<?>> {

    public IterableJSONEncoder() {
        super(Iterable.class);
    }

    @Override
    public JsonNode encodeJSON(Iterable<?> iterable)
            throws EncodingException {
        ArrayNode node = nodeFactory().arrayNode();
        for (Object t : iterable) {
            node.add(encodeObjectToJson(t));
        }
        return node;
    }

}
