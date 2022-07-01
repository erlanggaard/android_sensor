package com.erlanggaard.sensor_10121802.ui.slideshow;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.erlanggaard.sensor_10121802.R;
import com.erlanggaard.sensor_10121802.databinding.FragmentLokasiUserBinding;
//import com.erlanggaard.sensor_10121802.databinding.FragmentSlideshowBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

// Nama     : Erlangga Ardiansyah R
// NIM      : 10121802
// Kelas    : IF-3

public class SlideshowFragment extends Fragment implements OnMapReadyCallback {

    private FragmentLokasiUserBinding binding;
    GoogleMap map;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        SlideshowViewModel slideshowViewModel =
                new ViewModelProvider(this).get(SlideshowViewModel.class);

        binding = FragmentLokasiUserBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle saveInstanceState){
        super.onViewCreated(view, saveInstanceState);
        SupportMapFragment mapFragment = (SupportMapFragment)getChildFragmentManager().findFragmentById(R.id.map1);
        mapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap){
        map = googleMap;
        LatLng lokasi = new LatLng(-6.927165903441951, 107.63640978338258);
        map.addMarker(new MarkerOptions().position(lokasi).title("Current Location"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(lokasi, 17));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}