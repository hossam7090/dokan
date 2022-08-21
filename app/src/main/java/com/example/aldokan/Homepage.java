

package com.example.aldokan;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class Homepage extends AppCompatActivity implements View.OnClickListener {
     Button meatbutton,milkbutton,feedsbutton,fruitbutton,vegtbutton,grocbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        meatbutton=findViewById(R.id.button);
        milkbutton=findViewById(R.id.button3);
        grocbutton=findViewById(R.id.button2);
        feedsbutton=findViewById(R.id.button4);
        vegtbutton=findViewById(R.id.button5);
        fruitbutton=findViewById(R.id.button6);
        meatbutton.setOnClickListener(this);
        milkbutton.setOnClickListener(this);
        feedsbutton.setOnClickListener(this);
        fruitbutton.setOnClickListener(this);
        vegtbutton.setOnClickListener(this);
        grocbutton.setOnClickListener(this);



    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button:
                Intent M=new Intent(getApplicationContext(),Meats.class);
                startActivity(M);
                break;

            case R.id.button2:
                Intent G=new Intent(getApplicationContext(),Grocery.class);
                startActivity(G);
                break;
            case R.id.button3:
                Intent Milkes=new Intent(getApplicationContext(),DairyAndDrinks.class);
                startActivity(Milkes);
                break;
            case R.id.button4:
                Intent F=new Intent(getApplicationContext(),Forage.class);
                startActivity(F);
                break;
            case R.id.button5:
                Intent V=new Intent(getApplicationContext(),VegetablesAndFruits.class);
                startActivity(V);
                break;
//            case R.id.button6:
//                Intent fru=new Intent(getApplicationContext(),Fruits.class);
//                startActivity(F);
//                break;




        }

    }
}