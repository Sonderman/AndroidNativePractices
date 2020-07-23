package com.myapps.Seviye1;

import android.graphics.Color;
import android.os.Bundle;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.myapps.R;


public class Background_Color_Changer extends AppCompatActivity {

    Button kirmizi, sari;
    ConstraintLayout back;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bacground_color_changer);

        kirmizi = findViewById(R.id.kirmizi);
        sari = findViewById(R.id.sari);
        back = findViewById(R.id.background);

        kirmizi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                back.setBackgroundColor(Color.RED);
            }
        });
        sari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            back.setBackgroundColor(Color.YELLOW);
            }
        });

    }

}