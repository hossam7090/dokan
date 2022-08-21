package com.example.aldokan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DairyAndDrinks extends AppCompatActivity {

    Button Dairy_and_Drinks_btn1;
    Button Dairy_and_Drinks_btn2;
    Button Dairy_and_Drinks_btn3;
    Button Dairy_and_Drinks_btn4;
    Button Dairy_and_Drinks_btn5;
    Button Dairy_and_Drinks_btn6;
    Button Dairy_and_Drinks_btn7;
    Button Dairy_and_Drinks_btn8;
    Button Dairy_and_Drinks_btn9;
    Button Dairy_and_Drinks_btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dairy_and_drinks);

        Dairy_and_Drinks_btn1 = findViewById(R.id.Dairy_and_Drinks_bo1);
        Dairy_and_Drinks_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Dairy_and_Drinks_btn2 = findViewById(R.id.Dairy_and_Drinks_bo2);
        Dairy_and_Drinks_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Dairy_and_Drinks_btn3 = findViewById(R.id.Dairy_and_Drinks_bo3);
        Dairy_and_Drinks_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Dairy_and_Drinks_btn4 = findViewById(R.id.Dairy_and_Drinks_bo4);
        Dairy_and_Drinks_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Dairy_and_Drinks_btn5 = findViewById(R.id.Dairy_and_Drinks_bo5);
        Dairy_and_Drinks_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Dairy_and_Drinks_btn6 = findViewById(R.id.Dairy_and_Drinks_bo6);
        Dairy_and_Drinks_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Dairy_and_Drinks_btn7 = findViewById(R.id.Dairy_and_Drinks_bo7);
        Dairy_and_Drinks_btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Dairy_and_Drinks_btn8 = findViewById(R.id.Dairy_and_Drinks_bo8);
        Dairy_and_Drinks_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Dairy_and_Drinks_btn9 = findViewById(R.id.Dairy_and_Drinks_bo9);
        Dairy_and_Drinks_btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Dairy_and_Drinks_btn10 = findViewById(R.id.Dairy_and_Drinks_bo10);
        Dairy_and_Drinks_btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });

    }
}