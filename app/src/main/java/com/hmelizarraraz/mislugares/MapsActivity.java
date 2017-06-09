package com.hmelizarraraz.mislugares;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    public static final String LAT = "lat";
    public static final String LONG = "long";
    public static final String NAME = "placeName";
    private double latitud;
    private double longitud;
    private String place;

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);

        Bundle params = getIntent().getExtras();

        latitud = params.getDouble(LAT, -33);
        longitud = params.getDouble(LONG, 150);
        place = params.getString(NAME, "Lugar");


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

        // Add a marker in Sydney and move the camera
        LatLng lugar = new LatLng(latitud, longitud);
        mMap.addMarker(new MarkerOptions().position(lugar).title(place));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(lugar));
        mMap.moveCamera(CameraUpdateFactory.zoomTo(15));
    }
}