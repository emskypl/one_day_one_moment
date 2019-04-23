package com.example.uiemskyconcept;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    // TODO (1) Fix buttons background change when mobile is rotated
    // TODO (2) Change frament after click
    // TODO (3) Facebook login and guest login
    // TODO (4) Register fragment
    // TODO (5) Firebase
    Button loginButton, registerButton;
    SystemUI systemUI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        systemUI = new SystemUI();
        systemUI.hideSystemUI(getWindow().getDecorView());
        loginButton = (Button) findViewById(R.id.button_sign_in);
        registerButton = (Button) findViewById(R.id.button_sign_up);
        loginButton.bringToFront();
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    loginButton.setTranslationZ(1);
                    registerButton.setTranslationZ(-1);
                    registerButton.setBackgroundResource(R.drawable.btn_default_noselected);
                    loginButton.setBackgroundResource(R.drawable.btn_default_selected);



            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                loginButton.setTranslationZ(-1);
                registerButton.setTranslationZ(1);
                loginButton.setBackgroundResource(R.drawable.btn_default_noselected);
                registerButton.setBackgroundResource(R.drawable.btn_default_selected);

            }
        });

    }



}
