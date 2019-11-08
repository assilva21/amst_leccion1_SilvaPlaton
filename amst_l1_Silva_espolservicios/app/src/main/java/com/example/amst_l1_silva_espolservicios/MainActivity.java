package com.example.amst_l1_silva_espolservicios;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
    private Button btnSidweb , btnSisAca , btnVinSoc , btnBieEst ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSidweb = (Button)findViewById(R.id.btnSidweb);
        btnSisAca =(Button)findViewById(R.id.btnSisAca);
        btnVinSoc = (Button)findViewById(R.id.btnVinSoc);
        btnBieEst = (Button)findViewById(R.id.btnBieEst);

    }
    public void cambiarSidweb(View view){
        Intent a1 = new Intent(this, Sidweb.class);
        startActivity(a1);

    }
    public void cambiarSistemaAcademico(View view){
        Intent a2 = new Intent(this , sistemaAcademico.class);
        startActivity(a2);
    }

    public void cambiarVinculosSociedad(View view){
        Intent a3 = new Intent(this , VinculosConLaSociedad.class);
        startActivity(a3);
    }

    public void cambiarBienestarEstudiantil(View view){
        Intent a4 = new Intent(this , bienestarEstudiantil.class);
        startActivity(a4);
    }


}
