package com.holamundo.tallercelulares;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CrearCelulares extends AppCompatActivity {

    private EditText marca,capacidad, precio, color, SistemaOperativo;
    private Resources resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crear_celulares);

        marca = (EditText)findViewById(R.id.TextMarca);
        capacidad = (EditText)findViewById(R.id.TextCapacidad);
        precio= (EditText)findViewById(R.id.TextPrecio);
        color= (EditText)findViewById(R.id.TextColor);
        SistemaOperativo = (EditText)findViewById(R.id.TxtSistemaOperativo);

        resources = this.getResources();
    }

    public void guardar(View view){
        String marc,cap,prec,col, sis;

        marc = marca.getText().toString();
        cap = capacidad.getText().toString();
        prec = precio.getText().toString();
        col = color.getText().toString();
        sis = SistemaOperativo.getText().toString();

        Celular c = new Celular(marc,cap,prec,col,sis);
        c.guardar();
        Toast.makeText(this,resources.getString(R.string.mensaje_exitoso),Toast.LENGTH_SHORT).show();
    }

    public void Borrar(View view){
        marca.setText("");
        capacidad.setText("");
        precio.setText("");
        color.setText("");
        SistemaOperativo.setText("");
        marca.requestFocus();
    }

    public boolean validar(){

        if (marca.getText().toString().isEmpty()){
            marca.setError(resources.getString(R.string.mensaje_error_campo_vacio));
            return false;
        }
        if (capacidad.getText().toString().isEmpty()){
            capacidad.setError(resources.getString(R.string.mensaje_error_campo_vacio));
            return false;
        }
        if (precio.getText().toString().isEmpty()){
            precio.setError(resources.getString(R.string.mensaje_error_campo_vacio));
            return false;
        }
        if (color.getText().toString().isEmpty()){
            color.setError(resources.getString(R.string.mensaje_error_campo_vacio));
            return false;
        }
        if (SistemaOperativo.getText().toString().isEmpty()){
            SistemaOperativo.setError(resources.getString(R.string.mensaje_error_campo_vacio));
            return false;
        }
        return true;
    }
}
