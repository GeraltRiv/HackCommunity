package com.hackcommunity.hackcommunity.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.hackcommunity.hackcommunity.R;
import com.hackcommunity.hackcommunity.model.FoodOrHost;

import java.util.ArrayList;

/**
 * Created by taras on 22.02.2015.
 */
public class FoodOrHostListAdapter extends BaseAdapter {
    Context context;
    ArrayList<FoodOrHost> list;
    private static LayoutInflater inflater = null;

    public FoodOrHostListAdapter(Context context, ArrayList<FoodOrHost> list) {
        this.context = context;
        this.list = list;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup viewGroup) {
        View view = convertView;
        if (view == null) {
            view = inflater.inflate(R.layout.list_item_food_or_host, viewGroup, false);
        }
        ImageView image = (ImageView) view.findViewById(R.id.image);
        TextView textView = (TextView) view.findViewById(R.id.title_tv);

        FoodOrHost foodOrHost = (FoodOrHost) getItem(i);

        image.setImageDrawable(foodOrHost.getPicture());
        textView.setText(foodOrHost.getTitle());
        return view;
    }
}
