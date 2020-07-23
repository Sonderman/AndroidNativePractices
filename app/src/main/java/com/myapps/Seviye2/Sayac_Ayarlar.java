package com.myapps.Seviye2;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import androidx.annotation.Nullable;

import com.myapps.R;

public class Sayac_Ayarlar extends PreferenceActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.sayac_menu);
    }
}
