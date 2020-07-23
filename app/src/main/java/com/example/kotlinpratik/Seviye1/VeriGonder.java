package com.example.kotlinpratik.Seviye1;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class VeriGonder extends AppCompatActivity {
    EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_veri_gonder);
        editText =findViewById(R.id.editText13);


    }

    public void Verigo(View view){
        CharSequence veri =     editText.getText();
        if(view.getId()==R.id.buttongonder){
            Intent verigonder = new Intent(getApplicationContext(),Getdata.class);
            verigonder.putExtra("data",veri);
            if(TextUtils.isEmpty(veri)){
                Toast.makeText(getApplicationContext(),"Empty Value!!!",Toast.LENGTH_LONG).show();
            }
            else
            startActivity(verigonder);
        }
    }
}
