package com.example.pahlawan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvTeam;
    private ArrayList<PahlawanModel> listPahlawan = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvTeam = findViewById(R.id.rv_team_list);
        rvTeam.setHasFixedSize(true);
        listPahlawan.addAll(PahlawanData.getListData());

        showRecyclerList();
    }
    private void showRecyclerList() {
        rvTeam.setLayoutManager(new LinearLayoutManager(this));
        PahlawanAdapter pahlawanAdapter = new PahlawanAdapter(this);
        pahlawanAdapter.setPahlawanModels(listPahlawan);
        rvTeam.setAdapter(pahlawanAdapter);
    }
}
