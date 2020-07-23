package com.myapps.Seviye1;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.myapps.R;

public class Listview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        ListView list=findViewById(R.id.list);
        ListView list2=findViewById(R.id.list2);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(),"index no:"+i,Toast.LENGTH_SHORT).show();
            }
        });
        String iller []=getResources().getStringArray(R.array.Sehirler);
        ArrayAdapter<String> adaptor = new ArrayAdapter<String>(getApplicationContext(),R.layout.spinner,iller);
        list2.setAdapter(adaptor);
    }
}
