package com.example.latihan2_bloodshare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
//         Tanggal Pengerjaan : Selasa, 28 April 2021
//         Nim : 10118069
//         Deskripsi : membuat halaman Verify Account, dan klik button Send untuk menuju halaman
//         User Home
//         Nama: Muhamad Rizqi Ramdani
//         Kelas : IF-2
public class VerifyAccount extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_account);
        Intent intent = getIntent();
    }

    public void UserHome(View view){
        Intent intent = new Intent(VerifyAccount.this, UserHome.class);
        startActivity(intent);
    }
}