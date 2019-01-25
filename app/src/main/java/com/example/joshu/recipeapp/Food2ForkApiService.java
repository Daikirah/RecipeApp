package com.example.joshu.recipeapp;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface Food2ForkApiService {

    String BASE_URL = "https://www.food2fork.com/api/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build();


    @GET("search?key=a81672c83bbb522279150f89e21d65d2&count=3")
    Call<RecipeHead> getRecipes();

}
