package com.example.petstore;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.POST;
import retrofit2.http.Body;

interface PetstoreService {

    @GET("pet/{petId}")
    Call<Pet> getPet(@Path("petId") String petId);

    @POST("pet")
    Call<Void> postPet(@Body Pet pet);

    //@POST("store/order")
    //Call<Void> postOrder(@Body Order order);

}
