package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class PassengerSchedule extends BaseModel {

    public String FromStreet;
    public String FromArea;
    public String ToStreet;
    public String ToArea;
    public ArrayList<RideDetails> RideDetails;
    //    public DbGeography Location ;-
    public UserInfo Users;

    public String getFromArea() {
        return FromArea;
    }

//    public DbGeography getLocation() {
//        return Location;
//    }
//
//    public void setLocation( location) {
//        Location = location;DbGeography
//    }

    public void setFromArea(String fromArea) {
        FromArea = fromArea;
    }

    public String getToStreet() {
        return ToStreet;
    }

    public void setToStreet(String toStreet) {
        ToStreet = toStreet;
    }

    public String getToArea() {
        return ToArea;
    }

    public void setToArea(String toArea) {
        ToArea = toArea;
    }

    public ArrayList<com.ride.testingform.Model.RideDetails> getRideDetails() {
        return RideDetails;
    }

    public void setRideDetails(ArrayList<com.ride.testingform.Model.RideDetails> rideDetails) {
        RideDetails = rideDetails;
    }

    public UserInfo getUsers() {
        return Users;
    }

    public void setUsers(UserInfo users) {
        Users = users;
    }

    public String getFromStreet() {
        return FromStreet;
    }

    public void setFromStreet(String fromStreet) {
        FromStreet = fromStreet;
    }
}
