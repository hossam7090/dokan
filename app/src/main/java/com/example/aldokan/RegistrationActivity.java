package com.example.aldokan;



import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.aldokan.Tables.CustomersDB;

public class RegistrationActivity extends AppCompatActivity {

    Database db ;

    Button regist;
    EditText first , last , email , date;
    RadioGroup gender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        first = findViewById(R.id.te_firstname);
        last = findViewById(R.id.te_lastname);
        email = findViewById(R.id.et_regemail);
        date = findViewById(R.id.et_date);


        gender = findViewById(R.id.rg_gender);

        regist = findViewById(R.id.btn_register);
        db = new Database(this);
        regist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String f = first.getText().toString();
                String l = last.getText().toString();
                String e = email.getText().toString();
                String d = date.getText().toString();
                String g = "female";
                if(gender.getCheckedRadioButtonId()==R.id.rd_male)
                    g = "male";

                CustomersDB customer = new CustomersDB(f,l,e,d,g);
                if(f.isEmpty()||l.isEmpty()||e.isEmpty()||d.isEmpty()||gender.getCheckedRadioButtonId()==-1){
                    Toast.makeText(RegistrationActivity.this, "Please, complete your data...", Toast.LENGTH_SHORT).show();
                }else {
                  db.insertCustomer(customer);
                boolean cus = db.insertCustomer(customer);
                if(cus) {
                    Toast.makeText(RegistrationActivity.this, "Registration successful !", Toast.LENGTH_SHORT).show();
                    Intent registrationTomain = new Intent(RegistrationActivity.this, login.class);
                    startActivity(registrationTomain);
                }
                else
                    Toast.makeText(RegistrationActivity.this, "not successful !", Toast.LENGTH_SHORT).show();

            }
            }
        });

    }
}