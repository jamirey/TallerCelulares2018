package com.holamundo.tallercelulares;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte1 extends AppCompatActivity {

    private TableLayout Tabla;
    private ArrayList<Celular> celulares;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte1);

        Tabla = (TableLayout)findViewById(R.id.tabla);
        celulares = Datos.obtener();

        for (int i = 0; i <celulares.size() ; i++) {

            if((celulares.get(i).getMarca().equalsIgnoreCase("Samsung") && celulares.get(i).getColor().equalsIgnoreCase("Negro")&& celulares.get(i).getSistemaOperativo().equalsIgnoreCase("Andorid"))){
                TableRow fila = new TableRow(this);
                TextView c1 = new TextView(this);
                TextView c2 = new TextView(this);
                TextView c3 = new TextView(this);
                TextView c4 = new TextView(this);
                TextView c5 = new TextView(this);
                TextView c6 = new TextView(this);

                c1.setText(""+(i+1));
                c2.setText(celulares.get(i).getMarca());
                c3.setText(celulares.get(i).getCapacidad());
                c4.setText(celulares.get(i).getPrecio());
                c5.setText(celulares.get(i).getColor());
                c5.setText(celulares.get(i).getSistemaOperativo());

                fila.addView(c1);
                fila.addView(c2);
                fila.addView(c3);
                fila.addView(c4);
                fila.addView(c5);
                fila.addView(c6);

                Tabla.addView(fila);
            }



        }

    }
}
