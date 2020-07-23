package com.example.kotlinpratik.Seviye1;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class Context_Menu extends AppCompatActivity {
    ListView listecontex;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context__menu);
        String Sehirler[] = getResources().getStringArray(R.array.Sehirler);
        listecontex = findViewById(R.id.listecontext);
        adapter = new ArrayAdapter<String>(getApplicationContext(), R.layout.context_listview, Sehirler);
        listecontex.setAdapter(adapter);
        registerForContextMenu(listecontex);


    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        AdapterView.AdapterContextMenuInfo menuInfo = (AdapterView.AdapterContextMenuInfo) item.getMenuInfo();
        switch (item.getItemId()) {

            case R.id.paylas:

                Toast.makeText(this,"Paylasıldı", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.kaydet:

                Toast.makeText(this,"Kaydedildi", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.sil:

                Toast.makeText(this, "Silindi", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onContextItemSelected(item);
    }
}
