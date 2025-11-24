package com.gng.security;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            SharedPreferences sharedPreferences = getSharedPreferences("GnGSecurityPrefs", MODE_PRIVATE);
            boolean isLoggedIn = sharedPreferences.getBoolean("isLoggedIn", false);

            Intent intent;
            if (isLoggedIn) {
                // User is logged in, go to MainActivity
                intent = new Intent(SplashActivity.this, MainActivity.class);
            } else {
                // User is not logged in, go to TermsActivity
                intent = new Intent(SplashActivity.this, TermsActivity.class);
            }
            startActivity(intent);
            finish(); // Finish this activity so the user can't navigate back to it
        }, 1000); // 1 second delay
    }
}
