package com.hackcommunity.hackcommunity;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;

import com.hackcommunity.hackcommunity.eventmenu.EventMenuFragment;

/**
 * Created by taras on 21.02.2015.
 */
public class SignUpFragment extends Fragment {

    ImageButton backButton;
    Button signUpConfirm;

    EventMenuFragment eventMenuFragment;
    FragmentTransaction fragmentTransaction;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_sigh_up_event, null);

        eventMenuFragment = new EventMenuFragment();
        fragmentTransaction = getActivity().getFragmentManager().beginTransaction();
        signUpConfirm = (Button) view.findViewById(R.id.button_sign_up_confirm);
        signUpConfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentTransaction.replace(R.id.container_lyt,eventMenuFragment);
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
