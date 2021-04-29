package com.example.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//         Tanggal Pengerjaan : Selasa, 28 April 2021
//         Nim : 10118069
//         Deskripsi : membuat halaman Almost There, klik tombol Verify untuk menuju ke halaman
//         Verify
//         Nama: Muhamad Rizqi Ramdani
//         Kelas : IF-2
public class AlmostThere extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_almost_there);
        Intent intent = getIntent();
    }

    public void Verify(View view){
        Intent intent = new Intent(AlmostThere.this, VerifyAccount.class);
        startActivity(intent);
    }
}