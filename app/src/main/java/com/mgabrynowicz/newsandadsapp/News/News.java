package com.mgabrynowicz.newsandadsapp.News;

/**
 * Created by RENT on 2016-12-15.
 */

public class News {


    private final String title;
    private final String content;
    private final String imageUrl;
    private final int index;


    public News(String title, String content, String imageUrl, int index) {
        this.title = title;
        this.content = content;
        this.imageUrl = imageUrl;
        this.index = index;
    }


    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public int getIndex() {
        return index;
    }

    @Override
    public String toString() {
        return "News{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", imageUrl='" + imageUrl + '\'' +
                ", index=" + index +
                '}';
    }
}
