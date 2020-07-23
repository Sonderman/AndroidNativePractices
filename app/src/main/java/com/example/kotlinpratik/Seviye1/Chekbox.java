package com.example.kotlinpratik.Seviye1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class Chekbox extends AppCompatActivity {

     CheckBox check;
    Button chkbuton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        check = findViewById(R.id.onaylacheck);
        chkbuton = findViewById(R.id.buttoncheck);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean active=check.isChecked();
                if(active==true){
                    chkbuton.setEnabled(true);
                }
                else{
                    chkbuton.setEnabled(false);
                }
            }
        });

        chkbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chkbuton.setEnabled(false);
                check.setChecked(false);
            }
        });
    }

}
