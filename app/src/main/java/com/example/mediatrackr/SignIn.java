package com.example.mediatrackr;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

    Button register, signin;
    EditText username;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
    }

    public void register(View view) {
        register = (Button) findViewById(R.id.register);
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void SignIn(View view) {
        signin = (Button) findViewById(R.id.signIn);
        username = (EditText) findViewById(R.id.username);
        Intent intent = new Intent(this, UserHomepage.class);
        intent.putExtra("username",username.getText().toString());
        startActivity(intent);
    }
}