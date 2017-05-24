package com.example.guest.firebaseapp1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.Bind;
import butterknife.ButterKnife;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener {
    @Bind(R.id.btnLogIn) Button btnLogIn;
    @Bind(R.id.btnCancel) Button btnCancel;
    @Bind(R.id.etEmail) EditText etEmail;
    @Bind(R.id.etPassword) EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);

        btnLogIn.setOnClickListener(this);
        btnCancel.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if(v == btnLogIn) {
            Intent intent = new Intent(LogInActivity.this, UserDashboard.class);
            intent.putExtra("email", etEmail.getText().toString());
            intent.putExtra("password", etPassword.getText().toString());
            startActivity(intent);
        } else if (v == btnCancel) {
            Intent intent = new Intent(LogInActivity.this, MainActivity.class);
            startActivity(intent);
        }
    }
}
