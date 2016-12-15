package com.mgabrynowicz.newsandadsapp.News;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Response;

/**
 * Created by RENT on 2016-12-15.
 */

public class NewsService {

    private final NewsApiClient newsApiClient;

    public NewsService() {
        NewsApiClientFactory newsApiClientFactory = new NewsApiClientFactory();
        this.newsApiClient = newsApiClientFactory.createNewsApiClient();
    }


    public List<News> getNews() throws IOException {
        Call<NewsResponse> call = newsApiClient.getNews();
        Response<NewsResponse> response = call.execute();
        NewsResponse newsResponse = response.body();
        return newsResponse.getNews();


    }
}
