package com.myapps.Seviye1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.TextView;

import com.myapps.R;


public class Getdata extends AppCompatActivity {
    TextView basyazi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veri_al);

        basyazi = findViewById(R.id.ekranabas);

        Bundle  gelenyazi = getIntent().getExtras();
        CharSequence gelenveri = gelenyazi.getCharSequence("data");

        basyazi.setText(gelenveri);

    }
}
