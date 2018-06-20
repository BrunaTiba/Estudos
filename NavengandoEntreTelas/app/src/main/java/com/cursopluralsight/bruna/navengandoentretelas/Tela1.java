package com.cursopluralsight.bruna.navengandoentretelas;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Tela1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
    }

    public void irTela2 (View view){
        Intent intent1 = new Intent(getApplicationContext(), Tela2.class);
        startActivity(intent1);
    }
}
