package com.ride.testingform.Adapter;

import com.ride.testingform.Model.UserSchedule;

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

public interface UserScheduleService {
    @GET("/UserSchedules")
    public void getUserSchedule(Callback<List<UserSchedule>> callback);

    //Get UserSchedule record base on ID
    @GET("/UserSchedules/{id}")
    public void getUserScheduleById(@Path("id") Integer id, Callback<UserSchedule> callback);

    //Delete UserSchedule record base on ID
    @DELETE("/UserSchedules/{id}")
    public void deleteUserScheduleById(@Path("id") Integer id, Callback<UserSchedule> callback);

    //PUT UserSchedule record and post content in HTTP request BODY
    @PUT("/UserSchedules/{id}")
    public void updateUserScheduleById(@Path("id") Integer id, @Body UserSchedule UserSchedule, Callback<UserSchedule> callback);

    //Add UserSchedule record and post content in HTTP request BODY
    @POST("/UserSchedules")
    public void addUserSchedule(@Body UserSchedule UserSchedule, Callback<UserSchedule> callback);
}
