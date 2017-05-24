package com.example.guest.firebaseapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import butterknife.Bind;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.btnLogIn) Button btnLogIn;
    @Bind(R.id.btnRegister) Button btnRegister;

    public static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        btnLogIn.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v == btnLogIn) {
            Intent intent = new Intent(MainActivity.this, LogInActivity.class);
            startActivity(intent);
            Log.d(TAG, "Log In clicked");
        } else if (v == btnRegister) {
            Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
            startActivity(intent);
            Log.d(TAG, "Register clicked");
        }
    }
}
