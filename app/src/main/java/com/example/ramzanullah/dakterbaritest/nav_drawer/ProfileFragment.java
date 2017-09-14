package com.example.ramzanullah.dakterbaritest.nav_drawer;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ramzanullah.dakterbaritest.R;
import com.example.ramzanullah.dakterbaritest.adapter.ViewPagerAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProfileFragment extends Fragment {



    public TabLayout mTabLayout;
    public ViewPager mViewPager;
    public ViewPagerAdapter adapter;


    public ProfileFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initViewPager();
        initTab();
    }

    public void initViewPager(){
        mViewPager = (ViewPager)getView().findViewById(R.id.viewPager);
        setUpViewPager(mViewPager);
    }

    public void initTab(){
        mTabLayout = (TabLayout)getView(). findViewById(R.id.tabs);
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public void setUpViewPager(ViewPager viewPager) {
        adapter = new ViewPagerAdapter(getActivity().getSupportFragmentManager());

        adapter.addFragment(new DoctorFragment(),"Doctor");
        adapter.addFragment(new DiseasesFragment(),"Diseases");
        adapter.addFragment(new MedicineFragment(),"Medicine");

        viewPager.setAdapter(adapter);
    }



}
