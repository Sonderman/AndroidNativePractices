package com.example.kotlinpratik.Seviye1;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class TextView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_view);
        AutoCompleteTextView autotext;
        MultiAutoCompleteTextView mautotext;
        autotext= findViewById(R.id.autoCompleteTextView);
        mautotext=findViewById(R.id.multiAutoCompleteTextView);

        String [] auto =getResources().getStringArray(R.array.Sehirler);
        ArrayAdapter<String> adapterum = new ArrayAdapter<String>(getApplicationContext(),android.R.layout.simple_dropdown_item_1line,auto);
        autotext.setAdapter(adapterum);
        mautotext.setAdapter(adapterum);
        mautotext.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }

}
