package com.example.practicasqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Modificar extends AppCompatActivity {

    private EditText codigo, codigo1, nuevoNombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modificar);
        //Recogemos los parámetros enviados por el primer Activity  a través del método getExtras
        Bundle bundle=getIntent().getExtras();
        String codigo1 = bundle.getString("CODIGO");
        this.codigo = (EditText) findViewById(R.id.et_codigo);
        this.nuevoNombre= (EditText) findViewById(R.id.et_NuevoNombre);
        this.codigo.setText(codigo1);
        Sql usdbh = new Sql(context: this, name: "Usuarios", factory: null, version: 1);

        SQLiteDatabase sqlDB = usdbh.getWritableDatabase();
        actualizaDato(sqlDB);
        sqlDB.close();



    }

    public void cerrarVentana(View view) {
        finish();
    }


    private void actualizaDato(SQLiteDatabase sqlDB) {
        String[] args = new String [] {codigo.getText().toString()};

        ContentValues actualizaReg = new ContentValues();
        actualizaReg.put("nombre", "usuario6";)
        // Actualizamos el registro en la base de datos
        sqlDB.update( "Usuarios", actualizaReg,  "cod=6",  null);

    }
}