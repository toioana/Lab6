package com.example.lab6;

import android.content.Context;
import android.content.SharedPreferences;

public class MySharedPreference {
    SharedPreferences settings;
    SharedPreferences.Editor editor;

    public MySharedPreference (Context context) {
        //TODO
        settings = context.getSharedPreferences("MySettings", 0);
        editor = settings.edit();

    }

    public void save(String text){
        //TODO
        editor.putString("my_string", text);
        editor.commit();
    }

    public String getValue(){
        //TODO
        return settings.getString("my_string", null);


    }

    public void clearSharedPreferences(){
        editor.clear();
        editor.commit();
    }
}
