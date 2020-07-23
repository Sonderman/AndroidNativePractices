package com.myapps.Seviye1;

import android.graphics.Typeface;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import com.myapps.R;

public class ArkaPlan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.arkaplan);

        Typeface type = Typeface.createFromAsset(getAssets(), "font/nightype.ttf");
        TextView ark_ptext = findViewById(R.id.metintext);
        ark_ptext.setTypeface(type);
        TextView hello = findViewById(R.id.Arka_yazi);
        hello.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"Hello",Toast.LENGTH_SHORT).show();
            }


        });

    }

}
