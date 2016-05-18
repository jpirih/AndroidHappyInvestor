package com.kekec_apps.android.happyinvestor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MicrosoftActivity extends AppCompatActivity {
    private static final String TAG = "Microsoft Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_microsoft);
        setTitle("Microsoft Stocks");

        Log.v(TAG, "Microsoft stocks data overview");

        // gumb nazaj na seznam
        Button msBackBtn = (Button) findViewById(R.id.msBackBtn);
        msBackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Klik na Nazaj Btn -> Main act Companies overview");
                Intent intent = new Intent(MicrosoftActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
