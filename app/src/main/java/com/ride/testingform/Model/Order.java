package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class Order extends BaseModel {

    public String TotalCharges;
    public String OrderDate;
    public String Address;
    public String DeliveryDateTime;
    public String Status;
    public String Location;
    //    [NotMapped]
//    public string Latitude ;
//    [NotMapped]
//    public string Longitude ;
    public Restaurant Restaurants;
    public UserInfo Users;
    public ArrayList<OrderDetials> OrderDetials;

    public UserInfo getUsers() {
        return Users;
    }

    public void setUsers(UserInfo users) {
        Users = users;
    }

    public Restaurant getRestaurants() {
        return Restaurants;
    }

    public void setRestaurants(Restaurant restaurants) {
        Restaurants = restaurants;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getDeliveryDateTime() {
        return DeliveryDateTime;
    }

    public void setDeliveryDateTime(String deliveryDateTime) {
        DeliveryDateTime = deliveryDateTime;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(String orderDate) {
        OrderDate = orderDate;
    }

    public String getTotalCharges() {
        return TotalCharges;
    }

    public void setTotalCharges(String totalCharges) {
        TotalCharges = totalCharges;
    }

    public ArrayList<com.ride.testingform.Model.OrderDetials> getOrderDetials() {
        return OrderDetials;
    }

    public void setOrderDetials(ArrayList<com.ride.testingform.Model.OrderDetials> orderDetials) {
        OrderDetials = orderDetials;
    }
}
