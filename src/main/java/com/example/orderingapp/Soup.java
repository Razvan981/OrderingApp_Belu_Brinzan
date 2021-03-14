package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Soup extends AppCompatActivity {

    static int ciorba_de_burta;
    static int ciorba_de_vacuta;
    static int ciorba_de_perisoare;
    static int ciorba_de_pui;
    static int ciorba_de_fasole;
    static int ciorba_de_legume;
    static int ciorba_de_peste;
    static int ciorba_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soup);
    }

    public void main_menu(View view) {
        Intent previousAct = new Intent(this, OrderType.class);
        startActivity(previousAct);
    }

    public void terminaComandaCiorbaNxt(View view) {
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

    public void ciorba_de_burta_inc(View view){
        ciorba_de_burta = inc(ciorba_de_burta);
        TextView tv = findViewById(R.id.ciorba_de_burta_order);
        tv.setText(""+ ciorba_de_burta);
    }

    public void ciorba_de_burta_dec(View view){
        if(ciorba_de_burta >= 0){
            ciorba_de_burta = dec(ciorba_de_burta);
            TextView tv = findViewById(R.id.ciorba_de_burta_order);
            if(ciorba_de_burta > 0){
                tv.setText("" + ciorba_de_burta);
            }else{
                tv.setText("__");
            }
        }
    }

    public void ciorba_de_vacuta_inc(View view){
        ciorba_de_vacuta = inc(ciorba_de_vacuta);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_vacuta_order);
        tv.setText(""+ ciorba_de_vacuta);
    }

    public void ciorba_de_vacuta_dec(View view){
        if(ciorba_de_vacuta >= 0){
            ciorba_de_vacuta = dec(ciorba_de_vacuta);
            TextView tv = (TextView) findViewById(R.id.ciorba_de_vacuta_order);
            if(ciorba_de_vacuta > 0){
                tv.setText("" + ciorba_de_vacuta);
            }else{
                tv.setText("__");
            }
        }
    }

    public void ciorba_de_perisoare_inc(View view){
        ciorba_de_perisoare = inc(ciorba_de_perisoare);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_perisoare_order);
        tv.setText(""+ ciorba_de_perisoare);
    }

    public void ciorba_de_perisoare_dec(View view){
        if(ciorba_de_perisoare >= 0){
            ciorba_de_perisoare = dec(ciorba_de_perisoare);
            TextView tv = (TextView) findViewById(R.id.ciorba_de_perisoare_order);
            if(ciorba_de_perisoare > 0){
                tv.setText("" + ciorba_de_perisoare);
            }else{
                tv.setText("__");
            }
        }
    }

    public void ciorba_de_pui_inc(View view){
        ciorba_de_pui = inc(ciorba_de_pui);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_pui_order);
        tv.setText(""+ ciorba_de_pui);
    }

    public void ciorba_de_pui_dec(View view){
        if(ciorba_de_pui >= 0){
            ciorba_de_pui = dec(ciorba_de_pui);
            TextView tv = (TextView) findViewById(R.id.ciorba_de_pui_order);
            if(ciorba_de_pui > 0){
                tv.setText("" + ciorba_de_pui);
            }else{
                tv.setText("__");
            }
        }
    }

    public void ciorba_de_fasole_inc(View view){
        ciorba_de_fasole = inc(ciorba_de_fasole);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_fasole_order);
        tv.setText(""+ ciorba_de_fasole);
    }

    public void ciorba_de_fasole_dec(View view){
        if(ciorba_de_fasole >= 0){
            ciorba_de_fasole = dec(ciorba_de_fasole);
            TextView tv = findViewById(R.id.ciorba_de_fasole_order);
            if(ciorba_de_fasole > 0){
                tv.setText("" + ciorba_de_fasole);
            }else{
                tv.setText("__");
            }
        }
    }

    public void ciorba_de_legume_inc(View view){
        ciorba_de_legume = inc(ciorba_de_legume);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_legume_order);
        tv.setText(""+ ciorba_de_legume);
    }

    public void ciorba_de_legume_dec(View view){
        if(ciorba_de_legume >= 0){
            ciorba_de_legume = dec(ciorba_de_legume);
            TextView tv = (TextView) findViewById(R.id.ciorba_de_legume_order);
            if(ciorba_de_legume > 0){
                tv.setText("" + ciorba_de_legume);
            }else{
                tv.setText("__");
            }
        }
    }

    public void ciorba_de_peste_inc(View view){
        ciorba_de_peste = inc(ciorba_de_peste);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_peste_order);
        tv.setText(""+ ciorba_de_peste);
    }

    public void ciorba_de_peste_dec(View view){
        if(ciorba_de_peste >= 0){
            ciorba_de_peste = dec(ciorba_de_peste);
            TextView tv = (TextView) findViewById(R.id.ciorba_de_peste_order);
            if(ciorba_de_peste > 0){
                tv.setText("" + ciorba_de_peste);
            }else{
                tv.setText("__");
            }
        }
    }
}
