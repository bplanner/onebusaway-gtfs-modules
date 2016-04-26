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
import org.onebusaway.gtfs.model.calendar.ServiceDate;
import org.onebusaway.gtfs.serialization.mappings.EntityFieldMappingFactory;
import org.onebusaway.gtfs.serialization.mappings.ServiceDateFieldMappingFactory;

@CsvFields(filename = "driver_vehicle_assignment.txt", required = false)
public class DriverVehicleAssignment extends IdentityBean<Integer> {

    @CsvField(ignore = true)
    private int id;

    @CsvField(optional = true, mapping = ServiceDateFieldMappingFactory.class)
    private ServiceDate date;

    @CsvField(name = "trip_id", mapping = EntityFieldMappingFactory.class)
    private Trip trip;

    @CsvField(optional = true, name = "driver_id", mapping = EntityFieldMappingFactory.class)
    private Driver driver;

    @CsvField(optional = true, name = "vehicle_id", mapping = EntityFieldMappingFactory.class)
    private Vehicle vehicle;

    public ServiceDate getDate() {
        return date;
    }

    public void setDate(ServiceDate date) {
        this.date = date;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    /****
     * {@link IdentityBean} Interface
     ****/

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }
}
