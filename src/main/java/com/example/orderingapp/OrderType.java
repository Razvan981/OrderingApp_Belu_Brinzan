package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class OrderType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_type);
    }

    public void ciorbaNxt(View view) {
        Intent nextAct = new Intent(this, Soup.class);
        startActivity(nextAct);
    }

    public void salataNxt(View view) {
        Intent nextAct = new Intent(this, Salads.class);
        startActivity(nextAct);
    }

    public void felPrincipalNxt(View view) {
        Intent nextAct = new Intent(this, MainCourse.class);
        startActivity(nextAct);
    }

    public void desertNxt(View view) {
        Intent nextAct = new Intent(this, Dessert.class);
        startActivity(nextAct);
    }

    public void terminaComandaNxt(View view) {
        Intent nextAct = new Intent(this, FinishOrder.class);
        startActivity(nextAct);
    }
}

