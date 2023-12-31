package com.aliberkaygedikoglu.haritakullanimi;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.aliberkaygedikoglu.haritakullanimi.databinding.ActivityMainBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager().findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

        binding.buttonKonumaGit.setOnClickListener(v -> {
            //41.0370013 , 28.974792 , 15z
            LatLng konum = new LatLng(41.0370013,28.974792);
            mMap.addMarker(new MarkerOptions().position(konum).title("Taksim"))
                    .setIcon(BitmapDescriptorFactory.fromResource(R.drawable.marker));
            mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(konum,17f));
            mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
        });
    }

    @Override
    public void onMapReady(@NonNull GoogleMap googleMap) {
        mMap = googleMap;
        LatLng sydney = new LatLng(-34,151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
}