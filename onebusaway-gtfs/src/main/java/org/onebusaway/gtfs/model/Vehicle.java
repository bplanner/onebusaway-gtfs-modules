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
import org.onebusaway.gtfs.serialization.mappings.EntityFieldMappingFactory;

/**
 * @author Zsombor Welker <zsombor.welker@webvalto.hu>
 */
@CsvFields(filename = "vehicles.txt", required = false, prefix = "vehicle_")
public class Vehicle extends IdentityBean<AgencyAndId> {

    @CsvField(mapping = DefaultAgencyIdFieldMappingFactory.class)
    private AgencyAndId id;

    @CsvField(optional = true)
    private String extCode;

    private String licensePlate;

    private int routeType;

    @CsvField(optional = true)
    private String model;

    @CsvField(optional = true)
    private int capacity;

    @CsvField(optional = true)
    private String phoneNumber;

    @CsvField(optional = true, name = "vehicle_depot_stop_id", mapping = EntityFieldMappingFactory.class)
    private Stop depotStop;

    @CsvField(optional = true)
    private int wheelchairAccessible;

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getRouteType() {
        return routeType;
    }

    public void setRouteType(int routeType) {
        this.routeType = routeType;
    }

    public String getExtCode() {
        return extCode;
    }

    public void setExtCode(String extCode) {
        this.extCode = extCode;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Stop getDepotStop() {
        return depotStop;
    }

    public void setDepotStop(Stop depotStop) {
        this.depotStop = depotStop;
    }

    public int getWheelchairAccessible() {
        return wheelchairAccessible;
    }

    public void setWheelchairAccessible(int wheelchairAccessible) {
        this.wheelchairAccessible = wheelchairAccessible;
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
