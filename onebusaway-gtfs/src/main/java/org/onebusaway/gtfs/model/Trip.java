/**
 * Copyright (C) 2011 Brian Ferris <bdferris@onebusaway.org>
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
import org.onebusaway.gtfs.serialization.mappings.TripAgencyIdFieldMappingFactory;

@CsvFields(filename = "trips.txt")
public final class Trip extends IdentityBean<AgencyAndId> {

  private static final long serialVersionUID = 1L;

  @CsvField(name = "trip_id", mapping = TripAgencyIdFieldMappingFactory.class)
  private AgencyAndId id;

  @CsvField(name = "route_id", mapping = EntityFieldMappingFactory.class, order = -1)
  private Route route;

  @CsvField(mapping = DefaultAgencyIdFieldMappingFactory.class)
  private AgencyAndId serviceId;

  @CsvField(optional = true)
  private String tripShortName;

  @CsvField(optional = true)
  private String tripHeadsign;

  @CsvField(optional = true)
  private String routeShortName;

  @CsvField(optional = true)
  private String directionId;

  @CsvField(optional = true)
  private String blockId;

  @CsvField(optional = true, mapping = DefaultAgencyIdFieldMappingFactory.class)
  private AgencyAndId shapeId;

  @CsvField(optional = true, defaultValue = "0")
  private int wheelchairAccessible = 0;

  @Deprecated
  @CsvField(optional = true, defaultValue = "0")
  private int tripBikesAllowed = 0;

  // GTFS-IVU összerendeléshez
  @CsvField(optional = true)
  private String extTripId_fpId;
  @CsvField(optional = true)
  private String extTripId_wul;
  @CsvField(optional = true)
  private String extTripId_lfdNr;
  @CsvField(optional = true)
  private String extTripId_kurs;
  @CsvField(optional = true)
  private String extTripId;

  /**
   * 0 = unknown / unspecified, 1 = bikes allowed, 2 = bikes NOT allowed
   */
  @CsvField(optional = true, defaultValue = "0")
  private int bikesAllowed = 0;

  public Trip() {

  }

  public Trip(Trip obj) {
    this.id = obj.id;
    this.route = obj.route;
    this.serviceId = obj.serviceId;
    this.tripShortName = obj.tripShortName;
    this.tripHeadsign = obj.tripHeadsign;
    this.routeShortName = obj.routeShortName;
    this.directionId = obj.directionId;
    this.blockId = obj.blockId;
    this.shapeId = obj.shapeId;
    this.wheelchairAccessible = obj.wheelchairAccessible;
    this.tripBikesAllowed = obj.tripBikesAllowed;
    this.bikesAllowed = obj.bikesAllowed;
  }

  public AgencyAndId getId() {
    return id;
  }

  public void setId(AgencyAndId id) {
    this.id = id;
  }

  public Route getRoute() {
    return route;
  }

  public void setRoute(Route route) {
    this.route = route;
  }

  public AgencyAndId getServiceId() {
    return serviceId;
  }

  public void setServiceId(AgencyAndId serviceId) {
    this.serviceId = serviceId;
  }

  public String getTripShortName() {
    return tripShortName;
  }

  public void setTripShortName(String tripShortName) {
    this.tripShortName = tripShortName;
  }

  public String getTripHeadsign() {
    return tripHeadsign;
  }

  public void setTripHeadsign(String tripHeadsign) {
    this.tripHeadsign = tripHeadsign;
  }

  public String getRouteShortName() {
    return routeShortName;
  }

  public void setRouteShortName(String routeShortName) {
    this.routeShortName = routeShortName;
  }

  public String getDirectionId() {
    return directionId;
  }

  public void setDirectionId(String directionId) {
    this.directionId = directionId;
  }

  public String getBlockId() {
    return blockId;
  }

  public void setBlockId(String blockId) {
    this.blockId = blockId;
  }

  public AgencyAndId getShapeId() {
    return shapeId;
  }

  public void setShapeId(AgencyAndId shapeId) {
    this.shapeId = shapeId;
  }

  public void setWheelchairAccessible(int wheelchairAccessible) {
    this.wheelchairAccessible = wheelchairAccessible;
  }

  public int getWheelchairAccessible() {
    return wheelchairAccessible;
  }

  @Deprecated
  public void setTripBikesAllowed(int tripBikesAllowed) {
    this.tripBikesAllowed = tripBikesAllowed;
  }

  @Deprecated
  public int getTripBikesAllowed() {
    return tripBikesAllowed;
  }

  /**
   * @return 0 = unknown / unspecified, 1 = bikes allowed, 2 = bikes NOT allowed
   */
  public int getBikesAllowed() {
    return bikesAllowed;
  }

  /**
   * @param bikesAllowed 0 = unknown / unspecified, 1 = bikes allowed, 2 = bikes
   *          NOT allowed
   */
  public void setBikesAllowed(int bikesAllowed) {
    this.bikesAllowed = bikesAllowed;
  }

  public String getExtTripId_fpId() {
    return extTripId_fpId;
  }

  public void setExtTripId_fpId(String extTripId_fpId) {
    this.extTripId_fpId = extTripId_fpId;
  }

  public String getExtTripId_wul() {
    return extTripId_wul;
  }

  public void setExtTripId_wul(String extTripId_wul) {
    this.extTripId_wul = extTripId_wul;
  }

  public String getExtTripId_lfdNr() {
    return extTripId_lfdNr;
  }

  public void setExtTripId_lfdNr(String extTripId_lfdNr) {
    this.extTripId_lfdNr = extTripId_lfdNr;
  }

  public String getExtTripId() {
    return extTripId;
  }

  public void setExtTripId(String extTripId) {
    this.extTripId = extTripId;
  }

  public String getExtTripId_kurs() {
    return extTripId_kurs;
  }

  public void setExtTripId_kurs(String extTripId_kurs) {
    this.extTripId_kurs = extTripId_kurs;
  }


  public String toString() {
    return "<Trip " + getId() + ">";
  }

}
