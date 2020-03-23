package com.example.lab6;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        Intent intent = getIntent();

        MySharedPreference myPreferences = new MySharedPreference(this);
        TextView textView = (TextView)findViewById(R.id.myTextView);

        String myTextToDisplay= intent.getStringExtra("String_intent") +"   " + myPreferences.getValue();

        textView.setText(myTextToDisplay);





    }








}
