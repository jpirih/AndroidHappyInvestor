package com.kekec_apps.android.happyinvestor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Happy Investor Companies");

        Log.v(TAG, "MainActivity - companies overview");
        // gumb google stocks data
        Button btnGoogle = (Button) findViewById(R.id.btnGoogle);
        btnGoogle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Klik na Google btn -> Alphabet act. Google stocks data");
                Intent intent = new Intent(MainActivity.this, AlphapetActivity.class);
                startActivity(intent);
            }
        });

        // gumb Facebook stock data
        Button btnFacebook = (Button) findViewById(R.id.btnFacebook);
        btnFacebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Klik na Facebook btn -> Facebook act. Facebook stock data");
                Intent intent = new Intent(MainActivity.this, FacebookActivity.class);
                startActivity(intent);
            }
        });

        // gumb Microsoft stock data
        Button btnMicrosoft = (Button) findViewById(R.id.btnMicrosoft);
        btnMicrosoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Klik na Microsoft btn -> Microsoft act. Microsoft stock data");
                Intent intent = new Intent(MainActivity.this, MicrosoftActivity.class);
                startActivity(intent);
            }
        });

    }
}
