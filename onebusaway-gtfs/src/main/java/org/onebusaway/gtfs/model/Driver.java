/**
 * Copyright (C) 2016 Zsombor Welker <zsombor.welker@webvalto.hu>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.onebusaway.gtfs.model;

import org.onebusaway.csv_entities.schema.annotations.CsvField;
import org.onebusaway.csv_entities.schema.annotations.CsvFields;
import org.onebusaway.gtfs.serialization.mappings.DefaultAgencyIdFieldMappingFactory;

/**
 * @author Zsombor Welker <zsombor.welker@webvalto.hu>
 */
@CsvFields(filename = "drivers.txt", required = false, prefix = "driver_")
public class Driver extends IdentityBean<AgencyAndId> {

    @CsvField(mapping = DefaultAgencyIdFieldMappingFactory.class)
    private AgencyAndId id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /****
     * {@link IdentityBean} Interface
     ****/

    @Override
    public AgencyAndId getId() {
        return id;
    }

    @Override
    public void setId(AgencyAndId id) {
        this.id = id;
    }
}
