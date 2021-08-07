package com.smc.flightreservation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Reservation extends AbstractEntity {

    @Column(name = "CHECKED_IN")
    private boolean checkedIn;
    @Column(name = "NUMBER_OF_BAGS")
    private Integer numberOfBags;
    @OneToOne
    @JoinColumn(name = "PASSENGER_ID")
    private Passenger passenger;
    @OneToOne
    @JoinColumn(name = "FLIGHT_ID")
    private Flight flight;


    public boolean isCheckedIn() {
        return checkedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        this.checkedIn = checkedIn;
    }

    public Integer getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(Integer numberOfBags) {
        this.numberOfBags = numberOfBags;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }
}
