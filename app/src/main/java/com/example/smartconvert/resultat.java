package com.example.smartconvert;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class resultat extends AppCompatActivity {
Button btn_close;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultat);

        // Récupérer le Spinner à partir de la mise en page
        Spinner spinner = findViewById(R.id.spinner_from);
        Spinner spinner2 = findViewById(R.id.spinner_from2);

        // Créer un tableau de chaînes pour les éléments de la liste déroulante
        String[] items = {"mg", "cg", "dg", "g", "dag", "hg", "kg", "q", "T"};

        // Créer un adaptateur ArrayAdapter en utilisant le tableau d'éléments et un layout par défaut
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);

        // Spécifier le layout pour la liste déroulante
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Appliquer l'adaptateur au Spinner
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);



        btn_close = (Button)findViewById(R.id.button_retour);
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}