package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class UserSchedule {
    public int Id;
    public String FromStreet;
    public String FromArea;
    public String ToStreet;
    public String ToArea;
    public String EndTime;
    public String StartTime;
    public String Days;
    public int UserId;
    public ArrayList<UserInfo> Users;

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getStartTime() {
        return StartTime;
    }

    public void setStartTime(String startTime) {
        StartTime = startTime;
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

    public String getEndTime() {
        return EndTime;
    }

    public void setEndTime(String endTime) {
        EndTime = endTime;
    }

    public String getDays() {
        return Days;
    }

    public void setDays(String days) {
        Days = days;
    }

    public ArrayList<UserInfo> getUsers() {
        return Users;
    }

    public void setUsers(ArrayList<UserInfo> users) {
        Users = users;
    }
}
