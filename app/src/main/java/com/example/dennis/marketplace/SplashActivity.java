package com.example.dennis.marketplace;

/**
 * Created by dennis on 9/8/17.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dennis.marketplace.ui.MainActivity;

public class SplashActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        // Start home activity

        startActivity(new Intent(SplashActivity.this, MainActivity.class));

        // close splash activity

        finish();

    }

}