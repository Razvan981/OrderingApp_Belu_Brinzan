package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Salads extends AppCompatActivity {

    static int salata_caesar;
    static int salata_greceasca;
    static int salata_cu_ton;
    static int salata_berlineza;
    static int salata_de_vara;
    static int salata_de_muraturi;
    static int salata_de_varza;
    static int salata_de_ardei;
    static int salata_taraneasca;
    static int salata_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salads);
    }

    public void main_menu(View view) {
        Intent previousAct = new Intent(this, OrderType.class);
        startActivity(previousAct);
    }

    public void terminaComandaSalataNxt(View view) {
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

    public void salata_caesar_inc(View view){
        salata_caesar = inc(salata_caesar);
        TextView tv = (TextView) findViewById(R.id.salata_caesar_order);
        tv.setText(""+ salata_caesar);
    }

    public void salata_caesar_dec(View view){
        if(salata_caesar >= 0){
            salata_caesar = dec(salata_caesar);
            TextView tv = (TextView) findViewById(R.id.salata_caesar_order);
            if(salata_caesar > 0){
                tv.setText("" + salata_caesar);
            }else{
                tv.setText("__");
            }
        }
    }

    public void salata_greceasca_inc(View view){
        salata_greceasca = inc(salata_greceasca);
        TextView tv = (TextView) findViewById(R.id.salata_greceasca_order);
        tv.setText(""+ salata_greceasca);
    }

    public void salata_greceasca_dec(View view){
        if(salata_greceasca>= 0){
            salata_greceasca = dec(salata_greceasca);
            TextView tv = (TextView) findViewById(R.id.salata_greceasca_order);
            if(salata_greceasca > 0){
                tv.setText("" + salata_greceasca);
            }else{
                tv.setText("__");
            }
        }
    }

    public void salata_cu_ton_inc(View view){
        salata_cu_ton = inc(salata_cu_ton);
        TextView tv = (TextView) findViewById(R.id.salata_cu_ton_order);
        tv.setText(""+ salata_cu_ton);
    }

    public void salata_cu_ton_dec(View view){
        if(salata_cu_ton>= 0){
            salata_cu_ton = dec(salata_cu_ton);
            TextView tv = (TextView) findViewById(R.id.salata_cu_ton_order);
            if(salata_cu_ton > 0){
                tv.setText("" + salata_cu_ton);
            }else{
                tv.setText("__");
            }
        }
    }

    public void salata_berlineza_inc(View view){
        salata_berlineza = inc(salata_berlineza);
        TextView tv = (TextView) findViewById(R.id.salata_berlineza_order);
        tv.setText(""+ salata_berlineza);
    }

    public void salata_berlineza_dec(View view){
        if(salata_berlineza>= 0){
            salata_berlineza = dec(salata_berlineza);
            TextView tv = (TextView) findViewById(R.id.salata_berlineza_order);
            if(salata_berlineza > 0){
                tv.setText("" + salata_berlineza);
            }else{
                tv.setText("__");
            }
        }
    }

    public void salata_de_vara_inc(View view){
        salata_de_vara = inc(salata_de_vara);
        TextView tv = (TextView) findViewById(R.id.salata_de_vara_order);
        tv.setText(""+ salata_de_vara);
    }

    public void salata_de_vara_dec(View view){
        if(salata_de_vara>= 0){
            salata_de_vara = dec(salata_de_vara);
            TextView tv = (TextView) findViewById(R.id.salata_de_vara_order);
            if(salata_de_vara > 0){
                tv.setText("" + salata_de_vara);
            }else{
                tv.setText("__");
            }
        }
    }

    public void salata_de_muraturi_inc(View view){
        salata_de_muraturi = inc(salata_de_muraturi);
        TextView tv = (TextView) findViewById(R.id.salata_de_muraturi_order);
        tv.setText(""+ salata_de_muraturi);
    }

    public void salata_de_muraturi_dec(View view){
        if(salata_de_muraturi>= 0){
            salata_de_muraturi = dec(salata_de_muraturi);
            TextView tv = (TextView) findViewById(R.id.salata_de_muraturi_order);
            if(salata_de_muraturi > 0){
                tv.setText("" + salata_de_muraturi);
            }else{
                tv.setText("__");
            }
        }
    }

    public void salata_de_varza_inc(View view){
        salata_de_varza = inc(salata_de_varza);
        TextView tv = (TextView) findViewById(R.id.salata_de_varza_order);
        tv.setText(""+ salata_de_varza);
    }

    public void salata_de_varza_dec(View view){
        if(salata_de_varza>= 0){
            salata_de_varza = dec(salata_de_varza);
            TextView tv = (TextView) findViewById(R.id.salata_de_varza_order);
            if(salata_de_varza > 0){
                tv.setText("" + salata_de_varza);
            }else{
                tv.setText("__");
            }
        }
    }

    public void salata_de_ardei_inc(View view){
        salata_de_ardei = inc(salata_de_ardei);
        TextView tv = (TextView) findViewById(R.id.salata_de_ardei_order);
        tv.setText(""+ salata_de_ardei);
    }

    public void salata_de_ardei_dec(View view){
        if(salata_de_ardei>= 0){
            salata_de_ardei = dec(salata_de_ardei);
            TextView tv = (TextView) findViewById(R.id.salata_de_ardei_order);
            if(salata_de_ardei > 0){
                tv.setText("" + salata_de_ardei);
            }else{
                tv.setText("__");
            }
        }
    }

    public void salata_taraneasca_inc(View view){
        salata_taraneasca = inc(salata_taraneasca);
        TextView tv = (TextView) findViewById(R.id.salata_taraneasca_order);
        tv.setText(""+ salata_taraneasca);
    }

    public void salata_taraneasca_dec(View view){
        if(salata_taraneasca>= 0){
            salata_taraneasca = dec(salata_taraneasca);
            TextView tv = (TextView) findViewById(R.id.salata_taraneasca_order);
            if(salata_taraneasca > 0){
                tv.setText("" + salata_taraneasca);
            }else{
                tv.setText("__");
            }
        }
    }
}
