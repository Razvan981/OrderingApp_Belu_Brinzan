package com.example.orderingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.provider.Settings;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import java.security.cert.LDAPCertStoreParameters;
import java.util.List;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    public static boolean isWaiting = false;
    public LocationManager locationManager;
    public LocationListener listener;
    private Button b;
    private TextView t;

    public static String address;
	public static int tablex;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t = (TextView) findViewById(R.id.textView);
        b = (Button) findViewById(R.id.button2);

        locationManager = (LocationManager) getSystemService(LOCATION_SERVICE);

        listener = new LocationListener() {
            @Override
            public void onLocationChanged(Location location) {
                try{
                    Geocoder geo = new Geocoder(MainActivity.this.getApplicationContext(), Locale.getDefault());
                    List<Address> addresses = geo.getFromLocation(location.getLatitude(), location.getLongitude(), 1);
                    if (((List) addresses).isEmpty()) {
                    }
                    else {
                        if (addresses.size() > 0) {
                            address = addresses.get(0).getAddressLine(0);
                        }
                    }
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onStatusChanged(String s, int i, Bundle bundle) {

            }

            @Override
            public void onProviderEnabled(String s) {
            }

            @Override
            public void onProviderDisabled(String s) {

                Intent i = new Intent(Settings.ACTION_LOCATION_SOURCE_SETTINGS);
                startActivity(i);
            }
        };

        configure_button();
    }

    public void nextact(View view) {
        isWaiting = true;
        EditText table = (EditText) findViewById(R.id.table_no);
        Intent intent = new Intent(this, OrderType.class);
        startActivity(intent);
    }
	
	public void nextactrest(View view) {

        EditText table = (EditText) findViewById(R.id.table_no);

        if(table.getText().toString().isEmpty()){
            Toast.makeText(getApplicationContext(),"Introduceti numarul mesei!",Toast.LENGTH_SHORT).show();
        }
        else{

            String tbl_no = table.getText().toString();
            tablex = Integer.parseInt(tbl_no);

            if(tablex <=25 && tablex!= 0){
                Intent intent = new Intent(this, OrderType.class);
                startActivity(intent);
            }else {
                Toast.makeText(getApplicationContext(),"Introduceti un numar valid!",Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        switch (requestCode){
            case 10:
                configure_button();
                break;
            default:
                break;
        }
    }

    void configure_button(){
        // first check for permissions
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                requestPermissions(new String[]{Manifest.permission.ACCESS_COARSE_LOCATION,Manifest.permission.ACCESS_FINE_LOCATION,Manifest.permission.INTERNET}
                        ,10);
            }
            return;
        }
        // this code won't execute IF permissions are not allowed, because in the line above there is return statement.
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //noinspection MissingPermission
                locationManager.requestLocationUpdates("gps", 1, 0, listener);

                nextact(view);
            }
        });
    }
}