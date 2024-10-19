package com.example.prg1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText username,password;
    Button login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        username = (EditText) findViewById(R.id.user1);
        password = (EditText) findViewById(R.id.pass1);
        login = (Button) findViewById(R.id.button1);
        login.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1)
        {
            String a = username.getText().toString();
            String b = password.getText().toString();
            if(a.equals("Archana")&&b.equals("123")) {
                Toast.makeText(this, "login succesfull", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(this, "loginn failed", Toast.LENGTH_SHORT).show();
            }
        }
    }
}
