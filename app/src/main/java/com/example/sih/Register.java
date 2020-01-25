package com.example.sih;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {

    EditText emailId;
    EditText password;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        register = findViewById(R.id.register);
    }

    protected void register(View view) {
        emailId = findViewById(R.id.emailId);
        password = findViewById(R.id.password);

        String email = emailId.getText().toString();
        String pw = password.getText().toString();

        if (email.equals("hi") && pw.equals("123")) {
            Intent i = new Intent(Register.this, Dashboard.class);
            i.putExtra("emailId",email);
            startActivity(i);
        }
    }
}
