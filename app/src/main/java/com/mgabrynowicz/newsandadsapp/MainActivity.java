package com.mgabrynowicz.newsandadsapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import com.mgabrynowicz.newsandadsapp.News.GetNewsAsyncTask;
import com.mgabrynowicz.newsandadsapp.News.News;
import com.mgabrynowicz.newsandadsapp.News.NewsRecyclerAdapter;

import java.util.List;

public class MainActivity extends AppCompatActivity implements GetNewsAsyncTask.NewsDownloadedListener {


   // private ListView listView;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //listView = (ListView) findViewById(R.id.listView);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);



        new GetNewsAsyncTask(this).execute();


    }

    @Override
    public void onNewsDownloaded(List<News> news) {

        if(news == null) {
            Toast.makeText(this, "Failed", Toast.LENGTH_SHORT).show();
            return;
        }
        Toast.makeText(this, "Downloaded " + news.size() + " news", Toast.LENGTH_SHORT).show();
        NewsRecyclerAdapter newsRecyclerAdapter = new NewsRecyclerAdapter(this, news);
        recyclerView.setAdapter(newsRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
