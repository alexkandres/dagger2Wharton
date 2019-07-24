package com.example.dagger2jakewharton.dagger;

import com.example.dagger2jakewharton.Timeline;
import com.example.dagger2jakewharton.Tweeter;
import dagger.Component;

@Component(modules = {
        NetworkModule.class,
        TwitterModule.class
})
public interface TwitterComponent {
    Tweeter tweeter();
    Timeline timeline();
}
