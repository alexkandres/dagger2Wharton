package com.example.dagger2jakewharton;

import android.util.Log;

public class OkHttpClient {

    public void newCall(String body) {
        Log.i("TAG", "OkHttpClient.newCall: " + body);
    }
}
