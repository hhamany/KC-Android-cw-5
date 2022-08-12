package com.example.welcomepage;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;

public class MainActivity extends AppCompatActivity {

    private final int GALLERY_REQ_CODE = 1000;
    ImageView pic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();


        TextView space = findViewById(R.id.space);
        EditText name = findViewById(R.id.nam1);
        EditText age = findViewById(R.id.age);
        EditText phone = findViewById(R.id.phone);
        EditText goal = findViewById(R.id.goal);
        pic = findViewById(R.id.img1);
        Button upload = findViewById(R.id.button);
        Button finish = findViewById(R.id.button2);



        upload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent igallery = new Intent(Intent.ACTION_PICK);
                igallery.setData(MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(igallery,GALLERY_REQ_CODE);

            }
        });


        finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                EditText name = findViewById(R.id.nam1);
                int age1 = Integer.parseInt(age.getText().toString());
                int phone1 = Integer.parseInt(phone.getText().toString());
                EditText goal = findViewById(R.id.goal);

            ////////////////////////////////// take rest /////////////////////////////////

                Intent finish = new Intent(MainActivity.this, screeen2.class);
                finish.putExtra("item1",name.getText().toString());
                finish.putExtra("item2",age1);
                finish.putExtra("item3",phone1);
                finish.putExtra("item4",goal.getText().toString());


                startActivity(finish);

            }
        });



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode==RESULT_OK){

            if (requestCode==GALLERY_REQ_CODE){

                // for gallery
                pic.setImageURI(data.getData());

            }

        }



    }

}