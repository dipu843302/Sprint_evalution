package com.example.sprint_evalution;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sign_in extends AppCompatActivity {
    private Button enterbtn1;
    private Button btnup1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in_screen);
     enterbtn1=findViewById(R.id.enterbtn);
     enterbtn1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent categoryIntent=new Intent(sign_in.this, home_screen.class);
             startActivity(categoryIntent);
             finish();
         }
     });
     btnup1=findViewById(R.id.btnup);
     btnup1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             Intent categoryIntent=new Intent(sign_in.this, signup.class);
             startActivity(categoryIntent);
             finish();
         }
     });

    }
}

