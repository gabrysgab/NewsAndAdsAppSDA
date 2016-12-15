package com.mgabrynowicz.newsandadsapp.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

/**
 * Created by RENT on 2016-12-15.
 */

public interface NewsApiClient {

    @GET("plugin/test.news")
    @Headers("X-BAASBOX-APPCODE: 1234567890")
    Call<NewsResponse> getNews();

    //@GET("")
    //@Headers("X-BAASBOX-APPCODE: 1234567890")
    //Call<NewsResponse> getNews();


}
