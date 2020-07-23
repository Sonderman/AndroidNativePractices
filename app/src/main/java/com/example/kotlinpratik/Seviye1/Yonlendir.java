package com.example.kotlinpratik.Seviye1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class Yonlendir extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yonlendir);


    }
    public  void yon(View view){
        switch (view.getId()){
            case R.id.google: {
                Intent intent1 = new Intent(Intent.ACTION_VIEW);
                intent1.setData(Uri.parse("http://www.google.com"));
                startActivity(intent1);
            }
                break;
            case R.id.youtube: {
                Intent intent2 = new Intent(Intent.ACTION_VIEW);
                intent2.setData(Uri.parse("http://www.youtube.com"));
                startActivity(intent2);
            }
                break;
            case R.id.facebook:{
                Intent intent3 = new Intent(Intent.ACTION_VIEW);
                intent3.setData(Uri.parse("http://www.facebook.com"));
                startActivity(intent3);
            }
                break;
        }
    }
}
