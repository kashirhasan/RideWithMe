package com.ride.testingform.Adapter;

import com.ride.testingform.Model.UserVehicle;

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

public interface UserVehicleService {
    @GET("/UserVehicles")
    public void getUserVehicle(Callback<List<UserVehicle>> callback);

    //Get UserVehicle record base on ID
    @GET("/UserVehicles/{id}")
    public void getUserVehicleById(@Path("id") Integer id, Callback<UserVehicle> callback);

    //Delete UserVehicle record base on ID
    @DELETE("/UserVehicles/{id}")
    public void deleteUserVehicleById(@Path("id") Integer id, Callback<UserVehicle> callback);

    //PUT UserVehicle record and post content in HTTP request BODY
    @PUT("/UserVehicles/{id}")
    public void updateUserVehicleById(@Path("id") Integer id, @Body UserVehicle UserVehicle, Callback<UserVehicle> callback);

    //Add UserVehicle record and post content in HTTP request BODY
    @POST("/UserVehicles")
    public void addUserVehicle(@Body UserVehicle UserVehicle, Callback<UserVehicle> callback);
}
