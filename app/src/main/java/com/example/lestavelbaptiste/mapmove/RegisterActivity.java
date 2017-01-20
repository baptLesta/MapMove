package com.example.lestavelbaptiste.mapmove;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final EditText etPseudo =(EditText) findViewById(R.id.etPseudo);
        final EditText etMail =(EditText) findViewById(R.id.etMail);
        final EditText etPassword =(EditText) findViewById(R.id.etPassword);

        final Button bEnregistrer = (Button) findViewById(R.id.bEnregistrer);


    }
}
