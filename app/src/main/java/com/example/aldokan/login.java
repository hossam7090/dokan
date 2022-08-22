package com.example.aldokan;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aldokan.Tables.CustomersDB;

import java.util.ArrayList;


public class login extends AppCompatActivity {

    Database db ;

    boolean pressToBack = false ;

    TextView txForgetPassword ;
    Button btnNewAccount,login;
    EditText email , password ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnNewAccount = findViewById(R.id.btn_createNewAccount);
        txForgetPassword = findViewById(R.id.tx_forgetPassword);
        db = new Database(this);
        email = findViewById(R.id.et_logemail);
        password = findViewById(R.id.et_logpassword);
        login = findViewById(R.id.btn_login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String em = email.getText().toString();
                String n = password.getText().toString();
                if (em.isEmpty()&&!n.isEmpty()) {
                    Toast.makeText(login.this, "Please, enter your email or number...", Toast.LENGTH_SHORT).show();
                }else if (!em.isEmpty()&&n.isEmpty()){
                    Toast.makeText(login.this, "Please, enter your password...", Toast.LENGTH_SHORT).show();
                }else if(em.isEmpty()&&n.isEmpty()){
                    Toast.makeText(login.this, "Please, enter your data...", Toast.LENGTH_SHORT).show();
                }else{

                   Log.d("TAG","getCustomer called");


                        Intent Y=new Intent(getApplicationContext(),Homepage.class);
                        startActivity(Y);
                        Toast.makeText(login.this, "Login Successful...", Toast.LENGTH_SHORT).show();






                }
            }
        });


        txForgetPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainToforget = new Intent(login.this,forget.class);
                startActivity(mainToforget);
            }
        });

        btnNewAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainToRegister = new Intent(login.this,RegistrationActivity.class);
                startActivity(mainToRegister);
            }
        });

    }

    @Override
    public void onBackPressed() {
        if(pressToBack){
            super.onBackPressed();
        }else{
            pressToBack = true ;
            Toast.makeText(this, "Please, press again to exit...", Toast.LENGTH_SHORT).show();

            Handler h = new Handler();
            h.postDelayed(new Runnable() {
                @Override
                public void run() {
                    pressToBack = false ;
                }
            },3000);

        }
    }


}