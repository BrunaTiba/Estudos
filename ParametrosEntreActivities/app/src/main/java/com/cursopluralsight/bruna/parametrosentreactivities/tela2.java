package com.cursopluralsight.bruna.parametrosentreactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);

        Intent intent =getIntent();
        String paramentro = (String) intent.getSerializableExtra("nome pessoa");
        TextView nome = (TextView) findViewById(R.id.NomeEditText);
        nome.setText("Olá " + paramentro);
    }

    public void btvoltar (View view){
        Intent intent2 = new Intent(getApplicationContext(), tela1.class);
        startActivity(intent2);
    }
}
