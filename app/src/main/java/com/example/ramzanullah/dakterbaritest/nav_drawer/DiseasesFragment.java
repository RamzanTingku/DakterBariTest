package com.example.ramzanullah.dakterbaritest.nav_drawer;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ramzanullah.dakterbaritest.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class DiseasesFragment extends Fragment {


    public DiseasesFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_diseases, container, false);
    }

}
