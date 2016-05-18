package com.kekec_apps.android.happyinvestor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class FacebookActivity extends AppCompatActivity {
    private static final String TAG = "Facebook Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        setTitle("Facebook Stocks");
        Log.v(TAG, "Facebook activity -> Facebook stocks data ");

        Button fbBackMain = (Button) findViewById(R.id.fbBackBtn);
        fbBackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Klik na Nazaj btn -> back Main Activity list of companies");
                Intent intent = new Intent(FacebookActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
