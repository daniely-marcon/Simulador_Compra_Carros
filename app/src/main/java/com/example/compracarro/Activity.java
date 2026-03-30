package com.example.compracarro;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Activity extends AppCompatActivity {
    TextView txtNome,txtAcessorio,txtCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_2);

        txtAcessorio=findViewById(R.id.txtAcessorio);
        txtCor=findViewById(R.id.txtCor);
        txtNome=findViewById(R.id.txtNome);

        Intent intent = getIntent();
        String cor= intent.getStringExtra("Cor");
        String acessorio=intent.getStringExtra("Acessorio");
        String nome=intent.getStringExtra("Nome");
        txtNome.setText("Olá, "+nome+"!");
        if("Nenhum".equals(acessorio)){
            txtAcessorio.setText("Você não escolheu nenhum acessorio.");
        }else{
            txtAcessorio.setText("Você escolheu o acessorio: "+acessorio+".");

        }
        if("Vazio".equals(cor)){
            txtCor.setText("Você não escolheu nenhuma cor.");
        }else{
            txtCor.setText("Você escolheu a cor: "+cor+".");

        }


    }
}