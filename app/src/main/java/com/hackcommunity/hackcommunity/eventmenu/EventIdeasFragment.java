package com.hackcommunity.hackcommunity.eventmenu;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.hackcommunity.hackcommunity.IdeaListFragment;
import com.hackcommunity.hackcommunity.R;
import com.hackcommunity.hackcommunity.WriteIdeaFragment;

import java.util.ArrayList;

/**
 * Created by taras on 21.02.2015.
 */
public class EventIdeasFragment extends Fragment {

    ViewPager pager;
    PagerAdapter pagerAdapter;
    ImageButton backButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event_idea, null);

        pager = (ViewPager) view.findViewById(R.id.pager);

        pagerAdapter = new MyFragmentPagerAdapter(getActivity().getFragmentManager());

        pager.setAdapter(pagerAdapter);

        backButton = (ImageButton) view.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });

        return view;
    }
    public class MyFragmentPagerAdapter extends FragmentPagerAdapter{
        ArrayList<Fragment> fragments;
        ArrayList<String> titles;

        public MyFragmentPagerAdapter(FragmentManager fm) {
            super(fm);

            fragments = new ArrayList<>();
            fragments.add(new IdeaListFragment());
            fragments.add(new WriteIdeaFragment());

            titles = new ArrayList<>();
            titles.add("Список ідей");
            titles.add("Написати ідею");
        }

        @Override
        public Fragment getItem(int position) {
            return fragments.get(position);
        }

        @Override
        public int getCount() {
            return fragments.size();
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return titles.get(position);
        }
    }
}