package com.example.sprint_evalution;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class signup extends AppCompatActivity {
    private Button signbtn1;
    private Button arlybtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        signbtn1=findViewById(R.id.signbtn);
        signbtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent=new Intent(signup.this, sign_in.class);
                startActivity(categoryIntent);
                finish();
            }
        });
        arlybtn=findViewById(R.id.arlybtn);
        arlybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent categoryIntent=new Intent(signup.this, sign_in.class);
                startActivity(categoryIntent);
                finish();
            }
        });

    }
}
