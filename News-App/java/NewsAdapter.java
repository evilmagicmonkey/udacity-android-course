package com.example.android.newsproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    private static final String DATETIME_SEPARATOR = "T";
    private static final String DATETIME_END = "Z";

    public NewsAdapter(Context context, List<News> news) {
        super(context, 0, news);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView headlineView = listItemView.findViewById(R.id.headline_text_view);
        headlineView.setText(currentNews.getHeadline());

        TextView categoryView = listItemView.findViewById(R.id.category_text_view);
        categoryView.setText(currentNews.getCategory());

        TextView bylineView = listItemView.findViewById(R.id.author_text_view);
        bylineView.setText(currentNews.getByline());

        String dateTime = currentNews.getDate();
        String date;
        String time;

        if(dateTime.contains(DATETIME_SEPARATOR)) {
            String[] parts = dateTime.split(DATETIME_SEPARATOR);
            date = parts[0];
            time = parts[1];
        } else {
            date = dateTime;
            time = dateTime;
        }

        if(time.contains(DATETIME_END)) {
            String[] parts = time.split(DATETIME_END);
            time = parts[0];
        }

        TextView dateView = listItemView.findViewById(R.id.date_text_view);
        dateView.setText(date);
        TextView timeView = listItemView.findViewById(R.id.time_text_view);
        timeView.setText(time);

        return listItemView;

    }

}