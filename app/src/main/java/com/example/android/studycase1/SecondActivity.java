package com.example.android.studycase1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tvRestaurant, tvMenu, tvPortion, tvPrice;
    String restaurant, menu;
    int porsi, price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        tvRestaurant =(TextView)findViewById(R.id.tv_restaurant); //buat mengambil id dari xml
        tvMenu =(TextView)findViewById(R.id.tv_menu);
        tvPortion =(TextView)findViewById(R.id.tv_portion);
        tvPrice =(TextView)findViewById(R.id.tv_price);

        Intent intent = getIntent(); //mengambil data dari activity sebelumnya
        restaurant = intent.getStringExtra("restaurant");
        menu = intent.getStringExtra("menu");
        porsi = intent.getIntExtra("porsi", 0);
        price = intent.getIntExtra("harga", 0);

        tvRestaurant.setText(restaurant); //setText untuk mengisi komponen dengan data
        tvMenu.setText(menu);
        tvPortion.setText(""+porsi);
        tvPrice.setText("Rp."+price);

        Toast toast = null; //inisiasi
        if (price < 65000){
            toast = Toast.makeText(getApplicationContext(), "Harga murah nih cocok dengan kondisi budget keuangan", Toast.LENGTH_SHORT); //jika kurang dari 65000 akan menampilkan pesan berikut.
        }else{
            toast = Toast.makeText(getApplicationContext(), "kekurangan budget kalo harganya segini", Toast.LENGTH_SHORT); //jika lebih dari 65000 akan menampilkan pesan berikut.
        }
        toast.show(); //untuk menampilkan tulisan
    }
}