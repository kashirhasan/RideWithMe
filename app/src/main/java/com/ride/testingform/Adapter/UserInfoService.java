package com.ride.testingform.Adapter;

import com.ride.testingform.Model.UserInfo;

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

public interface UserInfoService {
    @GET("/Users")
    public void getUserInfo(Callback<List<UserInfo>> callback);

    //Get UserInfo record base on ID
    @GET("/Users/{id}")
    public void getUserInfoById(@Path("id") Integer id, Callback<UserInfo> callback);

    //Delete UserInfo record base on ID
    @DELETE("/Users/{id}")
    public void deleteUserInfoById(@Path("id") Integer id, Callback<UserInfo> callback);

    //PUT UserInfo record and post content in HTTP request BODY
    @PUT("/Users/{id}")
    public void updateUserInfoById(@Path("id") Integer id, @Body UserInfo UserInfo, Callback<UserInfo> callback);

    //Add UserInfo record and post content in HTTP request BODY
    @POST("/Users")
    public void addUserInfo(@Body UserInfo UserInfo, Callback<UserInfo> callback);
}
