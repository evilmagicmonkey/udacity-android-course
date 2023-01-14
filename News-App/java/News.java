package com.example.android.newsproject;

public class News {
    private String mHeadline;
    private String mByline;
    private String mCategory;
    public String mDate;
    public String mUrl;


    public News(String headline, String byline, String category, String date, String url) {
        mHeadline = headline;
        mByline = byline;
        mCategory = category;
        mDate = date;
        mUrl = url;
    }

    public String getHeadline() {
        return mHeadline;
    }
    public String getByline() {
        return mByline;
    }
    public String getCategory() {
        return mCategory;
    }
    public String getDate() {
        return mDate;
    }
    public String getUrl() {
        return mUrl;
    }
}