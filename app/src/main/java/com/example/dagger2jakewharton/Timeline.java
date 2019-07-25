package com.example.dagger2jakewharton;

import android.util.Log;

public class Timeline {

    private final TwitterApi twitterApi;
    private final String user;

    public Timeline(TwitterApi twitterApi, String user) {
        this.twitterApi = twitterApi;
        this.user = user;
    }

    public void getTimelineForUser(String tweet) {
        Log.i("TAG", "Timeline.getTimelineForUser " + user + " " + tweet);
        twitterApi.postTweet(user, tweet);
    }
}
