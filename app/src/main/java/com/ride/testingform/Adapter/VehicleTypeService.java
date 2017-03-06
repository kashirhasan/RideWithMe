package com.ride.testingform.Adapter;

import com.ride.testingform.Model.VehicleType;
import com.ride.testingform.Model.VehicleType;

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

public interface VehicleTypeService {
    @GET("/VehicleTypes")
    public void getVehicleType(Callback<List<VehicleType>> callback);

    //Get VehicleType record base on ID
    @GET("/VehicleTypes/{id}")
    public void getVehicleTypeById(@Path("id") Integer id, Callback<VehicleType> callback);

    //Delete VehicleType record base on ID
    @DELETE("/VehicleTypes/{id}")
    public void deleteVehicleTypeById(@Path("id") Integer id, Callback<VehicleType> callback);

    //PUT VehicleType record and post content in HTTP request BODY
    @PUT("/VehicleTypes/{id}")
    public void updateVehicleTypeById(@Path("id") Integer id, @Body VehicleType vehicleType, Callback<VehicleType> callback);

    //Add VehicleType record and post content in HTTP request BODY
    @POST("/VehicleTypes")
    public void addVehicleType(@Body VehicleType vehicleType, Callback<VehicleType> callback);
}
