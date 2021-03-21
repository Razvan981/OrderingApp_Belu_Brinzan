package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainCourse extends AppCompatActivity {

    static int piept_de_pui;
    static int ceafa_de_porc;
    static int cotlet_de_porc;
    static int muschiulet_de_porc;
    static int cartofi_taranesti;
    static int cartofi_prajiti;
    static int orez;
    static int legume_la_gratar;
    static int spaghete_carbonara;
    static int spaghete_milaneze;
    static int fel_principal_total;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_course);
        orders_list_init();
        total_cal();
    }

    public void main_menu(View view) {
        Intent previousAct = new Intent(this, OrderType.class);
        startActivity(previousAct);
    }

    public void terminaComandaFelPrincipalNxt(View view) {
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

    public void piept_de_pui_inc(View view){
        piept_de_pui = inc(piept_de_pui);
        TextView tv = (TextView) findViewById(R.id.piept_de_pui_order);
        tv.setText(""+ piept_de_pui);
         total_cal();
    }

    public void piept_de_pui_dec(View view){
        if(piept_de_pui >= 0){
            piept_de_pui = dec(piept_de_pui);
            TextView tv = (TextView) findViewById(R.id.piept_de_pui_order);
            if(piept_de_pui > 0){
                tv.setText("" + piept_de_pui);
            }else{
                tv.setText("__");
            }
            total_cal();
        }
    }

    public void ceafa_de_porc_inc(View view){
        ceafa_de_porc = inc(ceafa_de_porc);
        TextView tv = (TextView) findViewById(R.id.ceafa_de_porc_order);
        tv.setText(""+ ceafa_de_porc);
        total_cal();
    }

    public void ceafa_de_porc_dec(View view){
        if(ceafa_de_porc >= 0){
            ceafa_de_porc = dec(ceafa_de_porc);
            TextView tv = (TextView) findViewById(R.id.ceafa_de_porc_order);
            if(ceafa_de_porc > 0){
                tv.setText("" + ceafa_de_porc);
            }else{
                tv.setText("__");
            }
             total_cal();
        }
    }

    public void cotlet_de_porc_inc(View view){
        cotlet_de_porc = inc(cotlet_de_porc);
        TextView tv = (TextView) findViewById(R.id.cotlet_de_porc_order);
        tv.setText(""+ cotlet_de_porc);
         total_cal();
    }

    public void cotlet_de_porc_dec(View view){
        if(cotlet_de_porc >= 0){
            cotlet_de_porc = dec(cotlet_de_porc);
            TextView tv = (TextView) findViewById(R.id.cotlet_de_porc_order);
            if(cotlet_de_porc > 0){
                tv.setText("" + cotlet_de_porc);
            }else{
                tv.setText("__");
            }
             total_cal();
        }
    }

    public void muschiulet_de_porc_inc(View view){
        muschiulet_de_porc = inc(muschiulet_de_porc);
        TextView tv = (TextView) findViewById(R.id.muschiulet_de_porc_order);
        tv.setText(""+ muschiulet_de_porc);
         total_cal();
    }

    public void muschiulet_de_porc_dec(View view){
        if(muschiulet_de_porc >= 0){
            muschiulet_de_porc = dec(muschiulet_de_porc);
            TextView tv = (TextView) findViewById(R.id.muschiulet_de_porc_order);
            if(muschiulet_de_porc > 0){
                tv.setText("" + muschiulet_de_porc);
            }else{
                tv.setText("__");
            }
             total_cal();
        }
    }

    public void cartofi_taranesti_inc(View view){
        cartofi_taranesti = inc(cartofi_taranesti);
        TextView tv = (TextView) findViewById(R.id.cartofi_taranesti_order);
        tv.setText(""+ cartofi_taranesti);
         total_cal();
    }

    public void cartofi_taranesti_dec(View view){
        if(cartofi_taranesti >= 0){
            cartofi_taranesti = dec(cartofi_taranesti);
            TextView tv = (TextView) findViewById(R.id.cartofi_taranesti_order);
            if(cartofi_taranesti > 0){
                tv.setText("" + cartofi_taranesti);
            }else{
                tv.setText("__");
            }
            total_cal();
        }
    }

    public void cartofi_prajiti_inc(View view){
        cartofi_prajiti = inc(cartofi_prajiti);
        TextView tv = (TextView) findViewById(R.id.cartofi_prajiti_order);
        tv.setText(""+ cartofi_prajiti);
        total_cal();
    }

    public void cartofi_prajiti_dec(View view){
        if(cartofi_prajiti >= 0){
            cartofi_prajiti = dec(cartofi_prajiti);
            TextView tv = (TextView) findViewById(R.id.cartofi_prajiti_order);
            if(cartofi_prajiti > 0){
                tv.setText("" + cartofi_prajiti);
            }else{
                tv.setText("__");
            }
             total_cal();
        }
    }

    public void orez_inc(View view){
        orez = inc(orez);
        TextView tv = (TextView) findViewById(R.id.orez_order);
        tv.setText(""+ orez);
         total_cal();
    }

    public void orez_dec(View view){
        if(orez >= 0){
            orez = dec(orez);
            TextView tv = (TextView) findViewById(R.id.orez_order);
            if(orez > 0){
                tv.setText("" + orez);
            }else{
                tv.setText("__");
            }
             total_cal();
        }
    }

    public void legume_la_gratar_inc(View view){
        legume_la_gratar = inc(legume_la_gratar);
        TextView tv = (TextView) findViewById(R.id.legume_la_gratar_order);
        tv.setText(""+ legume_la_gratar);
         total_cal();
    }

    public void legume_la_gratar_dec(View view){
        if(legume_la_gratar >= 0){
            legume_la_gratar = dec(legume_la_gratar);
            TextView tv = (TextView) findViewById(R.id.legume_la_gratar_order);
            if(legume_la_gratar > 0){
                tv.setText("" + legume_la_gratar);
            }else{
                tv.setText("__");
            }
             total_cal();
        }
    }

    public void spaghete_carbonara_inc(View view){
        spaghete_carbonara = inc(spaghete_carbonara);
        TextView tv = (TextView) findViewById(R.id.spaghete_carbonara_order);
        tv.setText(""+ spaghete_carbonara);
         total_cal();
    }

    public void spaghete_carbonara_dec(View view){
        if(spaghete_carbonara >= 0){
            spaghete_carbonara = dec(spaghete_carbonara);
            TextView tv = (TextView) findViewById(R.id.spaghete_carbonara_order);
            if(spaghete_carbonara > 0){
                tv.setText("" + spaghete_carbonara);
            }else{
                tv.setText("__");
            }
             total_cal();
        }
    }

    public void spaghete_milaneze_inc(View view){
        spaghete_milaneze = inc(spaghete_milaneze);
        TextView tv = (TextView) findViewById(R.id.spaghete_milaneze_order);
        tv.setText(""+ spaghete_milaneze);
         total_cal();
    }

    public void spaghete_milaneze_dec(View view){
        if(spaghete_milaneze >= 0){
            spaghete_milaneze = dec(spaghete_milaneze);
            TextView tv = (TextView) findViewById(R.id.spaghete_milaneze_order);
            if(spaghete_milaneze > 0){
                tv.setText("" + spaghete_milaneze);
            }else{
                tv.setText("__");
            }
             total_cal();
        }
    }

    public void orders_list_init(){
        if(piept_de_pui > 0){
            TextView tv = (TextView) findViewById(R.id.piept_de_pui_order);
            tv.setText("" + piept_de_pui);
        }

        if(ceafa_de_porc > 0){
            TextView tv = (TextView) findViewById(R.id.ceafa_de_porc_order);
            tv.setText("" + ceafa_de_porc);
        }

        if(cotlet_de_porc > 0){
            TextView tv = (TextView) findViewById(R.id.cotlet_de_porc_order);
            tv.setText("" + cotlet_de_porc);
        }

        if(muschiulet_de_porc > 0){
            TextView tv = (TextView) findViewById(R.id.muschiulet_de_porc_order);
            tv.setText("" + muschiulet_de_porc);
        }

        if(cartofi_taranesti > 0){
            TextView tv = (TextView) findViewById(R.id.cartofi_taranesti_order);
            tv.setText("" + cartofi_taranesti);
        }

        if(cartofi_prajiti > 0){
            TextView tv = (TextView) findViewById(R.id.cartofi_prajiti_order);
            tv.setText("" + cartofi_prajiti);
        }

        if(orez > 0){
            TextView tv = (TextView) findViewById(R.id.orez_order);
            tv.setText("" + orez);
        }

        if(legume_la_gratar > 0){
            TextView tv = (TextView) findViewById(R.id.legume_la_gratar_order);
            tv.setText("" + legume_la_gratar);
        }

        if(spaghete_carbonara > 0){
            TextView tv = (TextView) findViewById(R.id.spaghete_carbonara_order);
            tv.setText("" + spaghete_carbonara);
        }

        if(spaghete_milaneze > 0){
            TextView tv = (TextView) findViewById(R.id.spaghete_milaneze_order);
            tv.setText("" + spaghete_milaneze);
        }
    }

    public void total_cal(){
        fel_principal_total = piept_de_pui * (20) + ceafa_de_porc * (23) + cotlet_de_porc * (23) + muschiulet_de_porc * (25) + cartofi_taranesti * (12) + cartofi_prajiti * (8) + orez * (10) + legume_la_gratar * (11) + spaghete_carbonara * (24) + spaghete_milaneze * (25);
        FinishOrder.all_total = Soup.ciorba_total + MainCourse.fel_principal_total + Salads.salata_total + Dessert.desert_total;

        if(FinishOrder.all_total > 0){
            TextView tv = (TextView) findViewById(R.id.main_course_tot_id);
            tv.setText(FinishOrder.all_total + " lei");
        }else{
            TextView tv = (TextView) findViewById(R.id.main_course_tot_id);
            tv.setText("");
        }

        orders_list_init();
    }
}