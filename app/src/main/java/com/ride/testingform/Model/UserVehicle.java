package com.ride.testingform.Model;

/**
 * Created by Admin on 1/30/2017.
 */

public class UserVehicle extends BaseModel {
    public Integer Id;
    public String VehicleNumber;
    public String Color;
    public int MaxPassenger;
    public int VehicleTypeId;
    public VehicleType VehicleTypes;
    public UserInfo Users;
    public Integer UserId;
    public Integer MyProperty;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getUserId() {
        return UserId;
    }

    public void setUserId(Integer userId) {
        UserId = userId;
    }

    public Integer getMyProperty() {
        return MyProperty;
    }

    public void setMyProperty(Integer myProperty) {
        MyProperty = myProperty;
    }

    public int getVehicleTypeId() {
        return VehicleTypeId;
    }

    public void setVehicleTypeId(int vehicleTypeId) {
        VehicleTypeId = vehicleTypeId;
    }

    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getMaxPassenger() {
        return MaxPassenger;
    }

    public void setMaxPassenger(int maxPassenger) {
        MaxPassenger = maxPassenger;
    }


    public VehicleType getVehicleTypes() {
        return VehicleTypes;
    }

    public void setVehicleTypes(VehicleType vehicleTypes) {
        VehicleTypes = vehicleTypes;
    }

    public UserInfo getUsers() {
        return Users;
    }

    public void setUsers(UserInfo users) {
        Users = users;
    }


}
