package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class RideSchedule extends BaseModel {
    public String ScheduleDate;
    public String StartTime;
    public String EndTime;
    public String FromStreet;
    public String FromArea;
    public String ToStreet;
    public String ToArea;
    public int MaxPassenger;
    public String PrefferedGender;
    public String Status;

    public String Location;
    //    [NotMapped]
//    public string Latitude ;
//    [NotMapped]
//    public string Longitude ;
    public ArrayList<RideDetails> Ridedetails;
    public UserInfo Users;

    public ArrayList<RideDetails> getRidedetails() {
        return Ridedetails;
    }

    public void setRidedetails(ArrayList<RideDetails> ridedetails) {
        Ridedetails = ridedetails;
    }

    public String getScheduleDate() {
        return ScheduleDate;
    }

    public void setScheduleDate(String scheduleDate) {
        ScheduleDate = scheduleDate;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
    }

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getFromStreet() {
        return FromStreet;
    }

    public void setFromStreet(String fromStreet) {
        FromStreet = fromStreet;
    }

    public String getFromArea() {
        return FromArea;
    }

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

    public int getMaxPassenger() {
        return MaxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        MaxPassenger = maxPassenger;
    }

    public String getPrefferedGender() {
        return PrefferedGender;
    }

    public void setPrefferedGender(String prefferedGender) {
        PrefferedGender = prefferedGender;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public UserInfo getUsers() {
        return Users;
    }

    public void setUsers(UserInfo users) {
        Users = users;
    }
}
