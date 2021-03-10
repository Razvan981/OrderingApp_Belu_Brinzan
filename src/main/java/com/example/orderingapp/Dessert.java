package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Dessert extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dessert);
    }

    public void main_menu(View view) {
        Intent previousAct = new Intent(this, OrderType.class);
        startActivity(previousAct);
    }

    public void terminaComandaDessertNxt(View view) {
        Intent nextAct = new Intent(this, FinishOrder.class);
        startActivity(nextAct);
    }
}
