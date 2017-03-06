package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class Restaurant extends BaseModel {
    public String Name;
    public String Address;
    public String MobileNo;
    public float DeliveryCharges;
    public String MenuType;
    public ArrayList<Menu> Menus;
    public ArrayList<Order> Orders;
    public RestaurantType RestaurantTypes;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getMobileNo() {
        return MobileNo;
    }

    public void setMobileNo(String mobileNo) {
        MobileNo = mobileNo;
    }

    public float getDeliveryCharges() {
        return DeliveryCharges;
    }

    public void setDeliveryCharges(float deliveryCharges) {
        DeliveryCharges = deliveryCharges;
    }

    public String getMenuType() {
        return MenuType;
    }

    public void setMenuType(String menuType) {
        MenuType = menuType;
    }

    public RestaurantType getRestaurantTypes() {
        return RestaurantTypes;
    }

    public void setRestaurantTypes(RestaurantType restaurantTypes) {
        RestaurantTypes = restaurantTypes;
    }

    public ArrayList<Menu> getMenus() {
        return Menus;
    }

    public void setMenus(ArrayList<Menu> menus) {
        Menus = menus;
    }

    public ArrayList<Order> getOrders() {
        return Orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        Orders = orders;
    }
}
