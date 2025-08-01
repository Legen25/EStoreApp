package com.group5.estoreapp.api.userApi;

import com.google.gson.JsonObject;
import com.group5.estoreapp.model.User;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class UserApiService {

    private static final String BASE_URL = "https://prmbe.felixtien.dev/api/";
    private static UserApiService instance;
    private UserApi userApi;

    private UserApiService() {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        userApi = retrofit.create(UserApi.class);
    }

    public static synchronized UserApiService getInstance() {
        if (instance == null) {
            instance = new UserApiService();
        }
        return instance;
    }

    public Call<User> getUserById(int id){
        return userApi.getUserById(id);
    }

    public Call<JsonObject> updateUser(int id, JsonObject userBody) {
        return userApi.updateUser(id, userBody);
    }
}