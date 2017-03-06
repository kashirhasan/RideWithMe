package com.ride.testingform.Adapter;

import com.ride.testingform.Model.Menu;
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

public interface MenuService {
    @GET("/Menus")
    public void getMenu(Callback<List<Menu>> callback);

    //Get Menu record base on ID
    @GET("/Menus/{id}")
    public void getMenuById(@Path("id") Integer id, Callback<Menu> callback);

    //Delete Menu record base on ID
    @DELETE("/Menus/{id}")
    public void deleteMenuById(@Path("id") Integer id, Callback<Menu> callback);

    //PUT Menu record and post content in HTTP request BODY
    @PUT("/Menus/{id}")
    public void updateMenuById(@Path("id") Integer id, @Body Menu Menu, Callback<Menu> callback);

    //Add Menu record and post content in HTTP request BODY
    @POST("/Menus")
    public void addMenu(@Body Menu Menu, Callback<Menu> callback);

}
