package com.example.insta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        EditText user = findViewById(R.id.et1);
        EditText pass = findViewById(R.id.et2);
        Button login = findViewById(R.id.btn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String usercode = "sweety";
                String password = "sweety2003";

                if (user.getText().toString().matches(usercode) && pass.getText().toString().matches(password)) {
                    Intent i = new Intent(home.this, MainActivity.class);
                    startActivity(i);
                } else {
                    Toast.makeText(getApplicationContext(), "Enter a valid username or password", Toast.LENGTH_SHORT).show();
                }

            }

        });
    }
}