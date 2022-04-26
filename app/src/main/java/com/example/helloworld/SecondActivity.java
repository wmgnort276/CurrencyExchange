package com.example.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    // khoi tao key
   // public static final String EXTRA_REPLY = "com.example.android.twoactivities.extra.REPLY";
   // private EditText mReply;
    // codelab 2.2
   // private static final String LOG_TAG = SecondActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

    }


}