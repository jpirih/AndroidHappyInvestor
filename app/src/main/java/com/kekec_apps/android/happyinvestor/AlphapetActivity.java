package com.kekec_apps.android.happyinvestor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class AlphapetActivity extends AppCompatActivity {
    private static final String TAG ="Alphabet Activity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alphapet);
        setTitle("Alphabet Google Stocks");
        Log.v(TAG,"Google Stocks Data");

        Button alphBackMain = (Button) findViewById(R.id.alphabetBackBtn);
        alphBackMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.v(TAG, "Klik na Nazaj btn -> Main activity");
                Intent intent = new Intent(AlphapetActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
