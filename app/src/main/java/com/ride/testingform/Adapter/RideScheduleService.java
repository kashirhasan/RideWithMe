package com.ride.testingform.Adapter;

import com.ride.testingform.Model.RideSchedule;

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

public interface RideScheduleService {
    @GET("/RideSchedules")
    public void getRideSchedule(Callback<List<RideSchedule>> callback);

    //Get RideSchedule record base on ID
    @GET("/RideSchedules/{id}")
    public void getRideScheduleById(@Path("id") Integer id, Callback<RideSchedule> callback);

    //Delete RideSchedule record base on ID
    @DELETE("/RideSchedules/{id}")
    public void deleteRideScheduleById(@Path("id") Integer id, Callback<RideSchedule> callback);

    //PUT RideSchedule record and post content in HTTP request BODY
    @PUT("/RideSchedules/{id}")
    public void updateRideScheduleById(@Path("id") Integer id, @Body RideSchedule RideSchedule, Callback<RideSchedule> callback);

    //Add RideSchedule record and post content in HTTP request BODY
    @POST("/RideSchedules")
    public void addRideSchedule(@Body RideSchedule RideSchedule, Callback<RideSchedule> callback);
}
