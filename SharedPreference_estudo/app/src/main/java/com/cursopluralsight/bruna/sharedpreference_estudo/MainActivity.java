package com.cursopluralsight.bruna.sharedpreference_estudo;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nome = (EditText) findViewById(R.id.NomeEditText);
        final EditText email = (EditText) findViewById(R.id.emailEditText);

        Button gravar = (Button) findViewById(R.id.buttonok);
        gravar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
                SharedPreferences.Editor ed= prefs.edit();

            ed.putString ("nome", nome.getText().toString());
            ed.putString ("email", email.getText().toString());

            ed.apply();
                Toast.makeText(getBaseContext(), "Cadastro realizado", Toast.LENGTH_LONG).show();


            }
        });
        Button limpar = (Button) findViewById(R.id.buttonLimpar);
        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nome.setText("");
                email.setText("");
            }
        });
        Button recuperar = (Button) findViewById(R.id.buttonRecuperar);
        recuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences prefs = getSharedPreferences("Preferencias", Context.MODE_PRIVATE);
                nome.setText(prefs.getString("nome", "Não tem"));
                email.setText(prefs.getString("email", "Não tem"));
            }
        });


    }
}
