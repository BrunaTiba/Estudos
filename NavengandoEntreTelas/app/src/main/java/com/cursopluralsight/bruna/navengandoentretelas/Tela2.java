package com.cursopluralsight.bruna.navengandoentretelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
    }

    public void irTela1 (View view){
        Intent intent2 = new Intent(getApplicationContext(), Tela1.class);
        startActivity(intent2);
    }
}
