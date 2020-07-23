package com.myapps.Seviye1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.myapps.R;

public class Buton_Kullanimi extends AppCompatActivity implements View.OnClickListener {
    Button bt1,bt2,bt3,bt4,bt5,bt6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.buton_kullanimi);

        bt1= findViewById(R.id.button1);
        bt2= findViewById(R.id.button2);
        bt3= findViewById(R.id.button3);
        bt4= findViewById(R.id.button4);
        bt5= findViewById(R.id.button5);
        bt6= findViewById(R.id.button6);
        bt1.setOnClickListener(this);
        bt2.setOnClickListener(this);
        bt3.setOnClickListener(this);
        bt4.setOnClickListener(this);
        bt5.setOnClickListener(this);
        bt6.setOnClickListener(this);
    }

    public  void clickmetod(View view){
        switch (view.getId()){
            case R.id.button_n1: Toast.makeText(getApplicationContext(),"2.yöntembuton1 basıldı",Toast.LENGTH_SHORT).show();
                break;
            case R.id.button_n2: Toast.makeText(getApplicationContext(),"2.yöntembuton2 basıldı",Toast.LENGTH_SHORT).show();
                break;
        }
    }
    @Override
    public void onClick(View view) {
    int id=view.getId();
    switch (id){
        case R.id.button1:
            Toast.makeText(getApplicationContext(),"Button1 Basıldı",Toast.LENGTH_SHORT).show();
            break;
        case R.id.button2:
            Toast.makeText(getApplicationContext(),"Button2 Basıldı",Toast.LENGTH_SHORT).show();
            break;
        case R.id.button3:
            Toast.makeText(getApplicationContext(),"Button3 Basıldı",Toast.LENGTH_SHORT).show();
            break;
        case R.id.button4:
            Toast.makeText(getApplicationContext(),"Button4 Basıldı",Toast.LENGTH_SHORT).show();
            break;
        case R.id.button5:
            Toast.makeText(getApplicationContext(),"Button5 Basıldı",Toast.LENGTH_SHORT).show();
            break;
        case R.id.button6:
            Toast.makeText(getApplicationContext(),"Button6 Basıldı",Toast.LENGTH_SHORT).show();
            break;
    }
    }
}
