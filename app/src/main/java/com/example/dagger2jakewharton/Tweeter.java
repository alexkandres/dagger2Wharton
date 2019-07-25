package com.example.dagger2jakewharton;

import android.util.Log;

public class Tweeter {

    private final TwitterApi twitterApi;
    private final String user;

    public Tweeter(TwitterApi twitterApi, String user) {
        this.twitterApi = twitterApi;
        this.user = user;
    }

    public void tweet(String tweet) {
        Log.i("TAG", "Tweeter.tweet " + user + " " + tweet);
        twitterApi.postTweet(user, tweet);
    }
}
