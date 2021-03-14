package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Dessert extends AppCompatActivity {

    static int clatite_cu_dulceata;
    static int clatite_cu_ciocolata;
    static int papanasi;
    static int cheesecake;
    static int gogosi;
    static int felie_de_tort;
    static int inghetata;
    static int desert_total;

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

    public int inc(int x) {
        x++;
        return (x);
    }

    public int dec(int x) {
        if (x > 0) {
            x--;
            return x;
        } else {
            return 0;
        }
    }

    public void clatite_cu_dulceata_inc(View view){
        clatite_cu_dulceata = inc(clatite_cu_dulceata);
        TextView tv = (TextView) findViewById(R.id.clatite_cu_dulceata_order);
        tv.setText(""+ clatite_cu_dulceata);
    }

    public void clatite_cu_dulceata_dec(View view){
        if(clatite_cu_dulceata >= 0){
            clatite_cu_dulceata = dec(clatite_cu_dulceata);
            TextView tv = (TextView) findViewById(R.id.clatite_cu_dulceata_order);
            if(clatite_cu_dulceata > 0){
                tv.setText("" + clatite_cu_dulceata);
            }else{
                tv.setText("__");
            }
        }
    }

    public void clatite_cu_ciocolata_inc(View view){
        clatite_cu_ciocolata = inc(clatite_cu_ciocolata);
        TextView tv = (TextView) findViewById(R.id.clatite_cu_ciocolata_order);
        tv.setText(""+ clatite_cu_ciocolata);
    }

    public void clatite_cu_ciocolata_dec(View view){
        if(clatite_cu_ciocolata >= 0){
            clatite_cu_ciocolata = dec(clatite_cu_ciocolata);
            TextView tv = (TextView) findViewById(R.id.clatite_cu_ciocolata_order);
            if(clatite_cu_ciocolata > 0){
                tv.setText("" + clatite_cu_ciocolata);
            }else{
                tv.setText("__");
            }
        }
    }

    public void papanasi_inc(View view){
        papanasi = inc(papanasi);
        TextView tv = (TextView) findViewById(R.id.papanasi_order);
        tv.setText(""+ papanasi);
    }

    public void papanasi_dec(View view){
        if(papanasi >= 0){
            papanasi = dec(papanasi);
            TextView tv = (TextView) findViewById(R.id.papanasi_order);
            if(papanasi > 0){
                tv.setText("" + papanasi);
            }else{
                tv.setText("__");
            }
        }
    }

    public void cheesecake_inc(View view){
        cheesecake = inc(cheesecake);
        TextView tv = (TextView) findViewById(R.id.cheesecake_order);
        tv.setText(""+ cheesecake);
    }

    public void cheesecake_dec(View view){
        if(cheesecake >= 0){
            cheesecake = dec(cheesecake);
            TextView tv = (TextView) findViewById(R.id.cheesecake_order);
            if(cheesecake > 0){
                tv.setText("" + cheesecake);
            }else{
                tv.setText("__");
            }
        }
    }

    public void gogosi_inc(View view){
        gogosi = inc(gogosi);
        TextView tv = (TextView) findViewById(R.id.gogosi_order);
        tv.setText(""+ gogosi);
    }

    public void gogosi_dec(View view){
        if(gogosi >= 0){
            gogosi = dec(gogosi);
            TextView tv = (TextView) findViewById(R.id.gogosi_order);
            if(gogosi > 0){
                tv.setText("" + gogosi);
            }else{
                tv.setText("__");
            }
        }
    }

    public void felie_de_tort_inc(View view){
        felie_de_tort = inc(felie_de_tort);
        TextView tv = (TextView) findViewById(R.id.felie_de_tort_order);
        tv.setText(""+ felie_de_tort);
    }

    public void felie_de_tort_dec(View view){
        if(felie_de_tort >= 0){
            felie_de_tort = dec(felie_de_tort);
            TextView tv = (TextView) findViewById(R.id.felie_de_tort_order);
            if(felie_de_tort > 0){
                tv.setText("" + felie_de_tort);
            }else{
                tv.setText("__");
            }
        }
    }

    public void inghetata_inc(View view){
        inghetata = inc(inghetata);
        TextView tv = (TextView) findViewById(R.id.inghetata_order);
        tv.setText(""+ inghetata);
    }

    public void inghetata_dec(View view){
        if(inghetata >= 0){
            inghetata = dec(inghetata);
            TextView tv = (TextView) findViewById(R.id.inghetata_order);
            if(inghetata > 0){
                tv.setText("" + inghetata);
            }else{
                tv.setText("__");
            }
        }
    }
}
