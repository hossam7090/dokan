package com.example.aldokan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Forage extends AppCompatActivity {

    Button Forage_btn1;
    Button Forage_btn2;
    Button Forage_btn3;
    Button Forage_btn4;
    Button Forage_btn5;
    Button Forage_btn6;
    Button Forage_btn7;
    Button Forage_btn8;
    Button Forage_btn9;
    Button Forage_btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forage);

        Forage_btn1 = findViewById(R.id.Forage_bo1);
        Forage_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Forage_btn2 = findViewById(R.id.Forage_bo2);
        Forage_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Forage_btn3 = findViewById(R.id.Forage_bo3);
        Forage_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Forage_btn4 = findViewById(R.id.Forage_bo4);
        Forage_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Forage_btn5 = findViewById(R.id.Forage_bo5);
        Forage_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Forage_btn6 = findViewById(R.id.Forage_bo6);
        Forage_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Forage_btn7 = findViewById(R.id.Forage_bo7);
        Forage_btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Forage_btn8 = findViewById(R.id.Forage_bo8);
        Forage_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Forage_btn9 = findViewById(R.id.Forage_bo9);
        Forage_btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Forage_btn10 = findViewById(R.id.Forage_bo10);
        Forage_btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });

    }
}