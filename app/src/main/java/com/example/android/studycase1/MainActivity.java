package com.example.android.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etMakanan, etPorsi; // deklarasi objek
    Intent intent;
    String restaurant, menu;
    int porsi;

    @Override
    protected void onCreate(Bundle savedInstanceState) { //method ketika dijalankan saat activity dibuat
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etMakanan = (EditText) findViewById(R.id.Makanan); //buat masukin nama makanan
        etPorsi = (EditText) findViewById(R.id.Porsi); //jumlah porsi
        intent = new Intent (this,SecondActivity.class); //untuk pindah aktivitas
    }

    public void onEatbus(View view) {
        menu = etMakanan.getText().toString();
        restaurant = "Eatbus";
        porsi = Integer.parseInt(etPorsi.getText().toString());
        int total = 50000 * Integer.parseInt(etPorsi.getText().toString()); //jumlah porsi dikali harga restoran lalu menjadi integer
        Log.d("TOTAL HARGA", "Rp."+total); //menampilkan sesuatu di Logcat android studio
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("porsi",porsi);
        intent.putExtra("harga",total);
        startActivity(intent);
    }

    public void onAbnormal(View view) {
        menu = etMakanan.getText().toString();
        restaurant = "Abnormal";
        porsi = Integer.parseInt(etPorsi.getText().toString());
        int total = 30000 * Integer.parseInt(etPorsi.getText().toString()); //jumlah porsi dikali harga restoran lalu menjadi integer
        Log.d("TOTAL HARGA", "Rp."+total); //menampilkan sesuatu di Logcat android studio
        intent.putExtra("restaurant",restaurant);
        intent.putExtra("menu",menu);
        intent.putExtra("porsi",porsi);
        intent.putExtra("harga",total);
        startActivity(intent);
    }
}