package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
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
        orders_list_init();
        total_cal();
    }

    public void main_menu(View view) {
        Intent previousAct = new Intent(this, OrderType.class);
        startActivity(previousAct);
    }

    public void terminaComandaDessertNxt(View view) {
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

    public void clatite_cu_dulceata_inc(View view){
        clatite_cu_dulceata = inc(clatite_cu_dulceata);
        TextView tv = (TextView) findViewById(R.id.clatite_cu_dulceata_order);
        tv.setText(""+ clatite_cu_dulceata);
         total_cal();
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
            total_cal();
        }
    }

    public void clatite_cu_ciocolata_inc(View view){
        clatite_cu_ciocolata = inc(clatite_cu_ciocolata);
        TextView tv = (TextView) findViewById(R.id.clatite_cu_ciocolata_order);
        tv.setText(""+ clatite_cu_ciocolata);
         total_cal();
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
             total_cal();
        }
    }

    public void papanasi_inc(View view){
        papanasi = inc(papanasi);
        TextView tv = (TextView) findViewById(R.id.papanasi_order);
        tv.setText(""+ papanasi);
         total_cal();
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
             total_cal();
        }
    }

    public void cheesecake_inc(View view){
        cheesecake = inc(cheesecake);
        TextView tv = (TextView) findViewById(R.id.cheesecake_order);
        tv.setText(""+ cheesecake);
         total_cal();
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
             total_cal();
        }
    }

    public void gogosi_inc(View view){
        gogosi = inc(gogosi);
        TextView tv = (TextView) findViewById(R.id.gogosi_order);
        tv.setText(""+ gogosi);
         total_cal();
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
             total_cal();
        }
    }

    public void felie_de_tort_inc(View view){
        felie_de_tort = inc(felie_de_tort);
        TextView tv = (TextView) findViewById(R.id.felie_de_tort_order);
        tv.setText(""+ felie_de_tort);
         total_cal();
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
             total_cal();
        }
    }

    public void inghetata_inc(View view){
        inghetata = inc(inghetata);
        TextView tv = (TextView) findViewById(R.id.inghetata_order);
        tv.setText(""+ inghetata);
         total_cal();
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
             total_cal();
        }
    }

    public void orders_list_init(){
        if( clatite_cu_dulceata > 0){
            TextView tv = (TextView) findViewById(R.id.clatite_cu_dulceata_order);
            tv.setText("" + clatite_cu_dulceata);
        }

        if( clatite_cu_ciocolata > 0){
            TextView tv = (TextView) findViewById(R.id.clatite_cu_ciocolata_order);
            tv.setText("" + clatite_cu_ciocolata);
        }

        if( papanasi > 0){
            TextView tv = (TextView) findViewById(R.id.papanasi_order);
            tv.setText("" + papanasi);
        }

        if( cheesecake > 0){
            TextView tv = (TextView) findViewById(R.id.cheesecake_order);
            tv.setText("" + cheesecake);
        }

        if( gogosi > 0){
            TextView tv = (TextView) findViewById(R.id.gogosi_order);
            tv.setText("" + gogosi);
        }

        if( felie_de_tort > 0){
            TextView tv = (TextView) findViewById(R.id.felie_de_tort_order);
            tv.setText("" + felie_de_tort);
        }

        if( inghetata > 0){
            TextView tv = (TextView) findViewById(R.id.inghetata_order);
            tv.setText("" + inghetata);
        }
    }

    public void total_cal(){
        desert_total = clatite_cu_dulceata * (15) + clatite_cu_ciocolata * (16) + papanasi * (12) + cheesecake * (16) + gogosi * (15) + felie_de_tort * (12) + inghetata * (17);
        FinishOrder.all_total = Soup.ciorba_total + MainCourse.fel_principal_total + Salads.salata_total + Dessert.desert_total;

        if(FinishOrder.all_total > 0){
            TextView tv = (TextView) findViewById(R.id.dessert_tot_id);
            tv.setText(FinishOrder.all_total + " lei");
        }else{
            TextView tv = (TextView) findViewById(R.id.dessert_tot_id);
            tv.setText("");
        }

        orders_list_init();
    }

}
