package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

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
    }

    public void main_menu(View view) {
        Intent previousAct = new Intent(this, OrderType.class);
        startActivity(previousAct);
    }

    public void terminaComandaFelPrincipalNxt(View view) {
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

    public void piept_de_pui_inc(View view){
        piept_de_pui = inc(piept_de_pui);
        TextView tv = (TextView) findViewById(R.id.piept_de_pui_order);
        tv.setText(""+ piept_de_pui);
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
        }
    }

    public void ceafa_de_porc_inc(View view){
        ceafa_de_porc = inc(ceafa_de_porc);
        TextView tv = (TextView) findViewById(R.id.ceafa_de_porc_order);
        tv.setText(""+ ceafa_de_porc);
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
        }
    }

    public void cotlet_de_porc_inc(View view){
        cotlet_de_porc = inc(cotlet_de_porc);
        TextView tv = (TextView) findViewById(R.id.cotlet_de_porc_order);
        tv.setText(""+ cotlet_de_porc);
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
        }
    }

    public void muschiulet_de_porc_inc(View view){
        muschiulet_de_porc = inc(muschiulet_de_porc);
        TextView tv = (TextView) findViewById(R.id.muschiulet_de_porc_order);
        tv.setText(""+ muschiulet_de_porc);
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
        }
    }

    public void cartofi_taranesti_inc(View view){
        cartofi_taranesti = inc(cartofi_taranesti);
        TextView tv = (TextView) findViewById(R.id.cartofi_taranesti_order);
        tv.setText(""+ cartofi_taranesti);
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
        }
    }

    public void cartofi_prajiti_inc(View view){
        cartofi_prajiti = inc(cartofi_prajiti);
        TextView tv = (TextView) findViewById(R.id.cartofi_prajiti_order);
        tv.setText(""+ cartofi_prajiti);
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
        }
    }

    public void orez_inc(View view){
        orez = inc(orez);
        TextView tv = (TextView) findViewById(R.id.orez_order);
        tv.setText(""+ orez);
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
        }
    }

    public void legume_la_gratar_inc(View view){
        legume_la_gratar = inc(legume_la_gratar);
        TextView tv = (TextView) findViewById(R.id.legume_la_gratar_order);
        tv.setText(""+ legume_la_gratar);
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
        }
    }

    public void spaghete_carbonara_inc(View view){
        spaghete_carbonara = inc(spaghete_carbonara);
        TextView tv = (TextView) findViewById(R.id.spaghete_carbonara_order);
        tv.setText(""+ spaghete_carbonara);
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
        }
    }

    public void spaghete_milaneze_inc(View view){
        spaghete_milaneze = inc(spaghete_milaneze);
        TextView tv = (TextView) findViewById(R.id.spaghete_milaneze_order);
        tv.setText(""+ spaghete_milaneze);
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
        }
    }
}
