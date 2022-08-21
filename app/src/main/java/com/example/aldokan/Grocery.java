package com.example.aldokan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Grocery extends AppCompatActivity {

    Button Grocery_btn1;
    Button Grocery_btn2;
    Button Grocery_btn3;
    Button Grocery_btn4;
    Button Grocery_btn5;
    Button Grocery_btn6;
    Button Grocery_btn7;
    Button Grocery_btn8;
    Button Grocery_btn9;
    Button Grocery_btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);

        Grocery_btn1 = findViewById(R.id.Grocery_bo1);
        Grocery_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Grocery_btn2 = findViewById(R.id.Grocery_bo2);
        Grocery_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Grocery_btn3 = findViewById(R.id.Grocery_bo3);
        Grocery_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Grocery_btn4 = findViewById(R.id.Grocery_bo4);
        Grocery_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Grocery_btn5 = findViewById(R.id.Grocery_bo5);
        Grocery_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Grocery_btn6 = findViewById(R.id.Grocery_bo6);
        Grocery_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Grocery_btn7 = findViewById(R.id.Grocery_bo7);
        Grocery_btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Grocery_btn8 = findViewById(R.id.Grocery_bo8);
        Grocery_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Grocery_btn9 = findViewById(R.id.Grocery_bo9);
        Grocery_btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Grocery_btn10 = findViewById(R.id.Grocery_bo10);
        Grocery_btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });

    }
}