package com.example.santiagovasquez.sispo;

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

    public void OnClickSsve(View view) {
        Intent miIntent = new Intent(MainActivity.this,SsveActivity.class);
        startActivity(miIntent);
    }

    public void OnClickSosoe(View view) {
        Intent miIntent = new Intent(MainActivity.this,Sosoe.class);
        startActivity(miIntent);
    }

    public void OnClickinterp(View view) {
        Intent miIntent = new Intent(MainActivity.this,Interp.class);
        startActivity(miIntent);
    }
}
