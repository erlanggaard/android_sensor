package com.erlanggaard.sensor_10121802.ui.gallery;

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
//import com.erlanggaard.sensor_10121802.databinding.FragmentGalleryBinding;
import com.erlanggaard.sensor_10121802.databinding.FragmentLokasiMakanBinding;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

// Nama     : Erlangga Ardiansyah R
// NIM      : 10121802
// Kelas    : IF-3

public class GalleryFragment extends Fragment implements OnMapReadyCallback {

    private FragmentLokasiMakanBinding binding;
    GoogleMap map;
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        GalleryViewModel galleryViewModel =
                new ViewModelProvider(this).get(GalleryViewModel.class);

        binding = FragmentLokasiMakanBinding.inflate(inflater, container, false);
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
        LatLng ricis = new LatLng(-6.9264430648033, 107.63429081710449);
        LatLng martabak = new LatLng(-6.925251963721123, 107.63187698849784);
        LatLng kue = new LatLng(-6.927464686158338, 107.63511706445904);
        LatLng koreanfood = new LatLng(-6.927101555656352, 107.63296457951041);
        LatLng kantin = new LatLng(-6.925903449752388, 107.6344996897568);
        map.addMarker(new MarkerOptions().position(ricis).title("Recheese Factory"));
        map.addMarker(new MarkerOptions().position(martabak).title("Martabak Boga Sari Rasa"));
        map.addMarker(new MarkerOptions().position(kue).title("Toko Kue"));
        map.addMarker(new MarkerOptions().position(koreanfood).title("Korean Food"));
        map.addMarker(new MarkerOptions().position(kantin).title("Kantin"));
        map.moveCamera(CameraUpdateFactory.newLatLngZoom(ricis, 16));
        map.moveCamera(CameraUpdateFactory.newLatLng(martabak));
        map.moveCamera(CameraUpdateFactory.newLatLng(kue));
        map.moveCamera(CameraUpdateFactory.newLatLng(koreanfood));
        map.moveCamera(CameraUpdateFactory.newLatLng(kantin));
    }

    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}