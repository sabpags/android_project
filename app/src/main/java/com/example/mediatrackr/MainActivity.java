package com.example.mediatrackr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button register, signIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        register = (Button) findViewById(R.id.register);
        Toast.makeText(this, "Registration Successful", Toast.LENGTH_SHORT).show();
    }

    public void SignIn(View view) {
        signIn = (Button) findViewById(R.id.signIn);
        Intent intent = new Intent(this, SignIn.class);
        startActivity(intent);
    }
}