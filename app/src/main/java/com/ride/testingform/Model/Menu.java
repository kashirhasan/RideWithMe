package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class Menu extends BaseModel {


    public String DishName;
    public String Day;
    public String Charges;
    public String Description;
    public Restaurant Restaurants;
    public ArrayList<DishSpecification> DishSpecifications;

    public String getDishName() {
        return DishName;
    }

    public void setDishName(String dishName) {
        DishName = dishName;
    }

    public String getDay() {
        return Day;
    }

    public void setDay(String day) {
        Day = day;
    }

    public String getCharges() {
        return Charges;
    }

    public void setCharges(String charges) {
        Charges = charges;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Restaurant getRestaurants() {
        return Restaurants;
    }

    public void setRestaurants(Restaurant restaurants) {
        Restaurants = restaurants;
    }

    public ArrayList<DishSpecification> getDishSpecifications() {
        return DishSpecifications;
    }

    public void setDishSpecifications(ArrayList<DishSpecification> dishSpecifications) {
        DishSpecifications = dishSpecifications;
    }
}
