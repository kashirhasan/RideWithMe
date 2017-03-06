package com.ride.testingform.Adapter;

import com.ride.testingform.Model.VanRoute;

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

public interface VanRouteService {
    @GET("/VanRoutes")
    public void getVanRoute(Callback<List<VanRoute>> callback);

    //Get VanRoute record base on ID
    @GET("/VanRoutes/{id}")
    public void getVanRouteById(@Path("id") Integer id, Callback<VanRoute> callback);

    //Delete VanRoute record base on ID
    @DELETE("/VanRoutes/{id}")
    public void deleteVanRouteById(@Path("id") Integer id, Callback<VanRoute> callback);

    //PUT VanRoute record and post content in HTTP request BODY
    @PUT("/VanRoutes/{id}")
    public void updateVanRouteById(@Path("id") Integer id, @Body VanRoute VanRoute, Callback<VanRoute> callback);

    //Add VanRoute record and post content in HTTP request BODY
    @POST("/VanRoutes")
    public void addVanRoute(@Body VanRoute VanRoute, Callback<VanRoute> callback);
}
