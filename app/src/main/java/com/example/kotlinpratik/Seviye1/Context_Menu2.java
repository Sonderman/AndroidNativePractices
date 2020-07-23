package com.example.kotlinpratik.Seviye1;

import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.example.kotlinpratik.R;


public class Context_Menu2 extends AppCompatActivity {
    private ActionMode actionMode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_context_2);
       final TextView cont;

         cont = findViewById(R.id.conyazi);
        cont.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {

                if(actionMode!=null){
                    return false;
                }
                Myactionmode myactionmode = new Myactionmode();
                actionMode= startActionMode(myactionmode);
                cont.setSelected(true);
                return true;
            }
        });

    }


    class Myactionmode implements ActionMode.Callback{


        @Override
        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            mode.getMenuInflater().inflate(R.menu.context_menu,menu);
            return true;
        }

        @Override
        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            return false;
        }

        @Override
        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            switch (item.getItemId()) {

                case R.id.paylas:

                    Toast.makeText(getApplicationContext(),"Paylasıldı", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.kaydet:

                    Toast.makeText(getApplicationContext(),"Kaydedildi", Toast.LENGTH_SHORT).show();
                    return true;
                case R.id.sil:

                    Toast.makeText(getApplicationContext(), "Silindi", Toast.LENGTH_SHORT).show();
                    return true;
            }
            return false;
        }

        @Override
        public void onDestroyActionMode(ActionMode mode) {
        actionMode=null;
        }
    }
}
