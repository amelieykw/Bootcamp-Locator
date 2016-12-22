package com.yukaiwen.bootcamplocator.activities;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import com.yukaiwen.bootcamplocator.R;
import com.yukaiwen.bootcamplocator.fragments.MainFragment;

public class MapsActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        // load the MainFragment
        MainFragment mainFragment = (MainFragment) getSupportFragmentManager().findFragmentById(R.id.container_main);
        // if the mainFragment doesn't exist, create an instance of mainFragment
        if(mainFragment == null) {
            mainFragment = MainFragment.newInstance();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.container_main, mainFragment)
                    .commit();
        }
    }
}
