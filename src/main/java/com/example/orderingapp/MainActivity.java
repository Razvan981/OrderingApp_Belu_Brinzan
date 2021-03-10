package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void nextact(View view) {

        EditText table = (EditText) findViewById(R.id.table_no);
        Intent intent = new Intent(this, OrderType.class);
        startActivity(intent);
    }
}