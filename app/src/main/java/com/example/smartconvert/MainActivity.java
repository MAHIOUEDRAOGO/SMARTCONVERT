package com.example.smartconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_open;
    Button btn_open2;
    Button btn_open3;
    Button btn_open4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_open  = (Button)findViewById(R.id.button_long);
        btn_open.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, resultat.class);
                startActivity(intent);
            }
       });

        btn_open2  = (Button)findViewById(R.id.mass);
        btn_open2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, resultat.class);
                startActivity(intent);
            }
        });

        btn_open3  = (Button)findViewById(R.id.temp);
        btn_open3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, resultat.class);
                startActivity(intent);
            }
        });

        btn_open4  = (Button)findViewById(R.id.devis);
        btn_open4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, resultat.class);
                startActivity(intent);
            }
        });
    }



}