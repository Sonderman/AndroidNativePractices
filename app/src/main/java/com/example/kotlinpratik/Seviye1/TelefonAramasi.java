package com.example.kotlinpratik.Seviye1;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class TelefonAramasi extends AppCompatActivity {

    Button ara ;
    EditText numara;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telefon_aramasi);
     ara= findViewById(R.id.buttonArama);
     numara =findViewById(R.id.numara);

    ara.setOnClickListener(new View.OnClickListener() {
        @SuppressLint("MissingPermission")
        @Override
        public void onClick(View view) {
            if(TextUtils.isEmpty(numara.getText())){
                Toast.makeText(getApplicationContext(),"Lütfen Bir Numara Giriniz",Toast.LENGTH_LONG).show();
            }
            else{

                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+ numara.getText().toString()));
                startActivity(intent);
            }
        }
    });
    }


}