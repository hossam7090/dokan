

package com.example.aldokan;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;


public class Homepage extends AppCompatActivity implements View.OnClickListener, MenuItem.OnMenuItemClickListener {
     Button meatbutton,milkbutton,feedsbutton,fruitbutton,vegtbutton,grocbutton;
    @Override
    public boolean onMenuItemClick(MenuItem menuItem) {
        return false;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        initialization();
        listener();


    }

    @Override
    public void onClick(View view) {

        CategoryNav(view);

    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.optional_menu,menu);
        Log.d("a","oncreate menu");
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.cart:
                Intent M=new Intent(getApplicationContext(),Cart.class);
                startActivity(M);
                return true;
            case R.id.log_out:
                Intent log=new Intent(getApplicationContext(),login.class);
                startActivity(log);
                return true;
            case R.id.contact_us:
                Intent contact=new Intent(getApplicationContext(),contactUs.class);
                startActivity(contact);
                return true;
            case R.id.about_us:
                Intent about=new Intent(getApplicationContext(),aboutUs.class);
                startActivity(about);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public void onBackPressed() {

        finishAffinity();
    }

    // functions
    private void CategoryNav(View view){
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
    private void initialization (){
        meatbutton=findViewById(R.id.button);
        milkbutton=findViewById(R.id.button3);
        grocbutton=findViewById(R.id.button2);
        feedsbutton=findViewById(R.id.button4);
        vegtbutton=findViewById(R.id.button5);
        fruitbutton=findViewById(R.id.button6);

    }
    private void listener(){
        meatbutton.setOnClickListener(this);
        milkbutton.setOnClickListener(this);
        feedsbutton.setOnClickListener(this);
        fruitbutton.setOnClickListener(this);
        vegtbutton.setOnClickListener(this);
        grocbutton.setOnClickListener(this);
    }

}

