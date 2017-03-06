package com.ride.testingform.Adapter;

import com.ride.testingform.Model.VanProvider;

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

public interface VanProviderService {
    @GET("/VanProviders")
    public void getVanProvider(Callback<List<VanProvider>> callback);

    //Get VanProvider record base on ID
    @GET("/VanProviders/{id}")
    public void getVanProviderById(@Path("id") Integer id, Callback<VanProvider> callback);

    //Delete VanProvider record base on ID
    @DELETE("/VanProviders/{id}")
    public void deleteVanProviderById(@Path("id") Integer id, Callback<VanProvider> callback);

    //PUT VanProvider record and post content in HTTP request BODY
    @PUT("/VanProviders/{id}")
    public void updateVanProviderById(@Path("id") Integer id, @Body VanProvider VanProvider, Callback<VanProvider> callback);

    //Add VanProvider record and post content in HTTP request BODY
    @POST("/VanProviders")
    public void addVanProvider(@Body VanProvider VanProvider, Callback<VanProvider> callback);
}
