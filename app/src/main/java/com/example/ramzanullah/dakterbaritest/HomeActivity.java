package com.example.ramzanullah.dakterbaritest;

import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

public class HomeActivity extends AppCompatActivity {

    private Toolbar mToolbar;
    private ActionBar mActionBar;
    private NavigationView mNavigationView;

     @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
         initToolbar();
         initDrawer();
    }

    public void initToolbar(){
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayHomeAsUpEnabled(false);
        mActionBar.setHomeButtonEnabled(true);
    }

    public void initDrawer(){
        final DrawerLayout mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_home_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open,
                R.string.navigation_drawer_close){
            @Override
            public void onDrawerOpened(View drawerView) {
                //hide keybord
                hideKeyBoard();
                super.onDrawerOpened(drawerView);
            }
        };
        mDrawerLayout.setDrawerListener(toggle);
        toggle.syncState();

        mNavigationView = (NavigationView) findViewById(R.id.nav_layout);
        mNavigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                item.setCheckable(true);
                //displayFragment(item.getItemId(), item.getTitle().toString());
                mDrawerLayout.closeDrawers();
                return true;
            }
        });
    }

    public void hideKeyBoard(){
        View view = this.getCurrentFocus();
        if (view != null){
            InputMethodManager imm = (InputMethodManager) getSystemService(INPUT_METHOD_SERVICE);
            imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_home_layout);
        if (drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
        }else {
            doExitApp();
        }
    }

    public void doExitApp(){
        finish();
    }


}
