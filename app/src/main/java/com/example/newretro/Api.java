package com.example.newretro;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public class Api {

    private static final String base_url="https://nearby-restaurants.herokuapp.com/";
    public static PostService postService=null;

    public static PostService getService(){

        if (postService==null){

            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(base_url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
            postService=retrofit.create(PostService.class);
        }
        return postService;
    }

    public interface PostService{
        @GET()
        Call<List<PostList>> getPostList(@Url String url);
    }

}
