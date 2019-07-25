package com.example.dagger2jakewharton.dagger;

import com.example.dagger2jakewharton.MainActivity;
import com.example.dagger2jakewharton.Timeline;
import com.example.dagger2jakewharton.Tweeter;
import javax.inject.Singleton;
import dagger.Component;

@Singleton
@Component(modules = {
        NetworkModule.class,
        TwitterModule.class
})
public interface TwitterComponent {
    Tweeter tweeter();
    Timeline timeline();
    void inject(MainActivity activity);
}
