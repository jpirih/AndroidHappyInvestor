package com.kekec_apps.android.happyinvestor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.kekec_apps.android.happyinvestor.model.StockData;

public class FacebookActivity extends AppCompatActivity {
    private static final String TAG = "Facebook Activity";
    private CompaniesAdapter adapter;

    public static final StockData[] FB_ST4OCKS = new StockData[] {
            new StockData(3239318,"19.05.2016", 112.31),
            new StockData(3239318, "18.05.2016", 115.72),
            new StockData(3239318, "17.05.2016", 117.12),
    };



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

        // list view
        ListView listFacebookStocks = (ListView) findViewById(R.id.lisFacebookStocks);
        adapter = new CompaniesAdapter(this);
        adapter.setItems(FB_ST4OCKS);
        listFacebookStocks.setAdapter(adapter);

    }
}
