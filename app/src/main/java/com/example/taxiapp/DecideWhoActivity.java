package com.example.taxiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.firebase.auth.FirebaseAuth;

public class DecideWhoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decide_who);

    }

    public void goToPassengerLogIn(View view) {
        startActivity(new Intent(DecideWhoActivity.this,PassengerSignIn.class));
    }
    public void goToDriverLogIn(View view) {
        startActivity(new Intent(DecideWhoActivity.this,DriverSignIn.class));
    }

}
