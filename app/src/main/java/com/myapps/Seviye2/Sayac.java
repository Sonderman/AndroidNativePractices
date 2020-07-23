package com.myapps.Seviye2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.os.Bundle;
import android.preference.PreferenceManager;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.myapps.R;

public class Sayac extends AppCompatActivity implements SharedPreferences.OnSharedPreferenceChangeListener {
    int sayac;
    Button btn;
    RelativeLayout arka;
    boolean ses, titresim;
    SharedPreferences sharedPreferences, ayarlar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sayac);



        btn = findViewById(R.id.counter);
        arka = findViewById(R.id.arkaplan);
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        ayarlar = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        ayarla();
        sayac = sharedPreferences.getInt("sayac_key", 0);
        btn.setText("" + sayac);
    }


    private void ayarla() {
        String arkapoz = ayarlar.getString("arkaplan", "2");
        switch (Integer.valueOf(arkapoz)) {
            case 0:
                arka.setBackgroundColor(Color.YELLOW);
                break;
            case 1:
                arka.setBackgroundColor(Color.BLUE);
                break;
            case 2:
                arka.setBackgroundColor(Color.GREEN);
                break;
        }
        ses = ayarlar.getBoolean("ses", false);
        titresim = ayarlar.getBoolean("titreşim", false);
        ayarlar.registerOnSharedPreferenceChangeListener(Sayac.this);
    }

    public void Sayac(View view) {
        if (view.getId() == R.id.counter) {
            sayac++;
            btn.setText("" + sayac);
        }
    }

    @Override
    protected void onPause() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        if (sayac > 100) {
            sayac = 0;
        }
        editor.putInt("sayac_key", sayac);
        editor.commit();
        super.onPause();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.sayac_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.ayarlar) {
            Intent settings = new Intent(getApplicationContext(), Sayac_Ayarlar.class);
            startActivity(settings);
            return true;
        }
        /*if (id == R.id.Level2) {

            Intent level2 = new Intent(getApplicationContext(),Level2.class);
            startActivity(level2);
            return true;
        }*/

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String key) {
        ayarla();
    }
}
