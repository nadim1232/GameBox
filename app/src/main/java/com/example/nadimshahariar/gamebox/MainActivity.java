package com.example.nadimshahariar.gamebox;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void bunny(View view) {
        Intent intent= new Intent(getApplicationContext(),bunny.class);
        startActivity(intent);

    }

    public void drum(View view) {

        Intent intent= new Intent(getApplicationContext(),drum.class);
        startActivity(intent);

    }

    public void piano(View view) {

        Intent intent= new Intent(getApplicationContext(),piano.class);
        startActivity(intent);

    }

    public void tic(View view) {

        Intent intent= new Intent(getApplicationContext(),tic.class);
        startActivity(intent);

    }

    public void two(View view) {

        Intent intent= new Intent(getApplicationContext(),two.class);
        startActivity(intent);

    }

    public void here(View view) {

        Intent intent= new Intent(getApplicationContext(),here.class);
        startActivity(intent);

    }
}
