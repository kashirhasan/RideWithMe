package com.ride.testingform.Adapter;

import com.ride.testingform.Model.DishSpecification;

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

public interface DishSpecificationService {
    @GET("/DishSpecifications")
    public void getDishSpecification(Callback<List<DishSpecification>> callback);

    //Get DishSpecification record base on ID
    @GET("/DishSpecifications/{id}")
    public void getDishSpecificationById(@Path("id") Integer id, Callback<DishSpecification> callback);

    //Delete DishSpecification record base on ID
    @DELETE("/DishSpecifications/{id}")
    public void deleteDishSpecificationById(@Path("id") Integer id, Callback<DishSpecification> callback);

    //PUT DishSpecification record and post content in HTTP request BODY
    @PUT("/DishSpecifications/{id}")
    public void updateDishSpecificationById(@Path("id") Integer id, @Body DishSpecification DishSpecification, Callback<DishSpecification> callback);

    //Add DishSpecification record and post content in HTTP request BODY
    @POST("/DishSpecifications")
    public void addDishSpecification(@Body DishSpecification DishSpecification, Callback<DishSpecification> callback);
}
