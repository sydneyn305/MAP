package com.example.mapwithmarker;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

/**
 * An activity that displays a Google map with a marker (pin) to indicate a particular location.
 */
public class MapsMarkerActivity extends AppCompatActivity
        implements OnMapReadyCallback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Retrieve the content view that renders the map.
        setContentView(R.layout.activity_maps);
        // Get the SupportMapFragment and request notification
        // when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map when it's available.
     * The API invokes this callback when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user receives a prompt to install
     * Play services inside the SupportMapFragment. The API invokes this method after the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        // Add a marker in Sydney, Australia,
        // and move the map's camera to the same location.
        LatLng KateSpade = new LatLng(40.746297 ,-73.982494);
        googleMap.addMarker(new MarkerOptions().position(KateSpade)
                .title("You are here"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(KateSpade));

        LatLng event1 = new LatLng(40.6923, -73.9873);
        googleMap.addMarker(new MarkerOptions().position(event1)
                .title("Rally for the Right to Know")
                .snippet("August 24 @4:30-7 pm"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(event1));

        LatLng event2 = new LatLng(40.85603, -73.934364);
        googleMap.addMarker(new MarkerOptions().position(event2)
                .title("Charlottesville: Mourn the Dead")
                .snippet("August 17 @7-8:30 pm"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(event2));

        LatLng event3 = new LatLng(40.704035, -73.986724);
        googleMap.addMarker(new MarkerOptions().position(event3)
                .title("The Fight for Healthcare for All")
                .snippet("September 6 @7-11:00 pm"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(event3));

        LatLng event4 = new LatLng(40.704161, -73.916206);
        googleMap.addMarker(new MarkerOptions().position(event4)
                .title("Summer of Resistance: NYC")
                .snippet("August 19 @9:00 am"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(event4));

        LatLng event5 = new LatLng(40.741355, -74.003203);
        googleMap.addMarker(new MarkerOptions().position(event5)
                .title("Counter Protest Alt Right March")
                .snippet("August 19 @1-4:00 pm"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(event5));

        LatLng event6 = new LatLng(40.723219, -74.000601);
        googleMap.addMarker(new MarkerOptions().position(event6)
                .title("Bystander/Upstander Intervention Training")
                .snippet("August 22 @6:15-8:00 pm"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(event6));

        LatLng event7 = new LatLng(40.771118, -73.980084);
        googleMap.addMarker(new MarkerOptions().position(event7)
                .title("Move New York OFF Fossil Fuels NOW!")
                .snippet("August 24 @7:00-9 pm"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(event7));

        LatLng event8 = new LatLng(40.656719, -73.94617);
        googleMap.addMarker(new MarkerOptions().position(event8)
                .title("Reducing Gun Violence Summit")
                .snippet("August 24 @6-9:00 pm"));
        googleMap.moveCamera(CameraUpdateFactory.newLatLng(event8));
    }


}
