package com.example.pahlawan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvHero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvHero = findViewById(R.id.activitymain_rv_pahlawan);
        rvHero.setLayoutManager(new LinearLayoutManager(this));

        PahlawanAdapter pahlawanAdapter = new PahlawanAdapter(getApplicationContext(), PahlawanData.getHeroList());

        rvHero.setAdapter(pahlawanAdapter);

    }
}
