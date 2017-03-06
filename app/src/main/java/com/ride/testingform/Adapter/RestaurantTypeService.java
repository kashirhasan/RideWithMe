package com.ride.testingform.Adapter;

import com.ride.testingform.Model.RestaurantType;

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

public interface RestaurantTypeService {
    @GET("/RestaurantTypes")
    public void getRestaurantType(Callback<List<RestaurantType>> callback);

    //Get RestaurantType record base on ID
    @GET("/RestaurantTypes/{id}")
    public void getRestaurantTypeById(@Path("id") Integer id, Callback<RestaurantType> callback);

    //Delete RestaurantType record base on ID
    @DELETE("/RestaurantTypes/{id}")
    public void deleteRestaurantTypeById(@Path("id") Integer id, Callback<RestaurantType> callback);

    //PUT RestaurantType record and post content in HTTP request BODY
    @PUT("/RestaurantTypes/{id}")
    public void updateRestaurantTypeById(@Path("id") Integer id, @Body RestaurantType RestaurantType, Callback<RestaurantType> callback);

    //Add RestaurantType record and post content in HTTP request BODY
    @POST("/RestaurantTypes")
    public void addRestaurantType(@Body RestaurantType RestaurantType, Callback<RestaurantType> callback);

}
