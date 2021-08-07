package com.smc.flightreservation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.sql.Timestamp;

@Entity
public class Flight extends AbstractEntity{

    @Column(name = "FLIGHT_NUMBER")
    private String flightNumber;
    @Column(name = "OPERATING_AIRLINES")
    private String operatingAirlines;
    @Column(name = "DEPARTURE_CITY")
    private String departureCity;
    @Column(name = "ARRIVAL_CITY")
    private String arrivalCity;
    @Column(name = "DATE_OF_DEPARTURE")
    private String dayOfDeparture;
    @Column(name = "ESTIMATED_DEPARTURE_TIME")
    private Timestamp estimatedDeparture;


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDayOfDeparture() {
        return dayOfDeparture;
    }

    public void setDayOfDeparture(String dayOfDeparture) {
        this.dayOfDeparture = dayOfDeparture;
    }

    public Timestamp getEstimatedDeparture() {
        return estimatedDeparture;
    }

    public void setEstimatedDeparture(Timestamp estimatedDeparture) {
        this.estimatedDeparture = estimatedDeparture;
    }
}
