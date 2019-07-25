package com.example.dagger2jakewharton.dagger;

import android.app.Application;

public class MyApp extends Application {

    private TwitterComponent twitterComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        twitterComponent = DaggerTwitterComponent.builder()
                .networkModule(new NetworkModule())
                .twitterModule(new TwitterModule("Alex"))
                .build();
    }

    public TwitterComponent getTwitterComponent() {
        return twitterComponent;
    }
}
