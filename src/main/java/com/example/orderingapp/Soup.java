package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
        orders_list_init();
        total_cal();
    }

    public void main_menu(View view) {
        Intent previousAct = new Intent(this, OrderType.class);
        startActivity(previousAct);
    }

    public void terminaComandaCiorbaNxt(View view) {
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
        TextView tv = (TextView) findViewById(R.id.ciorba_de_burta_order);
        tv.setText(""+ ciorba_de_burta);
        total_cal();
    }

    public void ciorba_de_burta_dec(View view){
        if(ciorba_de_burta >= 0){
            ciorba_de_burta = dec(ciorba_de_burta);
            TextView tv = (TextView) findViewById(R.id.ciorba_de_burta_order);
            if(ciorba_de_burta > 0){
                tv.setText("" + ciorba_de_burta);
            }else{
                tv.setText("__");
            }
            total_cal();
        }
    }

    public void ciorba_de_vacuta_inc(View view){
        ciorba_de_vacuta = inc(ciorba_de_vacuta);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_vacuta_order);
        tv.setText(""+ ciorba_de_vacuta);
        total_cal();
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
            total_cal();
        }
    }

    public void ciorba_de_perisoare_inc(View view){
        ciorba_de_perisoare = inc(ciorba_de_perisoare);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_perisoare_order);
        tv.setText(""+ ciorba_de_perisoare);
        total_cal();
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
            total_cal();
        }
    }

    public void ciorba_de_pui_inc(View view){
        ciorba_de_pui = inc(ciorba_de_pui);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_pui_order);
        tv.setText(""+ ciorba_de_pui);
        total_cal();
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
            total_cal();
        }
    }

    public void ciorba_de_fasole_inc(View view){
        ciorba_de_fasole = inc(ciorba_de_fasole);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_fasole_order);
        tv.setText(""+ ciorba_de_fasole);
        total_cal();
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
            total_cal();
        }
    }

    public void ciorba_de_legume_inc(View view){
        ciorba_de_legume = inc(ciorba_de_legume);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_legume_order);
        tv.setText(""+ ciorba_de_legume);
        total_cal();
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
            total_cal();
        }
    }

    public void ciorba_de_peste_inc(View view){
        ciorba_de_peste = inc(ciorba_de_peste);
        TextView tv = (TextView) findViewById(R.id.ciorba_de_peste_order);
        tv.setText(""+ ciorba_de_peste);
        total_cal();
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
            total_cal();
        }
    }

    public void orders_list_init(){
        if(ciorba_de_burta > 0){
            TextView tv = (TextView) findViewById(R.id.ciorba_de_burta_order);
            tv.setText("" + ciorba_de_burta);
        }

        if(ciorba_de_vacuta > 0){
            TextView tv = (TextView) findViewById(R.id.ciorba_de_vacuta_order);
            tv.setText("" + ciorba_de_vacuta);
        }

        if(ciorba_de_perisoare > 0){
            TextView tv = (TextView) findViewById(R.id.ciorba_de_perisoare_order);
            tv.setText("" + ciorba_de_perisoare);
        }

        if(ciorba_de_pui > 0){
            TextView tv = (TextView) findViewById(R.id.ciorba_de_pui_order);
            tv.setText("" + ciorba_de_pui);
        }

        if(ciorba_de_fasole > 0){
            TextView tv = (TextView) findViewById(R.id.ciorba_de_fasole_order);
            tv.setText("" + ciorba_de_fasole);
        }

        if(ciorba_de_legume > 0){
            TextView tv = (TextView) findViewById(R.id.ciorba_de_legume_order);
            tv.setText("" + ciorba_de_legume);
        }

        if(ciorba_de_peste > 0){
            TextView tv = (TextView) findViewById(R.id.ciorba_de_peste_order);
            tv.setText("" + ciorba_de_peste);
        }
    }

    public void total_cal(){
        ciorba_total = ciorba_de_burta *(18) + ciorba_de_vacuta * (16) + ciorba_de_perisoare * (15) + ciorba_de_pui * (15) + ciorba_de_fasole * (17) + ciorba_de_legume * (16) + ciorba_de_peste * (19);
        FinishOrder.all_total = Soup.ciorba_total + MainCourse.fel_principal_total + Salads.salata_total + Dessert.desert_total;

        if(FinishOrder.all_total > 0){
            TextView tv = (TextView) findViewById(R.id.ciorba_tot_id);
            tv.setText(FinishOrder.all_total + " lei");
        }else{
            TextView tv = (TextView) findViewById(R.id.ciorba_tot_id);
            tv.setText("");
        }

        orders_list_init();
    }

}
