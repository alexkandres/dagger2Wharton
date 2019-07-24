package com.example.dagger2jakewharton.dagger;

import com.example.dagger2jakewharton.OkHttpClient;
import com.example.dagger2jakewharton.TwitterApi;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class NetworkModule {

    @Provides @Singleton
    OkHttpClient provideOkHttpClient() {
        return new OkHttpClient();
    }

    @Provides @Singleton
    TwitterApi provideTwitterApi(OkHttpClient okHttpClient) {
        return new TwitterApi(okHttpClient);
    }
}
