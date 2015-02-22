package com.hackcommunity.hackcommunity.eventmenu;

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

import com.hackcommunity.hackcommunity.R;

/**
 * Created by taras on 21.02.2015.
 */
public class EventMenuFragment extends Fragment{

    EventInfoFragment    eventInfoFragment;
    EventIdeasFragment   eventIdeasFragment;
    EventFriendsFragment eventFriendsFragment;
    EventFoodFragment    eventFoodFragment;
    EventHostelsFragment eventHostelsFragment;
    EventWayToFragment   eventWayToFragment;

    FragmentTransaction fragmentTransaction;


    ImageButton imageButtonInfo;
    ImageButton imageButtonIdea;
    ImageButton imageButtonFriends;
    ImageButton imageButtonFood;
    ImageButton imageButtonHostel;
    ImageButton imageButtonWayTo;

    ImageButton imageBackButton;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event_menu, null);

        eventInfoFragment    = new EventInfoFragment();
        eventFriendsFragment = new EventFriendsFragment();
        eventFoodFragment    = new EventFoodFragment();
        eventHostelsFragment = new EventHostelsFragment();
        eventWayToFragment   = new EventWayToFragment();

        fragmentTransaction = getActivity().getFragmentManager().beginTransaction();

        imageButtonInfo    = (ImageButton) view.findViewById(R.id.imageButtonInfo);
        imageButtonIdea    = (ImageButton) view.findViewById(R.id.imageButtonIdea);
        imageButtonFriends = (ImageButton) view.findViewById(R.id.imageButtonFriends);
        imageButtonFood    = (ImageButton) view.findViewById(R.id.imageButtonFood);
        imageButtonHostel  = (ImageButton) view.findViewById(R.id.imageButtonHostel);
        imageButtonWayTo   = (ImageButton) view.findViewById(R.id.imageButtonWayTo);

        imageBackButton    = (ImageButton) view.findViewById(R.id.backButton);

        imageButtonInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.container_lyt, eventInfoFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();

            }
        });
        imageButtonIdea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.container_lyt, new EventIdeasFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        imageButtonFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.container_lyt, eventFriendsFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        imageButtonFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.container_lyt, new EventFoodFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        imageButtonHostel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.container_lyt, new EventHostelsFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
        imageButtonWayTo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.container_lyt, eventWayToFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        imageBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });

        return view;
    }

}
