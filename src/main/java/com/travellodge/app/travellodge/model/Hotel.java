package com.travellodge.app.travellodge.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Hotel {
    @Id
    @GeneratedValue
    private long hotelId;
    private String name;
    private String location;
    private String noOfRooms;
    private String address;
    private String telephone;
    private String NoOfVipRooms;
    private String NoOfSuits;

    public long getHotelId() {
        return hotelId;
    }

    public void setHotelId(long hotelId) {
        this.hotelId = hotelId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(String noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNoOfVipRooms() {
        return NoOfVipRooms;
    }

    public void setNoOfVipRooms(String noOfVipRooms) {
        NoOfVipRooms = noOfVipRooms;
    }

    public String getNoOfSuits() {
        return NoOfSuits;
    }

    public void setNoOfSuits(String noOfSuits) {
        NoOfSuits = noOfSuits;
    }
}
