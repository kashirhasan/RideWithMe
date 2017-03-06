package com.ride.testingform.Adapter;

import com.ride.testingform.Model.OrderDetials;

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

public interface OrderDetailsService {
    @GET("/OrderDetials")
    public void getOrderDetials(Callback<List<OrderDetials>> callback);

    //Get OrderDetials record base on ID
    @GET("/OrderDetials/{id}")
    public void getOrderDetialsById(@Path("id") Integer id, Callback<OrderDetials> callback);

    //Delete OrderDetials record base on ID
    @DELETE("/OrderDetials/{id}")
    public void deleteOrderDetialsById(@Path("id") Integer id, Callback<OrderDetials> callback);

    //PUT OrderDetials record and post content in HTTP request BODY
    @PUT("/OrderDetials/{id}")
    public void updateOrderDetialsById(@Path("id") Integer id, @Body OrderDetials OrderDetials, Callback<OrderDetials> callback);

    //Add OrderDetials record and post content in HTTP request BODY
    @POST("/OrderDetials")
    public void addOrderDetials(@Body OrderDetials OrderDetials, Callback<OrderDetials> callback);

}
