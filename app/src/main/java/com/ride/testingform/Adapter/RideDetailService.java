package com.ride.testingform.Adapter;

import com.ride.testingform.Model.RideDetails;

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

public interface RideDetailService {
    @GET("/RideDetails")
    public void getRideDetail(Callback<List<RideDetails>> callback);

    //Get RideDetail record base on ID
    @GET("/RideDetails/{id}")
    public void getRideDetailById(@Path("id") Integer id, Callback<RideDetails> callback);

    //Delete RideDetail record base on ID
    @DELETE("/RideDetails/{id}")
    public void deleteRideDetailById(@Path("id") Integer id, Callback<RideDetails> callback);

    //PUT RideDetail record and post content in HTTP request BODY
    @PUT("/RideDetails/{id}")
    public void updateRideDetailById(@Path("id") Integer id, @Body RideDetails RideDetail, Callback<RideDetails> callback);

    //Add RideDetail record and post content in HTTP request BODY
    @POST("/RideDetails")
    public void addRideDetail(@Body RideDetails RideDetail, Callback<RideDetails> callback);

}
