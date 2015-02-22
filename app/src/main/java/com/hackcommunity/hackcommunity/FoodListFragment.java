package com.hackcommunity.hackcommunity;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.hackcommunity.hackcommunity.adapters.FoodOrHostListAdapter;
import com.hackcommunity.hackcommunity.model.FoodOrHost;

import java.util.ArrayList;

/**
 * Created by taras on 22.02.2015.
 */
public class FoodListFragment extends Fragment {

    ListView listView;
    ArrayList<FoodOrHost> list;
    FoodOrHostListAdapter adapter;
    boolean food;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_food_or_host_list, null);

        listView = (ListView) view.findViewById(R.id.foodOrHostListView);
        list = new ArrayList<>();
        list.add(new FoodOrHost(getActivity().getResources().getDrawable(R.drawable.cafe_beer_fish),"Beer Fish"));
        list.add(new FoodOrHost(getActivity().getResources().getDrawable(R.drawable.cafe_karnaval),"Cafe CARNAVAL"));
        list.add(new FoodOrHost(getActivity().getResources().getDrawable(R.drawable.cafe_traktir),"Traktir"));

        adapter = new FoodOrHostListAdapter(getActivity(),list);
        listView.setAdapter(adapter);

        return view;
    }
}
