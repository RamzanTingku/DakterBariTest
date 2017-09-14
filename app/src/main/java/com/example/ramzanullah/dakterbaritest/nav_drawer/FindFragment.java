package com.example.ramzanullah.dakterbaritest.nav_drawer;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ramzanullah.dakterbaritest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class FindFragment extends Fragment {

    public Context context;
    private Button consultOnlineBTN;



    public FindFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_find, container, false);
    }


    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        consultOnlineBTN = getView().findViewById(R.id.btn_consult_online);
        consultOnlineBTN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment fragment = null;
                FragmentManager fm = getActivity().getSupportFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                fragment = new ReceiptFragment();
                ft.replace(R.id.frame_content, fragment);
                ft.addToBackStack(null);
                ft.commit();
            }
        });


    }



}
