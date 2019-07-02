package com.example.listadetareas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Se obtienen las referencias de la UI
        ListView lvTarea = findViewById(R.id.listViewTarea);

        final EditText etTarea = findViewById(R.id.editTextTarea);
        // Creamos un arrayList de tareas, y agregamos algunas tareas
        final ArrayList<String> tareas = new ArrayList<String>();
        tareas.add("Tarea 1");
        tareas.add("Tarea 2");

        //3. Creamos el adaptador que enlazara el arreglo con el ListView
        // Utilizamos un layout que ya nos proporciona Android: simple_list_item_1
        final ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, tareas);
        //4. Enlazamos el adaptador de datos con el ListView
        lvTarea.setAdapter(adaptador);
        //5. Capturamos el evento Enter para agregar nuevos elementos
        etTarea.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                if (event.getAction()==KeyEvent.ACTION_DOWN){
                    if (keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER){
                        //Agregamos la nueva tarea
                        tareas.add(etTarea.getText().toString());
                        etTarea.setText("");
                        //Notificamos el cambio en la lista de tareas
                        adaptador.notifyDataSetChanged();
                        return true;
                    }
                }
                return false;
            }
        });
    }
}
