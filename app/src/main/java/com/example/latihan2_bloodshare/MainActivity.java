package com.example.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//         Tanggal Pengerjaan : Selasa, 27 April 2021
//         Deskripsi : membuat halaman login, kli text Register untuk menuju halaman Register
//         Nim : 10118069
//         Nama: Muhamad Rizqi Ramdani
//         Kelas : IF-2
public class MainActivity extends AppCompatActivity {

    public void register(View view){
        Intent intent = new Intent(MainActivity.this, register.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}