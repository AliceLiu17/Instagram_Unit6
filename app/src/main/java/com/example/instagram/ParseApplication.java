package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("65djGfv61HWQh1TRoPPdw6SWsKXsMU9Mp6BcP5e5")
                .clientKey("ceLHOly7amFTBW6kfJFYarqsmYp1FKgkATW1qjz2")
                .server("https://parseapi.back4app.com").build()
        );
    }
}