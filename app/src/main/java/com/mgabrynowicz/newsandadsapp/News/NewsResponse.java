package com.mgabrynowicz.newsandadsapp.News;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by RENT on 2016-12-15.
 */

public class NewsResponse {

    @SerializedName("data")
    private final List<News> news;

    public NewsResponse(List<News> news) {
        this.news = news;
    }

    public List<News> getNews() {
        return news;
    }


}
