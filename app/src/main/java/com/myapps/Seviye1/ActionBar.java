package com.myapps.Seviye1;

import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.NavUtils;
import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;

import com.myapps.Level1;
import com.myapps.R;

public class ActionBar extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_bar);
        androidx.appcompat.app.ActionBar ab =getSupportActionBar();
        ab.setTitle("Başlık");
        ab.setSubtitle("AltBaşlık");
        ab.setBackgroundDrawable(getResources().getDrawable(R.drawable.buton_tasarimi2));
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId()==android.R.id.home){
            Intent intent = new Intent(getApplicationContext(),Level1.class);
            NavUtils.navigateUpTo(this,intent);
            return  true;
        }
        return super.onOptionsItemSelected(item);
    }
}
