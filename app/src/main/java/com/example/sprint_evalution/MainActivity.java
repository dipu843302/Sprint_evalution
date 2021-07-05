package com.example.sprint_evalution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
private Button btnsign1;
private Button createbtn1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnsign1=findViewById(R.id.btnsign);
        btnsign1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent=new Intent(MainActivity.this, signup.class);
                startActivity(categoryIntent);
                finish();
            }
        });
        createbtn1=findViewById(R.id.createbtn);
        createbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent=new Intent(MainActivity.this, signup.class);
                startActivity(categoryIntent);
                finish();
            }
        });
    }
}