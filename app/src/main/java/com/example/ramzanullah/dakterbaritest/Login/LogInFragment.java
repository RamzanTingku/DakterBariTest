package com.example.ramzanullah.dakterbaritest.Login;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ramzanullah.dakterbaritest.HomeActivity;
import com.example.ramzanullah.dakterbaritest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class LogInFragment extends Fragment implements View.OnClickListener{

    public Button loginBTN, goSignupBTN;


    public LogInFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loginBTN = getView().findViewById(R.id.btn_logIn);
        goSignupBTN = getView().findViewById(R.id.btn_go_signup_page);

        loginBTN.setOnClickListener(this);
        goSignupBTN.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Fragment fragment = null;
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        switch (view.getId()) {
            case R.id.btn_logIn:
                Intent i = new Intent(getActivity(), HomeActivity.class );
                getActivity().startActivity(i);
                break;
            case R.id.btn_go_signup_page:
                fragment = new SignupFragment();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                ft.replace(R.id.login_fragment_container, fragment);
                ft.addToBackStack(null);
                ft.commit();
                break;

        }

    }
}
