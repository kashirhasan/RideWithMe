package com.ride.testingform.Adapter;

import com.ride.testingform.Model.PassengerSchedule;

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

public interface PassengerScheduleService {
    @GET("/PassengerSchedules")
    public void getPassengerSchedule(Callback<List<PassengerSchedule>> callback);

    //Get PassengerSchedule record base on ID
    @GET("/PassengerSchedules/{id}")
    public void getPassengerScheduleById(@Path("id") Integer id, Callback<PassengerSchedule> callback);

    //Delete PassengerSchedule record base on ID
    @DELETE("/PassengerSchedules/{id}")
    public void deletePassengerScheduleById(@Path("id") Integer id, Callback<PassengerSchedule> callback);

    //PUT PassengerSchedule record and post content in HTTP request BODY
    @PUT("/PassengerSchedules/{id}")
    public void updatePassengerScheduleById(@Path("id") Integer id, @Body PassengerSchedule PassengerSchedule, Callback<PassengerSchedule> callback);

    //Add PassengerSchedule record and post content in HTTP request BODY
    @POST("/PassengerSchedules")
    public void addPassengerSchedule(@Body PassengerSchedule PassengerSchedule, Callback<PassengerSchedule> callback);

}
