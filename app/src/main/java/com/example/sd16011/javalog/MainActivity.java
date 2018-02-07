package com.example.sd16011.javalog;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String name;
        int age;
        String hobby;
        name = "";
        age = 0;
        hobby = "";
        Human human = new Human(name,age,hobby);
        human.think();
    }
}