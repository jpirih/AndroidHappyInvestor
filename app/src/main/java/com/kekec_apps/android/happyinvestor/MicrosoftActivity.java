package com.kekec_apps.android.happyinvestor;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;
import com.kekec_apps.android.happyinvestor.model.StockData;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

public class MicrosoftActivity extends AppCompatActivity {
    private static final String TAG    = "Microsoft Activity";
    private final OkHttpClient client = new OkHttpClient();

    public LinearLayout linearLayout;


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

        makeNetworkRequest();

    }

    private void makeNetworkRequest(){
        Request request = new Request.Builder()
                .url("https://www.enclout.com/api/v1/yahoo_finance/show.json?&auth_token=gwvTGWyGvYvCxBNLFDWb&text=MSFT")
                .get()
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                e.printStackTrace();
            }

            @Override
            public void onResponse(Response response) throws IOException {
                if(!response.isSuccessful()){
                    throw new IOException("unexpected code: " + response);
                }
                Gson gson = new Gson();
                final StockData[] stocks = gson.fromJson(response.body().string(),StockData[].class);

                if(stocks.length > 0){
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            TextView date = (TextView) findViewById(R.id.date);
                            date.setText("Datum " + String.valueOf(stocks[0].getLastTradeDate()));
                            addTextView("ASK: " + String.valueOf(stocks[0].getAsk()));
                            addTextView("BID: " + String.valueOf(stocks[0].getBid()));
                            addTextView("LOW: " + String.valueOf(stocks[0].getLow()));
                            addTextView("HIGH: "+ String.valueOf(stocks[0].getHigh()));
                            addTextView("OPEN: "+ String.valueOf(stocks[0].getOpen()));
                            addTextView("CLOSE: "+ String.valueOf(stocks[0].getClose()));
                            addTextView("VOLUME: "+ String.valueOf(stocks[0].getVolume()));

                            setTitle(String.valueOf(stocks[0].getSymbol() + " Microsoft stock"));
                        }
                    });
                }
            }
        });

    }

    private void addTextView(String text){
        TextView textView = new TextView(this);
        textView.setTextSize(18);
        textView.setTextColor(Color.BLACK);
        textView.setText(text);
        linearLayout = (LinearLayout) findViewById(R.id.linearLayout);
        linearLayout.addView(textView);
    }
}
