package com.erlanggaard.sensor_10121802.ui.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.lifecycle.ViewModelProvider;
import androidx.viewpager.widget.ViewPager;

import com.erlanggaard.sensor_10121802.R;
import com.erlanggaard.sensor_10121802.VPAdapter;
import com.erlanggaard.sensor_10121802.databinding.FragmentInfoBinding;
import com.erlanggaard.sensor_10121802.databinding.FragmentProfileBinding;
import com.erlanggaard.sensor_10121802.fragment1;
import com.erlanggaard.sensor_10121802.fragment2;
import com.erlanggaard.sensor_10121802.fragment3;
import com.erlanggaard.sensor_10121802.ui.home.HomeViewModel;
import com.google.android.material.tabs.TabLayout;

// Nama     : Erlangga Ardiansyah R
// NIM      : 10121802
// Kelas    : IF-3

public class InfoFragment extends Fragment {

    private FragmentInfoBinding binding;

    private TabLayout tabLayout;
    private ViewPager viewPager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        InfoViewModel infoViewModel =
                new ViewModelProvider(this).get(InfoViewModel.class);

        binding = FragmentInfoBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}