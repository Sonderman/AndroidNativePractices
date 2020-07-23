package com.myapps.Seviye1;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.myapps.R;

public class Paylas extends AppCompatActivity {
    private  EditText paylastext;
    private Button paylasbuton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paylas);
        paylastext = findViewById(R.id.textpaylasim);
        paylasbuton = findViewById(R.id.paylasbutonu);

        paylasbuton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String mesaj= paylastext.getText().toString();
                mesajP(mesaj);
            }
        });
    }

    private void mesajP(String mesaj) {
        Intent payintent= new Intent(Intent.ACTION_SEND);
        payintent.setType("text");
        payintent.putExtra(Intent.EXTRA_TEXT,mesaj);
        startActivity(Intent.createChooser(payintent,"Paylaşım"));
    }


}
