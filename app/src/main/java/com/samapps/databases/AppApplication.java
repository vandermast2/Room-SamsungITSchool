package com.samapps.databases;

import android.app.Application;

import androidx.room.Room;

import com.samapps.databases.db.AppDatabase;

public class AppApplication extends Application {
    public static AppApplication instance;

    private AppDatabase database;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        database = Room.databaseBuilder(getApplicationContext(),
                AppDatabase.class, "database")
                .allowMainThreadQueries()
                .build();
    }

    public static AppApplication getInstance() {
        return instance;
    }

    public AppDatabase getDatabase() {
        return database;
    }
}
