package com.example.ramzanullah.dakterbaritest.Login;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.ramzanullah.dakterbaritest.nav_drawer.HomeActivity;
import com.example.ramzanullah.dakterbaritest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class VerificationFragment extends Fragment {

    private Button verifyBTN;

    public VerificationFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_verification, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        verifyBTN = getView().findViewById(R.id.btn_verify);
        verifyBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getActivity(), HomeActivity.class );
                getActivity().startActivity(i);

            }
        });
    }
}
