package com.kekec_apps.android.happyinvestor;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.kekec_apps.android.happyinvestor.model.StockData;

/**
 * Created by Janko on 20.5.2016.

public class CompaniesAdapter extends BaseAdapter {
    private final LayoutInflater inflater;
    private StockData[] data;

    public CompaniesAdapter(Context context){
        this.inflater = LayoutInflater.from(context);
    }

    public  void  setItems(StockData[] data){
        this.data = data;
        notifyDataSetChanged();
    }

    @Override
    public int getCount() {
     if(data != null){
         return data.length;
     }else {
         return 0;
     }
    }

    @Override
    public StockData getItem(int position) {
        return data[position];
    }

    //@Override
    //public int getItemId(int position) {
      //  return getItem(position);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if(view == null){
            view = inflater.inflate(android.R.layout.simple_list_item_1, parent, false);
        }
        StockData item = getItem(position);
        TextView textView = (TextView) view.findViewById(android.R.id.text1);
        double price = item.getPrice();
        String date = item.getDate();
        String priceString = String.valueOf(price);
        textView.setText(date + " \t " + priceString);

        return view;
    }
}
 */
