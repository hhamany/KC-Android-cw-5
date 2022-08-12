package com.example.welcomepage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class screeen2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screeen2);

        TextView welcome = findViewById(R.id.space2);
        TextView info = findViewById(R.id.textView);
        EditText nam1 = findViewById(R.id.nam1);
        EditText age = findViewById(R.id.age);
        EditText goal = findViewById(R.id.goal);
        EditText phone = findViewById(R.id.phone);
        TextView contact = findViewById(R.id.contact);
        TextView bye = findViewById(R.id.fire);

        //////////////////// take a rest //////////////////

       String name;
       int age1 ;
       int phone1 ;
       String goal1 ;

        //////////////////// take a rest //////////////////

        name=getIntent().getStringExtra("item1");
        age1=getIntent().getIntExtra("item2",0);
        phone1=getIntent().getIntExtra("item3",0);
        goal1=getIntent().getStringExtra("item4");

        //////////////////// take a rest //////////////////

        nam1.setText(" اسمك هو " + name);
        age.setText(" عمرك "  +age1);
        phone.setText(" رقم هاتفك "  +phone1);
        goal.setText("  هدفك  "  + goal1);





    }
}