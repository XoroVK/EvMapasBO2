package com.cmsdev.evmapasbo;

import androidx.fragment.app.FragmentActivity;

import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.cmsdev.evmapasbo.databinding.ActivityMapsBinding;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    private ActivityMapsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

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

        LatLng brasil = new LatLng(-15.7801, -47.9292);
        mMap.addMarker(new MarkerOptions().position(brasil).title("Capital de Brasil"));

        LatLng españa = new LatLng(40.4168, -3.7038);
        mMap.addMarker(new MarkerOptions().position(españa).title("Capital de España"));

        LatLng francia = new LatLng(48.8566, 2.3522);
        mMap.addMarker(new MarkerOptions().position(francia).title("Capital de Francia"));

        LatLng japon = new LatLng(35.682839, 139.759455);
        mMap.addMarker(new MarkerOptions().position(japon).title("Capital de Japón"));

        LatLng mexico = new LatLng(19.4326, -99.1332);
        mMap.addMarker(new MarkerOptions().position(mexico).title("Capital de México"));

        LatLng estadosUnidos = new LatLng(38.9072, -77.0369);
        mMap.addMarker(new MarkerOptions().position(estadosUnidos).title("Capital de Estados Unidos"));

        LatLng alemania = new LatLng(52.5200, 13.4050);
        mMap.addMarker(new MarkerOptions().position(alemania).title("Capital de Alemania"));

        LatLng italia = new LatLng(41.9028, 12.4964);
        mMap.addMarker(new MarkerOptions().position(italia).title("Capital de Italia"));

        LatLng australia = new LatLng(-35.2809, 149.1300);
        mMap.addMarker(new MarkerOptions().position(australia).title("Capital de Australia"));

        LatLng canada = new LatLng(45.4215, -75.6972);
        mMap.addMarker(new MarkerOptions().position(canada).title("Capital de Canadá"));

        LatLng india = new LatLng(28.6139, 77.2090);
        mMap.addMarker(new MarkerOptions().position(india).title("Capital de India"));

        LatLng sudafrica = new LatLng(-25.7461, 28.1881);
        mMap.addMarker(new MarkerOptions().position(sudafrica).title("Capital de Sudáfrica"));

        LatLng rusia = new LatLng(55.7558, 37.6173);
        mMap.addMarker(new MarkerOptions().position(rusia).title("Capital de Rusia"));

        LatLng china = new LatLng(39.9042, 116.4074);
        mMap.addMarker(new MarkerOptions().position(china).title("Capital de China"));

        LatLng egipto = new LatLng(30.0444, 31.2357);
        mMap.addMarker(new MarkerOptions().position(egipto).title("Capital de Egipto"));

        LatLng reinoUnido = new LatLng(51.5074, -0.1278);
        mMap.addMarker(new MarkerOptions().position(reinoUnido).title("Capital del Reino Unido"));

        LatLng argentina = new LatLng(-34.61315, -58.37723);
        mMap.addMarker(new MarkerOptions().position(argentina).title("Capital de Argentina"));

        LatLng bolivia = new LatLng(-16.5000, -68.1193);
        mMap.addMarker(new MarkerOptions().position(bolivia).title("Capital de Bolivia"));

        LatLng chile = new LatLng(-33.4489, -70.6693);
        mMap.addMarker(new MarkerOptions().position(chile).title("Capital de Chile"));

        LatLng colombia = new LatLng(4.6118, -74.0817);
        mMap.addMarker(new MarkerOptions().position(colombia).title("Capital de Colombia"));

        LatLng ecuador = new LatLng(-0.22985, -78.52495);
        mMap.addMarker(new MarkerOptions().position(ecuador).title("Capital de Ecuador"));

        LatLng guayana = new LatLng(6.8013, -58.1551);
        mMap.addMarker(new MarkerOptions().position(guayana).title("Capital de Guayana"));

        LatLng paraguay = new LatLng(-25.2637, -57.5759);
        mMap.addMarker(new MarkerOptions().position(paraguay).title("Capital de Paraguay"));

        LatLng perú = new LatLng(-12.0464, -77.0428);
        mMap.addMarker(new MarkerOptions().position(perú).title("Capital de Perú"));

        LatLng surinam = new LatLng(5.8690, -55.1672);
        mMap.addMarker(new MarkerOptions().position(surinam).title("Capital de Surinam"));

        LatLng uruguay = new LatLng(-34.9011, -56.1645);
        mMap.addMarker(new MarkerOptions().position(uruguay).title("Capital de Uruguay"));

        LatLng venezuela = new LatLng(10.4880, -66.8792);
        mMap.addMarker(new MarkerOptions().position(venezuela).title("Capital de Venezuela"));
    }
}