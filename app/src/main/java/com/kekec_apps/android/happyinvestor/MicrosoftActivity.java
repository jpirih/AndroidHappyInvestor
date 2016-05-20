package com.kekec_apps.android.happyinvestor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.kekec_apps.android.happyinvestor.model.StockData;

public class MicrosoftActivity extends AppCompatActivity {
    private static final String TAG = "Microsoft Activity";
    private CompaniesAdapter adapter;
    public static final StockData[] MS_STOCKS = new StockData[] {
            new StockData(3239318,"19.05.2016", 212.31),
            new StockData(3239318, "18.05.2016", 235.16),
            new StockData(3239318, "17.05.2016", 210.27),
    };

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

        // list view
        ListView listMicrosoftStocks = (ListView) findViewById(R.id.listMicrosoftStocks);
        adapter = new CompaniesAdapter(this);
        adapter.setItems(MS_STOCKS);
        listMicrosoftStocks.setAdapter(adapter);

    }
}
