package com.hackcommunity.hackcommunity.eventmenu;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hackcommunity.hackcommunity.R;

/**
 * Created by taras on 21.02.2015.
 */
public class EventFriendsFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event_friends, null);

        return view;
    }

}