package com.example.francis.miquiz;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class FirstLogin extends AppCompatActivity {

    public static final String EXTRA_TEXT = "com.example.francis.miquiz.EXTRA_TEXT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_login);
    }

    public void login(View view) {

        EditText edtxtUser = (EditText) findViewById(R.id.login_username);
        String txtUser = edtxtUser.getText().toString();


        // Intent code for open new activity through intent.

        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(EXTRA_TEXT, txtUser);
        startActivity(intent);
    }


}
