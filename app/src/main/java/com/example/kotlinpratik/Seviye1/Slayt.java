package com.example.kotlinpratik.Seviye1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class Slayt extends AppCompatActivity {
    ImageView resim;
    Button geri;
    Button ileri;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.slaytbuton);

        resim = findViewById(R.id.resm);
        geri = findViewById(R.id.button2);
        ileri = findViewById(R.id.button1);
        islev();
    }

    public void islev() {
        resim.setImageResource(R.drawable.r1);
        ileri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resim.getDrawable().getConstantState() == resim.getResources().getDrawable(R.drawable.r1).getConstantState()){
                    resim.setImageResource(R.drawable.r2);
                }
                else if(resim.getDrawable().getConstantState()==resim.getResources().getDrawable(R.drawable.r2).getConstantState()){
                    resim.setImageResource(R.drawable.r3);
                }
                else if(resim.getDrawable().getConstantState()==resim.getResources().getDrawable(R.drawable.r3).getConstantState()){
                    resim.setImageResource(R.drawable.r4);
                }
                else if(resim.getDrawable().getConstantState()==resim.getResources().getDrawable(R.drawable.r4).getConstantState()){
                    resim.setImageResource(R.drawable.r5);
                }
                else if(resim.getDrawable().getConstantState()==resim.getResources().getDrawable(R.drawable.r5).getConstantState()){
                    resim.setImageResource(R.drawable.r1);
                }
            }
        });
        geri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(resim.getDrawable().getConstantState() == resim.getResources().getDrawable(R.drawable.r5).getConstantState()){
                    resim.setImageResource(R.drawable.r4);
                }
                else if(resim.getDrawable().getConstantState()==resim.getResources().getDrawable(R.drawable.r4).getConstantState()){
                    resim.setImageResource(R.drawable.r3);
                }
                else if(resim.getDrawable().getConstantState()==resim.getResources().getDrawable(R.drawable.r3).getConstantState()){
                    resim.setImageResource(R.drawable.r2);
                }
                else if(resim.getDrawable().getConstantState()==resim.getResources().getDrawable(R.drawable.r2).getConstantState()){
                    resim.setImageResource(R.drawable.r1);
                }
                else if(resim.getDrawable().getConstantState()==resim.getResources().getDrawable(R.drawable.r1).getConstantState()){
                    resim.setImageResource(R.drawable.r5);
                }
            }
        });
    }
}
