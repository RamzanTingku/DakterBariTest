package com.example.ramzanullah.dakterbaritest.Login;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ramzanullah.dakterbaritest.R;

public class LogInActivity extends AppCompatActivity {

  /* private ActionBar actionBar;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       /* actionBar = getSupportActionBar();
        actionBar.hide();
*/
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        LogInFragment logInFragment = new LogInFragment();
        ft.replace(R.id.login_fragment_container, logInFragment);
        ft.addToBackStack(null);
        ft.commit();
    }
}
