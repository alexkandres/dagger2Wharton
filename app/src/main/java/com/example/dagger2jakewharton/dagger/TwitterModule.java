package com.example.dagger2jakewharton.dagger;

import com.example.dagger2jakewharton.Timeline;
import com.example.dagger2jakewharton.Tweeter;
import com.example.dagger2jakewharton.TwitterApi;

import dagger.Module;
import dagger.Provides;

@Module
public class TwitterModule {

    private String user;

    public TwitterModule(String user) {
        this.user = user;
    }
    @Provides
    Tweeter provideTweeter(TwitterApi twitterApi){
        return new Tweeter(twitterApi, user);
    }

    @Provides
    Timeline providesTimeline(TwitterApi twitterApi) {
        return new Timeline(twitterApi, user);
    }

}
