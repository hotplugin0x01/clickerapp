package com.example.myapplication;

import static io.hextree.weatherusa.InternetUtil.solve;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        String greeting = "Click on the button!";
        String decoded = solve("moiba1cybar8smart4sheriff4securi");
        Log.i("Flag", decoded);
        TextView homeText = findViewById(R.id.home_text);
        homeText.setText(greeting);

        Button clickme = findViewById(R.id.click_button);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                homeText.setText(String.format(
                        getString(R.string.counter_text)   , counter
                ));
                Log.i("Logging: ", String.format("The Button is clicked!: Counter: %d", counter));
                if (counter >= 10){
//                    Intent browser = new Intent(Intent.ACTION_VIEW, Uri.parse("https://google.com/"));
                    Intent myIntent = new Intent(MainActivity.this, SecretActivity.class);
                    startActivity(myIntent);
                }
            }
        });
//        setContentView();
    }
}