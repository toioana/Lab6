package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


     public void saveFunction (View v)
     {
         MySharedPreference myPreferences = new MySharedPreference(this);
         EditText myText = (EditText)findViewById(R.id.editText);
         myPreferences.save(myText.getText().toString());

     }

    public void goToActivityFunction(View v)
    {



        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("String_intent", "We finished the lab!!<3 <3");

        startActivity(intent);



    }





}
