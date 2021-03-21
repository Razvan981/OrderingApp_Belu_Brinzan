package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class OrderType extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order_type);
        total_init();
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
        if(FinishOrder.all_total > 0){
        Intent nextAct = new Intent(this, FinishOrder.class);

            if(MainActivity.address == null && MainActivity.isWaiting == true) {
                AlertDialog.Builder builder3 = new AlertDialog.Builder(this);
                builder3.setMessage("Se cauta adresa...")
                        .setCancelable(false)
                        .setNegativeButton("Ok", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.cancel();
                            }
                        });
                AlertDialog alert = builder3.create();
                alert.show();
            }
            else {
                startActivity(nextAct);
            }

        }else{
            Toast.makeText(getApplicationContext(), "Va rugam sa adaugati cel putin o comanda!", Toast.LENGTH_SHORT).show();
        }
    }

    public void total_init(){
        FinishOrder.all_total = Soup.ciorba_total + MainCourse.fel_principal_total + Salads.salata_total + Dessert.desert_total;
        TextView tv = (TextView) findViewById(R.id.total_on_mm);
        if(FinishOrder.all_total > 0){
            tv.setText(FinishOrder.all_total + " lei");
        }
    }

}
