package com.cursopluralsight.bruna.parametrosentreactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);

        final TextView nome = (TextView) findViewById(R.id.NomeEditText);
        Button ok = (Button) findViewById(R.id.btnOk);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            //Aqui chama a nova activity

                Intent intent1 = new Intent(tela1.this, tela2.class);
                intent1.putExtra("nome pessoa", nome.getText().toString());
                startActivity(intent1);

            }
        });

    }
}
