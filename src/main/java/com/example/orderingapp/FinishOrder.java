package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.AlarmManager;
import android.app.AlertDialog;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FinishOrder extends AppCompatActivity {
    TextView t;
    static int all_total;
    static int old_all_total;
    String fin_order_string="";
    static String old_ord_string="";
    static String order_string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_finish_order);
        show_order();
        tot_price();
        t = (TextView) findViewById(R.id.textView);

        if(MainActivity.address != null) {
            t.setText(MainActivity.address);
        }

        createNotificationChannel();

        Button buttonNotification = findViewById(R.id.button5);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(this, "notifChannel")
                .setSmallIcon(R.drawable.ic_home_black_24dp)
                .setContentTitle("Comanda Finalizata")
                .setContentText("Comanda a fost procesata cu succes!")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(this);

        View view = null;
        buttonNotification.setOnClickListener(v -> {
            multumimNxt(view);
            final Object o = this;
            AlertDialog.Builder builder2 = new AlertDialog.Builder(this);
            builder2.setMessage("Doriti sa confirmati aceasta comanda?")
                    .setCancelable(false)
                    .setNegativeButton("Nu", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.cancel();
                        }
                    })
                    .setPositiveButton("Da", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent nextAct = new Intent((FinishOrder) o, ThankYou.class);

                            notificationManager.notify(100, builder.build());

                            startActivity(nextAct);
                        }});
            AlertDialog alert = builder2.create();
            alert.show();
        });
    }

    private void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            CharSequence name = "notifChannel";
            String description = "You gotta listen";
            int importance = NotificationManager.IMPORTANCE_DEFAULT;
            NotificationChannel channel = new NotificationChannel("notifChannel", name, importance);
            channel.setDescription(description);
            NotificationManager notificationManager = getSystemService(NotificationManager.class);
            notificationManager.createNotificationChannel(channel);
        }
    }

    public void main_menu(View view) {
        Intent previousAct = new Intent(this, OrderType.class);
        startActivity(previousAct);
    }

    public void multumimNxt(View view) {
        final Object o = this;
        order_string = fin_order_string;
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Doriti sa confirmati aceasta comanda?")
                .setCancelable(false)
                .setNegativeButton("Nu", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .setPositiveButton("Da", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent nextAct = new Intent((FinishOrder) o, ThankYou.class);
                        startActivity(nextAct);
                    }});
        AlertDialog alert = builder.create();
        alert.show();
    }

    public void show_order(){
        if (Soup.ciorba_de_burta > 0) {
            fin_order_string = fin_order_string + "ciorba de burta- " + String.valueOf(Soup.ciorba_de_burta) + ", ";
        }

        if (Soup.ciorba_de_vacuta > 0) {
            fin_order_string = fin_order_string + "ciorba de vacuta- " + String.valueOf(Soup.ciorba_de_vacuta) + ", ";
        }

        if (Soup.ciorba_de_perisoare > 0) {
            fin_order_string = fin_order_string + "ciorba de perisoare- " + String.valueOf(Soup.ciorba_de_perisoare) + ", ";
        }

        if (Soup.ciorba_de_pui > 0) {
            fin_order_string = fin_order_string + "ciorba de pui- " + String.valueOf(Soup.ciorba_de_pui) + ", ";
        }

        if (Soup.ciorba_de_fasole > 0) {
            fin_order_string = fin_order_string + "ciorba de fasole- " + String.valueOf(Soup.ciorba_de_fasole) + ", ";
        }

        if (Soup.ciorba_de_legume > 0) {
            fin_order_string = fin_order_string + "ciorba de legume- " + String.valueOf(Soup.ciorba_de_legume) + ", ";
        }

        if (Soup.ciorba_de_peste > 0) {
            fin_order_string = fin_order_string + "ciorba de peste- " + String.valueOf(Soup.ciorba_de_peste) + ", ";
        }

        if (MainCourse.piept_de_pui > 0) {
            fin_order_string = fin_order_string + "piept de pui- " + String.valueOf(MainCourse.piept_de_pui) + ", ";
        }

        if (MainCourse.ceafa_de_porc > 0) {
            fin_order_string = fin_order_string + "ceafa de porc- " + String.valueOf(MainCourse.ceafa_de_porc) + ", ";
        }

        if (MainCourse.cotlet_de_porc > 0) {
            fin_order_string = fin_order_string + "cotlet de porc- " + String.valueOf(MainCourse.cotlet_de_porc) + ", ";
        }

        if (MainCourse.muschiulet_de_porc > 0) {
            fin_order_string = fin_order_string + "muschiulet de porc- " + String.valueOf(MainCourse.muschiulet_de_porc) + ", ";
        }

        if (MainCourse.cartofi_taranesti > 0) {
            fin_order_string = fin_order_string + "cartofi taranesti- " + String.valueOf(MainCourse.cartofi_taranesti) + ", ";
        }

        if (MainCourse.cartofi_prajiti > 0) {
            fin_order_string = fin_order_string + "cartofi prajiti- " + String.valueOf(MainCourse.cartofi_prajiti) + ", ";
        }

        if (MainCourse.orez > 0) {
            fin_order_string = fin_order_string + "orez- " + String.valueOf(MainCourse.orez) + ", ";
        }

        if (MainCourse.legume_la_gratar > 0) {
            fin_order_string = fin_order_string + "legume la gratar- " + String.valueOf(MainCourse.legume_la_gratar) + ", ";
        }

        if (MainCourse.spaghete_carbonara > 0) {
            fin_order_string = fin_order_string + "spaghete carbonara- " + String.valueOf(MainCourse.spaghete_carbonara) + ", ";
        }

        if (MainCourse.spaghete_milaneze > 0) {
            fin_order_string = fin_order_string + "spaghete milaneze- " + String.valueOf(MainCourse.spaghete_milaneze) + ", ";
        }

        if (Salads.salata_caesar > 0) {
            fin_order_string = fin_order_string + "salata caesar- " + String.valueOf(Salads.salata_caesar) + ", ";
        }

        if (Salads.salata_greceasca > 0) {
            fin_order_string = fin_order_string + "salata greceasca- " + String.valueOf(Salads.salata_greceasca) + ", ";
        }

        if (Salads.salata_cu_ton > 0) {
            fin_order_string = fin_order_string + "salata cu ton- " + String.valueOf(Salads.salata_cu_ton) + ", ";
        }

        if (Salads.salata_berlineza > 0) {
            fin_order_string = fin_order_string + "salata berlineza- " + String.valueOf(Salads.salata_berlineza) + ", ";
        }

        if (Salads.salata_de_vara > 0) {
            fin_order_string = fin_order_string + "salata de vara- " + String.valueOf(Salads.salata_de_vara) + ", ";
        }

        if (Salads.salata_de_muraturi > 0) {
            fin_order_string = fin_order_string + "salata de muraturi- " + String.valueOf(Salads.salata_de_muraturi) + ", ";
        }

        if (Salads.salata_de_varza > 0) {
            fin_order_string = fin_order_string + "salata de varza- " + String.valueOf(Salads.salata_de_varza) + ", ";
        }

        if (Salads.salata_de_ardei > 0) {
            fin_order_string = fin_order_string + "salata de ardei- " + String.valueOf(Salads.salata_de_ardei) + ", ";
        }

        if (Salads.salata_taraneasca > 0) {
            fin_order_string = fin_order_string + "salata taraneasca- " + String.valueOf(Salads.salata_taraneasca) + ", ";
        }

        if (Dessert.clatite_cu_dulceata > 0) {
            fin_order_string = fin_order_string + "clatite cu dulceata- " + String.valueOf(Dessert.clatite_cu_dulceata) + ", ";
        }

        if (Dessert.clatite_cu_ciocolata > 0) {
            fin_order_string = fin_order_string + "clatite cu ciocolata- " + String.valueOf(Dessert.clatite_cu_ciocolata) + ", ";
        }

        if (Dessert.papanasi > 0) {
            fin_order_string = fin_order_string + "papanasi- " + String.valueOf(Dessert.papanasi) + ", ";
        }

        if (Dessert.cheesecake > 0) {
            fin_order_string = fin_order_string + "cheesecake- " + String.valueOf(Dessert.cheesecake) + ", ";
        }

        if (Dessert.gogosi > 0) {
            fin_order_string = fin_order_string + "gogosi- " + String.valueOf(Dessert.gogosi) + ", ";
        }

        if (Dessert.felie_de_tort > 0) {
            fin_order_string = fin_order_string + "felie de tort- " + String.valueOf(Dessert.felie_de_tort) + ", ";
        }

        if (Dessert.inghetata > 0) {
            fin_order_string = fin_order_string + "inghetata- " + String.valueOf(Dessert.inghetata) + ", ";
        }

        String temp_order_view = fin_order_string + old_ord_string;
        TextView tv = (TextView) findViewById(R.id.order_final);
        tv.setText("" + temp_order_view);

    }

    public void tot_price(){
        all_total=all_total+old_all_total;
        TextView tv = (TextView) findViewById(R.id.tot_p);
        tv.setText("total:" +(FinishOrder.all_total) + " lei");
    }


}
