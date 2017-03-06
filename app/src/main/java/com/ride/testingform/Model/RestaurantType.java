package com.ride.testingform.Model;

import java.util.ArrayList;

/**
 * Created by Admin on 1/30/2017.
 */

public class RestaurantType extends BaseModel {
    public String Type;
    public ArrayList<Restaurant> Restaurants;

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public ArrayList<Restaurant> getRestaurants() {
        return Restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        Restaurants = restaurants;
    }
}
