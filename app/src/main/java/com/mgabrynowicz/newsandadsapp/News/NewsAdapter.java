package com.mgabrynowicz.newsandadsapp.News;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.mgabrynowicz.newsandadsapp.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by RENT on 2016-12-15.
 */

public class NewsAdapter extends BaseAdapter {

    private final Context context;
    private final List<News> news;
    private final LayoutInflater layoutInflater;

    public NewsAdapter(Context context, List<News> news) {
        this.context = context;
        this.news = news;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override
    public int getCount() {
        return news.size();
    }

    @Override
    public Object getItem(int position) {
        return news.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        NewsViewHolder viewHolder;

        if(view == null) {

            view = layoutInflater.inflate(R.layout.view_news_item, parent, false);
            viewHolder = new NewsViewHolder(view);
            view.setTag(viewHolder);
        } else {
            viewHolder = (NewsViewHolder) view.getTag();
            Log.d("newsadapter", "re-using view!");
        }


        News news = (News) getItem(position);

        viewHolder.title.setText(news.getTitle());
        viewHolder.content.setText(news.getContent());
        Picasso.with(context)
                .load(news.getImageUrl())
                .fit()
                .centerCrop()
                .into(viewHolder.image);


        return view;
    }
}
