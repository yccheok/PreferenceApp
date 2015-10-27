package com.madlymad.preferenceapp;

import android.os.Bundle;

/**
 * A simple Preference Fragment that shows the xml on Demand.
 */
public class MyInnerPreferenceFragment extends AppPreferenceFragment {

    public static final String FRAGMENT_TAG = "my_inner_preference_fragment";

    public MyInnerPreferenceFragment() {
    }

    @Override
    public void onCreatePreferences(Bundle bundle, String rootKey) {
        setPreferencesFromResource(R.xml.preferences, rootKey);
    }

}