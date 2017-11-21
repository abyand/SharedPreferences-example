package com.example.abyandafa.tutorsharedpref;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfilActivity extends AppCompatActivity {

    private TextView namaUser, emailuser;
    private Button logout;
    SharedPrefManager sharedPrefManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        namaUser = (TextView) findViewById(R.id.namaUser);
        emailuser = (TextView) findViewById(R.id.emailuser);

        sharedPrefManager = new SharedPrefManager(this);

        namaUser.setText(sharedPrefManager.getSpNama());
        emailuser.setText(sharedPrefManager.getSpEmail());

        logout = (Button) findViewById(R.id.logout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPrefManager.saveSPBoolean(SharedPrefManager.SP_SUDAH_LOGIN, false);
                if(sharedPrefManager.getSPSudahLogin())
                {

                }
                else {
                    finish();
                }
            }
        });

    }
}
