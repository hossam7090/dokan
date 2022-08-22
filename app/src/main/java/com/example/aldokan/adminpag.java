package com.example.aldokan;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.aldokan.Tables.ProductsDB;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;

public class adminpag extends AppCompatActivity {
    ImageView imageView;
    Database db ;
    ProductsDB product ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpag);
        db = new Database(this);

        Button save = findViewById(R.id.button8);
        Button gallery = findViewById(R.id.gallery);
        imageView = findViewById(R.id.imageView2);
        EditText editText1 = findViewById(R.id.editTextTextPersonId);
        EditText editText2 = findViewById(R.id.editTextTextPersoncatagory);
        EditText editText3 = findViewById(R.id.editTextTextPersonPrice);
        gallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(intent , 3);
            }
        });

        save.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String name =editText1.getText().toString();
                String category = editText2.getText().toString();
                double price = Double.parseDouble(editText3.getText().toString());
                byte[] image = imageviewintobyte(imageView);

                if(!name.isEmpty()&&!category.isEmpty()&&!editText3.getText().toString().isEmpty()){

                    product = new ProductsDB(name.trim(),price,image,category.trim());
                    if(db.insertProduct(product)){
                        Toast.makeText(adminpag.this, "saving successful !", Toast.LENGTH_SHORT).show();

                    }

                    editText1.setText("");
                    editText2.setText("");
                    editText3.setText("");
                    imageView.setImageURI(null);

                }


            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == RESULT_OK && data != null) {
            Uri selectedImage = data.getData();

            imageView.setImageURI(selectedImage);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(@NonNull Menu menu) {
        getMenuInflater().inflate(R.menu.message_menu,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        Intent M=new Intent(getApplicationContext(),message.class);
        startActivity(M);
        return true;
    }

    private byte[] imageviewintobyte(ImageView image)
    {
        Bitmap bitmab = ((BitmapDrawable)image.getDrawable()).getBitmap();
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        bitmab.compress(Bitmap.CompressFormat.PNG,100,stream);
        byte[] byteArray = stream.toByteArray();
        return byteArray;
    }

}