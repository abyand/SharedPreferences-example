package com.example.abyandafa.tutorsharedpref;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText email, password;
    private Button login;
    SharedPrefManager sharedPrefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email = (EditText) findViewById(R.id.email);
        password = (EditText) findViewById(R.id.password);

        sharedPrefManager = new SharedPrefManager(this);

        if(sharedPrefManager.getSPSudahLogin())
        {
            Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
            startActivity(intent);
        }

        login = (Button) findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPrefManager.saveSPString(SharedPrefManager.SP_EMAIL, email.getText().toString());
                sharedPrefManager.saveSPString(SharedPrefManager.SP_NAMA, password.getText().toString());
                sharedPrefManager.saveSPBoolean(SharedPrefManager.SP_SUDAH_LOGIN, true);
                Intent intent = new Intent(MainActivity.this, ProfilActivity.class);
                startActivity(intent);
            }
        });



    }
}
