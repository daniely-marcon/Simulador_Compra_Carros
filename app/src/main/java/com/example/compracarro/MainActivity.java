package com.example.compracarro;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText edtNome;
    Spinner spinner;
    RadioGroup radioGroup;
    Button btnFinalizar;
    RadioButton rb1,rb2,rb3,rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        radioGroup=findViewById(R.id.radioGroup);
        btnFinalizar=findViewById(R.id.btnFinalizar);
        spinner= (Spinner) findViewById(R.id.spinner);
        edtNome=findViewById(R.id.edtNome);
        rb1=findViewById(R.id.rb1);
        rb2=findViewById(R.id.rb2);
        rb3=findViewById(R.id.rb3);
        rb4=findViewById(R.id.rb4);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Acessorios, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        btnFinalizar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int idRadio=radioGroup.getCheckedRadioButtonId();
                int idSpinner= spinner.getSelectedItemPosition();

                String accessorio="Vazio";
                String cor="Vazio";

                if(idRadio==R.id.rb1){
                    cor="Preto";
                }else if(idRadio==R.id.rb2){
                    cor="Branco";
                }else if(idRadio==R.id.rb3){
                    cor="Azul";
                }else if(idRadio==R.id.rb4){
                    cor="Vermelho";
                }

                switch(idSpinner){
                    case 0:
                        accessorio="Nenhum";
                        break;
                    case 1:
                        accessorio="Roda de Liga Leve";
                        break;
                    case 2:
                        accessorio="Teto Solar";
                        break;
                    case 3:
                        accessorio="Som Premium";
                        break;
                }
                String nome = edtNome.getText().toString();

                if(nome.isEmpty()) {
                    edtNome.setError("O nome é obrigatório!");
                    edtNome.requestFocus();

                }else if("Vazio".equals(cor)) {

                    Toast.makeText(MainActivity.this, "Por favor, selecione uma cor", Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent = new Intent(MainActivity.this, Activity.class);
                    intent.putExtra("Nome", nome);
                    intent.putExtra("Acessorio", accessorio);
                    intent.putExtra("Cor", cor);
                    startActivity(intent);
                }



            }
        });
    }

}