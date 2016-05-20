package com.kekec_apps.android.happyinvestor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.kekec_apps.android.happyinvestor.model.StockData;

import java.util.List;

public class AlphapetActivity extends AppCompatActivity {
    private static final String TAG ="Alphabet Activity";
    private  CompaniesAdapter adapter;

    public static final StockData[] GOOG_STOCKS = new StockData[] {
            new StockData(3239318,"19.05.2016", 150.31),
            new StockData(3239318, "18.05.2016", 144),
            new StockData(3239318, "17.05.2016", 145.12),
    };

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

        ListView listGoogleStocks = (ListView) findViewById(R.id.listGoogleStocks);
        adapter = new CompaniesAdapter(this);
        adapter.setItems(GOOG_STOCKS);
        listGoogleStocks.setAdapter(adapter);
    }
}
