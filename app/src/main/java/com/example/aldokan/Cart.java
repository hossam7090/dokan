package com.example.aldokan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Cart extends AppCompatActivity {
    Button tx_toconfirm;
    TextView totalprice;
    RecyclerView recycle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        tx_toconfirm = (Button) findViewById(R.id.toconfirm);
        recycle = findViewById(R.id.re_cart_recycle);
        totalprice = findViewById(R.id.totalprice);
        tx_toconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gotoconfirmorder = new Intent(Cart.this,ConfirmOrder.class);
                startActivity(gotoconfirmorder);
            }
        });
    }
}