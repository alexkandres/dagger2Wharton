package com.example.dagger2jakewharton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.dagger2jakewharton.dagger.MyApp;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject Tweeter tweeter;
    @Inject Timeline timeline;
    //c1
    //c2
    //c3
    //g1
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //g2
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApp)getApplication()).getTwitterComponent().inject(this);

        tweeter.tweet("first tweet");
        timeline.getTimelineForUser("getting timeline");
    }
}
