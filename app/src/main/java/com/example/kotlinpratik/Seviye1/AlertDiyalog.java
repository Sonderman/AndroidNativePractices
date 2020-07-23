package com.example.kotlinpratik.Seviye1;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Toast;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class AlertDiyalog extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert_diyalog);



    }

    public void diyalog(View view) {
        switch (view.getId()){
            case R.id.alert:
                AlertDialog.Builder builder= new AlertDialog.Builder(this);
                builder.setTitle("Uyarı");
                builder.setMessage("Eminmisin?");
                builder.setIcon(android.R.drawable.arrow_down_float);
                builder.setCancelable(false);
                //AlertDialog alertDialog = builder.create();
                //alertDialog.show();
                builder.setPositiveButton("Evet", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
                builder.setNegativeButton("Hayır", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                builder.create().show();
                break;

            case R.id.listediyalog:
               final String[] sehirler = getResources().getStringArray(R.array.Sehirler);
                AlertDialog.Builder builder1=new AlertDialog.Builder(this);
                builder1.setTitle("Liste");
                builder1.setItems(sehirler, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(getApplicationContext(),"Secilen Sehir:"+ sehirler[which] ,Toast.LENGTH_LONG).show();
                    }
                });
                builder1.create().show();

                break;
            case R.id.customdiyalog:
                final Dialog dialog= new Dialog(this);
                dialog.setContentView(R.layout.custom_dialog);
                Button kaydet = dialog.findViewById(R.id.dialogkaydet);
                Button vazgec = dialog.findViewById(R.id.dialogvazgec);
                DatePicker datePicker = dialog.findViewById(R.id.datepicker);
                kaydet.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                        Toast.makeText(getApplicationContext(),"Kaydedildi",Toast.LENGTH_SHORT).show();
                    }
                });
                vazgec.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.cancel();
                        Toast.makeText(getApplicationContext(),"Vazgeçildi",Toast.LENGTH_SHORT).show();
                    }
                });
                dialog.setTitle("Custom Dialog");

                dialog.show();
                break;

        }

    }
}
