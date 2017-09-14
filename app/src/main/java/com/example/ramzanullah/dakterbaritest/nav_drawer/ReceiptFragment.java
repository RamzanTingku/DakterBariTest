package com.example.ramzanullah.dakterbaritest.nav_drawer;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ramzanullah.dakterbaritest.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ReceiptFragment extends Fragment implements View.OnClickListener {

    public Context context;
    private Button payNowBTN, payLaterBTN;
    private TextView msgTV, phoneCallTV, vidChatTV;
    private ImageView msgIV, phoneCallIV, vidChatIV;


    public ReceiptFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_receipt, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        payNowBTN = getView().findViewById(R.id.btn_pay_now);
        payLaterBTN = getView().findViewById(R.id.btn_pay_later);
        msgTV = getView().findViewById(R.id.tv_msg);
        vidChatTV = getView().findViewById(R.id.tv_vid_chat);
        phoneCallTV = getView().findViewById(R.id.tv_call_from_doc);
        msgIV = getView().findViewById(R.id.iv_msg);
        vidChatIV = getView().findViewById(R.id.iv_vid_chat);
        phoneCallIV = getView().findViewById(R.id.iv_call_from_doc);



        payNowBTN.setOnClickListener(this);
        payLaterBTN.setOnClickListener(this);
        msgTV.setOnClickListener(this);
        msgIV.setOnClickListener(this);
        vidChatTV.setOnClickListener(this);
        vidChatIV.setOnClickListener(this);
        phoneCallTV.setOnClickListener(this);
        phoneCallIV.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        Fragment fragment = null;
        FragmentManager fm = getActivity().getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();

        switch (view.getId()) {
            case R.id.btn_pay_now:
                fragment = new AppointmentFragment();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                break;
            case R.id.btn_pay_later:
                fragment = new AppointmentFragment();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
                break;
            case R.id.tv_msg:
                fragment = new ChatFragment();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                break;
            case R.id.tv_vid_chat:
                fragment = new ChatFragment();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                break;
            case R.id.tv_call_from_doc:
                fragment = new ChatFragment();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                break;
            case R.id.iv_msg:
                fragment = new ChatFragment();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                break;
            case R.id.iv_vid_chat:
                fragment = new ChatFragment();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                break;
            case R.id.iv_call_from_doc:
                fragment = new ChatFragment();
                ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_OPEN);
                break;
        }

        ft.replace(R.id.frame_content, fragment);
        ft.addToBackStack(null);
        ft.commit();



    }
}
