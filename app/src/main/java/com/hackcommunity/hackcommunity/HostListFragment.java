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
public class HostListFragment extends Fragment {

    ListView listView;
    ArrayList<FoodOrHost> list;
    FoodOrHostListAdapter adapter;
    boolean food;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_host_list_view, null);

        listView = (ListView) view.findViewById(R.id.hostListView);
        list = new ArrayList<>();
        list.add(new FoodOrHost(getActivity().getResources().getDrawable(R.drawable.lx_gostinicca),"Gostinicca"));
        list.add(new FoodOrHost(getActivity().getResources().getDrawable(R.drawable.otel_obereg),"Hotel Obereg"));
        adapter = new FoodOrHostListAdapter(getActivity(),list);
        listView.setAdapter(adapter);

        return view;
    }
}
