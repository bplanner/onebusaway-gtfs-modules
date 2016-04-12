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

/**
 * @author Zsombor Welker <zsombor.welker@webvalto.hu>
 */
@CsvFields(filename = "ivu_trip_ids.txt", required = false)
public class IvuTripId extends IdentityBean<Integer> {

    @CsvField(ignore = true)
    private int id;

    @CsvField(name = "trip_id", mapping = EntityFieldMappingFactory.class)
    private Trip trip;

    @CsvField(name = "date", mapping = ServiceDateFieldMappingFactory.class)
    private ServiceDate date;

    @CsvField(name = "ivu_date", mapping = ServiceDateFieldMappingFactory.class)
    private ServiceDate ivuDate;

    @CsvField(name = "ivu_trip_id")
    private String ivuTripId;

    @CsvField(name = "ivu_fp_id")
    private String ivuFpId;

    @CsvField(name = "ivu_wul")
    private String ivuWul;

    @CsvField(name = "ivu_lfd_id")
    private String ivuLfdId;

    @CsvField(name = "ivu_kurs_id")
    private String ivuKursId;

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public ServiceDate getDate() {
        return date;
    }

    public void setDate(ServiceDate date) {
        this.date = date;
    }

    public ServiceDate getIvuDate() {
        return ivuDate;
    }

    public void setIvuDate(ServiceDate ivuDate) {
        this.ivuDate = ivuDate;
    }

    public String getIvuTripId() {
        return ivuTripId;
    }

    public void setIvuTripId(String ivuTripId) {
        this.ivuTripId = ivuTripId;
    }

    public String getIvuFpId() {
        return ivuFpId;
    }

    public void setIvuFpId(String ivuFpId) {
        this.ivuFpId = ivuFpId;
    }

    public String getIvuWul() {
        return ivuWul;
    }

    public void setIvuWul(String ivuWul) {
        this.ivuWul = ivuWul;
    }

    public String getIvuLfdId() {
        return ivuLfdId;
    }

    public void setIvuLfdId(String ivuLfdId) {
        this.ivuLfdId = ivuLfdId;
    }

    public String getIvuKursId() {
        return ivuKursId;
    }

    public void setIvuKursId(String ivuKursId) {
        this.ivuKursId = ivuKursId;
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
