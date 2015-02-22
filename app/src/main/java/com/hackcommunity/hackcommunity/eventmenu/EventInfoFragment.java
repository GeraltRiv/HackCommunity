package com.hackcommunity.hackcommunity.eventmenu;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.hackcommunity.hackcommunity.R;
import com.hackcommunity.hackcommunity.SignUpFragment;

/**
 * Created by taras on 21.02.2015.
 */
public class EventInfoFragment extends Fragment {

    ImageButton backButton;
    Button signUpButton;

    SignUpFragment signUpFragment;
    FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_event_info, null);

        signUpFragment = new SignUpFragment();
        fragmentTransaction = getActivity().getFragmentManager().beginTransaction();

        signUpButton = (Button) view.findViewById(R.id.button_sign_up);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.container_lyt,signUpFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        backButton = (ImageButton) view.findViewById(R.id.backButton);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        return view;
    }

}