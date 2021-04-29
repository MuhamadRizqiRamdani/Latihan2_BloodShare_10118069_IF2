package com.example.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//         Tanggal Pengerjaan : Selasa, 27 April 2021
//         Nim : 10118069
//         Deskripsi : membuat halaman register, tekan button register untuk menuju halaman
//         Almost There
//         Nama: Muhamad Rizqi Ramdani
//         Kelas : IF-2
public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent = getIntent();
    }
    public void AlmostThere(View view){
        Intent intent = new Intent(register.this, AlmostThere.class);
        startActivity(intent);
    }
}