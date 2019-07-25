package com.example.dagger2jakewharton;

import android.util.Log;

public class TwitterApi {
    private final OkHttpClient okHttpClient;

    public TwitterApi(OkHttpClient okHttpClient) {
        this.okHttpClient = okHttpClient;
    }

    public void postTweet(String user, String tweet) {
        Log.i("TAG", "TwitterApi.postTweet " + user + " " + tweet);
        okHttpClient.newCall(user + " "  + tweet);
    }
}
