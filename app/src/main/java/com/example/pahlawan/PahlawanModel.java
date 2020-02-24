package com.example.pahlawan;

import androidx.appcompat.app.AppCompatActivity;

public class PahlawanModel extends AppCompatActivity {

    private String namaPahlawan,descPahlawan;
    private int gambarPahlawan;

    public String getNamaPahlawan() {
        return namaPahlawan;
    }

    public void setNamaPahlawan(String namaPahlawan) {
        this.namaPahlawan = namaPahlawan;
    }

    public String getDescPahlawan() {
        return descPahlawan;
    }

    public void setDescPahlawan(String descPahlawan) {
        this.descPahlawan = descPahlawan;
    }

    public int getGambarPahlawan() {
        return gambarPahlawan;
    }

    public void setGambarPahlawan(int gambarPahlawan) {
        this.gambarPahlawan = gambarPahlawan;
    }
}
