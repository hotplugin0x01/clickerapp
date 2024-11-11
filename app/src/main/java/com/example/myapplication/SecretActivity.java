package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.myapplication.databinding.ActivitySecretBinding;

public class SecretActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivitySecretBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secret);


        // Intent Receiving and handling
        Intent receivedIntent = getIntent();
        String data = receivedIntent.getStringExtra(Intent.EXTRA_TEXT);

        if (data != null) {
            TextView text = findViewById(R.id.secret_view);
            text.setText(data);
        }
    }
}