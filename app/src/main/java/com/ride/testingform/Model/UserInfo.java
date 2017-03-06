package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class UserInfo extends BaseModel {
    public Integer Id;
    public String Name;
    public String MobileNumber;
    public String CNIC;
    public String Gender;
    public String Address;
    public String UserImage;
    public String Email;
    public String OfficeBuilding;
    public String OfficeStreet;
    public String OfficeArea;
    public ArrayList<UserSchedule> UserSchedules;
    public ArrayList<PassengerSchedule> PassengerSchedules;
    public ArrayList<Order> Orders;
    public ArrayList<RideSchedule> RideSchedules;
    public ArrayList<UserVehicle> UserVehicles;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getCNIC() {
        return CNIC;
    }

    public void setCNIC(String CNIC) {
        this.CNIC = CNIC;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getUserImage() {
        return UserImage;
    }

    public void setUserImage(String userImage) {
        UserImage = userImage;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getOfficeBuilding() {
        return OfficeBuilding;
    }

    public void setOfficeBuilding(String officeBuilding) {
        OfficeBuilding = officeBuilding;
    }

    public String getOfficeStreet() {
        return OfficeStreet;
    }

    public void setOfficeStreet(String officeStreet) {
        OfficeStreet = officeStreet;
    }

    public String getOfficeArea() {
        return OfficeArea;
    }

    public void setOfficeArea(String officeArea) {
        OfficeArea = officeArea;
    }

    public ArrayList<UserSchedule> getUserSchedules() {
        return UserSchedules;
    }

    public void setUserSchedules(ArrayList<UserSchedule> userSchedules) {
        UserSchedules = userSchedules;
    }

    public ArrayList<PassengerSchedule> getPassengerSchedules() {
        return PassengerSchedules;
    }

    public void setPassengerSchedules(ArrayList<PassengerSchedule> passengerSchedules) {
        PassengerSchedules = passengerSchedules;
    }

    public ArrayList<Order> getOrders() {
        return Orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        Orders = orders;
    }

    public ArrayList<RideSchedule> getRideSchedules() {
        return RideSchedules;
    }

    public void setRideSchedules(ArrayList<RideSchedule> rideSchedules) {
        RideSchedules = rideSchedules;
    }

    public ArrayList<UserVehicle> getUserVehicles() {
        return UserVehicles;
    }

    public void setUserVehicles(ArrayList<UserVehicle> userVehicles) {
        UserVehicles = userVehicles;
    }
}
