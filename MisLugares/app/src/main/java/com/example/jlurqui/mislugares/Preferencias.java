package com.example.jlurqui.mislugares;

import android.os.Bundle;
import android.preference.PreferenceActivity;

/**
 * Created by Javi on 29/04/2015.
 */
public class Preferencias extends PreferenceActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferencias);
    }

}
