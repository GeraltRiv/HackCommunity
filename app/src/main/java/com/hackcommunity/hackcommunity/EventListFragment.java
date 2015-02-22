package com.hackcommunity.hackcommunity;


import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

import com.hackcommunity.hackcommunity.eventmenu.EventMenuFragment;

/**
 * Created by taras on 21.02.2015.
 */
public class EventListFragment extends Fragment {

    EventMenuFragment eventMenuFragment;
    FragmentTransaction fragmentTransaction;
    ImageButton hackthon;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event_list, null);

        eventMenuFragment = new EventMenuFragment();
        hackthon = (ImageButton) view.findViewById(R.id.hackimg);
        hackthon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction = getActivity().getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.container_lyt, eventMenuFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        return view;
    }
}
