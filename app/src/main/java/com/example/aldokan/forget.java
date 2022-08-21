package com.example.aldokan;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forget extends AppCompatActivity {

    Button reset ;
    EditText email ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_forget);

        reset = findViewById(R.id.btn_sendResetPassword);
        email = findViewById(R.id.et_rstemail);

        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String e = email.getText().toString();
                if(e.isEmpty()){
                    Toast.makeText(forget.this, "Please, enter your email or phone number...", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(forget.this, "Link sent !", Toast.LENGTH_SHORT).show();
                    Intent forgetTomain = new Intent(getApplicationContext(),login.class);
                    startActivity(forgetTomain);
                }
            }
        });
    }
}