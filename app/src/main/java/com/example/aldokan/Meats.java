package com.example.aldokan;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Meats extends AppCompatActivity {

    Button Meats_btn1;
    Button Meats_btn2;
    Button Meats_btn3;
    Button Meats_btn4;
    Button Meats_btn5;
    Button Meats_btn6;
    Button Meats_btn7;
    Button Meats_btn8;
    Button Meats_btn9;
    Button Meats_btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meats);

        Meats_btn1 = findViewById(R.id.Meats_bo1);
        Meats_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Meats_btn2 = findViewById(R.id.Meats_bo2);
        Meats_btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Meats_btn3 = findViewById(R.id.Meats_bo3);
        Meats_btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Meats_btn4 = findViewById(R.id.Meats_bo4);
        Meats_btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Meats_btn5 = findViewById(R.id.Meats_bo5);
        Meats_btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Meats_btn6 = findViewById(R.id.Meats_bo6);
        Meats_btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Meats_btn7 = findViewById(R.id.Meats_bo7);
        Meats_btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Meats_btn8 = findViewById(R.id.Meats_bo8);
        Meats_btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Meats_btn9 = findViewById(R.id.Meats_bo9);
        Meats_btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });
        Meats_btn10 = findViewById(R.id.Meats_bo10);
        Meats_btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Go_product_details = new Intent(getBaseContext(), ProductDetails.class);
                startActivity(Go_product_details);
            }
        });

    }
}