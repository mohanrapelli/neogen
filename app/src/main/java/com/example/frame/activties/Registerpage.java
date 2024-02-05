package com.example.frame.activties;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.frame.R;

public class Registerpage extends AppCompatActivity {
    TextView sign_in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registerpage);
        sign_in=findViewById(R.id.sign_up_to_sign_in);

        sign_in.setOnClickListener(v -> startActivity(new Intent(Registerpage.this,Loginpage.class)));
    }

}
