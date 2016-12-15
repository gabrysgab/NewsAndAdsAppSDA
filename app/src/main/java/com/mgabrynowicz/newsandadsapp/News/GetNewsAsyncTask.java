package com.mgabrynowicz.newsandadsapp.News;

import android.os.AsyncTask;

import java.io.IOException;
import java.util.List;

/**
 * Created by RENT on 2016-12-15.
 */

public class GetNewsAsyncTask extends AsyncTask<Void, Void, List<News>> {

    private  final NewsService newsService;
    private final NewsDownloadedListener newsDownloadedListener;

    public GetNewsAsyncTask(NewsDownloadedListener newsDownloadedListener) {
        this.newsDownloadedListener = newsDownloadedListener;
        newsService = new NewsService();
    }

    @Override
    protected List<News> doInBackground(Void... voids) {

        try {
            return newsService.getNews();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    protected void onPostExecute(List<News> newses) {
        newsDownloadedListener.onNewsDownloaded(newses);
    }

    public interface NewsDownloadedListener {
        void onNewsDownloaded(List<News> news);


    }
}
