package com.example.kotlinpratik.Seviye1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class ToastMessage extends AppCompatActivity {
    Button toast,toresim,oztoast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toastmessage);
        toast = findViewById(R.id.toastbutton);
        toresim = findViewById(R.id.resimtoast);
        oztoast = findViewById(R.id.ozaltoast);
        oztoast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView textView= new TextView(ToastMessage.this);
                textView.setText("Özelleştirilmiş mesaj");
                textView.setBackgroundColor(Color.GREEN);
                textView.setPadding(16,16,16,16);
                textView.setTextColor(Color.RED);
                Toast toast = new Toast(ToastMessage.this);
                toast.setView(textView);
                toast.show();
            }
        });
        toresim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ImageView rsm = new ImageView(ToastMessage.this);
                rsm.setImageResource(R.drawable.r1);
                Toast tresim = new Toast(ToastMessage.this);
                tresim.setView(rsm);
                tresim.setDuration(Toast.LENGTH_LONG);
                tresim.show();
            }
        });
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Bu bir toast mesajıdır", Toast.LENGTH_LONG).show();
            }
        });
    }
}