package com.ride.testingform.Adapter;

import com.ride.testingform.Model.VanType;

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

public interface VanTypeService {
    @GET("/VanTypes")
    public void getVanType(Callback<List<VanType>> callback);

    //Get VanType record base on ID
    @GET("/VanTypes/{id}")
    public void getVanTypeById(@Path("id") Integer id, Callback<VanType> callback);

    //Delete VanType record base on ID
    @DELETE("/VanTypes/{id}")
    public void deleteVanTypeById(@Path("id") Integer id, Callback<VanType> callback);

    //PUT VanType record and post content in HTTP request BODY
    @PUT("/VanTypes/{id}")
    public void updateVanTypeById(@Path("id") Integer id, @Body VanType VanType, Callback<VanType> callback);

    //Add VanType record and post content in HTTP request BODY
    @POST("/VanTypes")
    public void addVanType(@Body VanType VanType, Callback<VanType> callback);
}
