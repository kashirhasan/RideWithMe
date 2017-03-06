package com.ride.testingform.Adapter;

import com.ride.testingform.Model.Restaurant;

import java.util.List;

import retrofit.Callback;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.GET;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Path;

/**
 * Created by Kashir on 2/4/2017.
 */

public interface RestaurantService {
    @GET("/Restaurants")
    public void getRestaurant(Callback<List<Restaurant>> callback);

    //Get Restaurant record base on ID
    @GET("/Restaurants/{id}")
    public void getRestaurantById(@Path("id") Integer id, Callback<Restaurant> callback);

    //Delete Restaurant record base on ID
    @DELETE("/Restaurants/{id}")
    public void deleteRestaurantById(@Path("id") Integer id, Callback<Restaurant> callback);

    //PUT Restaurant record and post content in HTTP request BODY
    @PUT("/Restaurants/{id}")
    public void updateRestaurantById(@Path("id") Integer id, @Body Restaurant Restaurant, Callback<Restaurant> callback);

    //Add Restaurant record and post content in HTTP request BODY
    @POST("/Restaurants")
    public void addRestaurant(@Body Restaurant Restaurant, Callback<Restaurant> callback);

}
