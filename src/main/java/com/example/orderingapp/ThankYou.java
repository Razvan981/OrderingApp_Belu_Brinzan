package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ThankYou extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thank_you);
    }

    public void main_menu(View view) {

        FinishOrder.old_ord_string =  FinishOrder.old_ord_string + FinishOrder.order_string;
        FinishOrder.old_all_total=FinishOrder.all_total;

        Soup.ciorba_de_burta = 0;
        Soup.ciorba_de_vacuta = 0;
        Soup.ciorba_de_perisoare = 0;
        Soup.ciorba_de_pui = 0;
        Soup.ciorba_de_fasole = 0;
        Soup.ciorba_de_legume = 0;
        Soup.ciorba_de_peste = 0;
        Soup.ciorba_total = 0;

        MainCourse.piept_de_pui = 0;
        MainCourse.ceafa_de_porc = 0;
        MainCourse.cotlet_de_porc = 0;
        MainCourse.muschiulet_de_porc = 0;
        MainCourse.cartofi_taranesti = 0;
        MainCourse.cartofi_prajiti = 0;
        MainCourse.orez = 0;
        MainCourse.legume_la_gratar = 0;
        MainCourse.spaghete_carbonara = 0;
        MainCourse.spaghete_milaneze = 0;
        MainCourse.fel_principal_total = 0;

        Salads.salata_caesar = 0;
        Salads.salata_greceasca = 0;
        Salads.salata_cu_ton = 0;
        Salads.salata_berlineza = 0;
        Salads.salata_de_vara = 0;
        Salads.salata_de_muraturi = 0;
        Salads.salata_de_varza = 0;
        Salads.salata_de_ardei = 0;
        Salads.salata_taraneasca = 0;
        Salads.salata_total = 0;

        Dessert.clatite_cu_dulceata = 0;
        Dessert.clatite_cu_ciocolata = 0;
        Dessert.papanasi = 0;
        Dessert.cheesecake = 0;
        Dessert.gogosi = 0;
        Dessert.felie_de_tort = 0;
        Dessert.inghetata = 0;
        Dessert.desert_total = 0;

        Intent previousAct = new Intent(this, OrderType.class);
        startActivity(previousAct);
    }
}