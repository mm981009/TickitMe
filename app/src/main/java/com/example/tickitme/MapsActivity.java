package com.example.tickitme;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;



        //create list
        Lot[] lotList = new Lot[2];
        lotList[0] = new Lot("Shaw", false, 42.726827, -84.475914, 10, false);
        lotList[1] = new Lot("Wharton", false, 42.7239, -84.4696, 10, true);




/*
        for each lot in lostList{
            mMap.addMarker(new MarkerOptions().position(lot.position).title(lot.Name));)
        }
*/
//http://chart.apis.google.com/chart?chst=d_map_pin_letter&chld=%E2%80%A2%7C246959



        for (int i = 0; i < lotList.length; i++) {
            if(lotList[i].getPayByPark() == true){

                mMap.addMarker(new MarkerOptions().position(lotList[i].getposition()).title(lotList[i].getLotName()).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_RED)));
            }
            else{
                mMap.addMarker(new MarkerOptions().position(lotList[i].getposition()).title(lotList[i].getLotName()).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_AZURE)));
            }
        }
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lotList[0].getposition()));

    }
}