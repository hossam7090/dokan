package com.example.aldokan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class VegetablesAndFruits extends AppCompatActivity {

    Button Veg_and_Fruits_btn1;
    Button Veg_and_Fruits_btn2;
    Button Veg_and_Fruits_btn3;
    Button Veg_and_Fruits_btn4;
    Button Veg_and_Fruits_btn5;
    Button Veg_and_Fruits_btn6;
    Button Veg_and_Fruits_btn7;
    Button Veg_and_Fruits_btn8;
    Button Veg_and_Fruits_btn9;
    Button Veg_and_Fruits_btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables_and_fruits);

        Veg_and_Fruits_btn1 = findViewById(R.id.Veg_and_Fruits_bo1);
        Veg_and_Fruits_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Veg_and_Fruits_btn2 = findViewById(R.id.Veg_and_Fruits_bo2);
        Veg_and_Fruits_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Veg_and_Fruits_btn3 = findViewById(R.id.Veg_and_Fruits_bo3);
        Veg_and_Fruits_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Veg_and_Fruits_btn4 = findViewById(R.id.Veg_and_Fruits_bo4);
        Veg_and_Fruits_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Veg_and_Fruits_btn5 = findViewById(R.id.Veg_and_Fruits_bo5);
        Veg_and_Fruits_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Veg_and_Fruits_btn6 = findViewById(R.id.Veg_and_Fruits_bo6);
        Veg_and_Fruits_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Veg_and_Fruits_btn7 = findViewById(R.id.Veg_and_Fruits_bo7);
        Veg_and_Fruits_btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Veg_and_Fruits_btn8 = findViewById(R.id.Veg_and_Fruits_bo8);
        Veg_and_Fruits_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Veg_and_Fruits_btn9 = findViewById(R.id.Veg_and_Fruits_bo9);
        Veg_and_Fruits_btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Veg_and_Fruits_btn10 = findViewById(R.id.Veg_and_Fruits_bo10);
        Veg_and_Fruits_btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });

    }
}