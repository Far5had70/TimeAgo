package com.waspar.timeagolibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.waspar.timeago.TimeAgo;

import java.text.SimpleDateFormat;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //way 1
        Log.e(TAG, "onCreate: " + TimeAgo.Convert(2018, 7, 6, 21, 30, 0));

        //way2
        Log.e(TAG, "onCreate: " + TimeAgo.ConvertWithPattern("2018-07-06T21:30:00", "yyyy-MM-dd'T'HH:mm:ss"));

        //way 3
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Log.e(TAG, "onCreate: " + TimeAgo.ConvertWithSimpleDateFormat("2018-07-06T21:30:00", simpleDateFormat));

        //Change Text
        TimeAgo.changeTextDay("Day ago"); // 3 Day Ago
        TimeAgo.changeTextHour("Hour ago"); // 2 Hour Ago
        TimeAgo.changeTextMinute("Minute ago"); // 3 Minute Ago
        TimeAgo.changeTextSecond("Second ago");  // 55 Second Ago
        Log.e(TAG, "onCreate: " + TimeAgo.Convert(2018, 7, 6, 21, 30, 0));

    }
}
