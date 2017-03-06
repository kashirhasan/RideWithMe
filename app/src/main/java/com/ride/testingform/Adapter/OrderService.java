package com.ride.testingform.Adapter;

import com.ride.testingform.Model.Order;
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

public interface OrderService {
    @GET("/Orders")
    public void getOrder(Callback<List<Order>> callback);

    //Get Order record base on ID
    @GET("/Orders/{id}")
    public void getOrderById(@Path("id") Integer id, Callback<Order> callback);

    //Delete Order record base on ID
    @DELETE("/Orders/{id}")
    public void deleteOrderById(@Path("id") Integer id, Callback<Order> callback);

    //PUT Order record and post content in HTTP request BODY
    @PUT("/Orders/{id}")
    public void updateOrderById(@Path("id") Integer id, @Body Order Order, Callback<Order> callback);

    //Add Order record and post content in HTTP request BODY
    @POST("/Orders")
    public void addOrder(@Body Order Order, Callback<Order> callback);

}
