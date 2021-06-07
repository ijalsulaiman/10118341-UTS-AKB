package com.akb.uts_akb_if8_10118341.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.akb.uts_akb_if8_10118341.R;
import com.akb.uts_akb_if8_10118341.databinding.FragmentHomeBinding;

public class HomeFragment extends Fragment {


    private FragmentHomeBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }
}
/**
 *Nama   : Muhammad Rijal Sulaeman
 *kelas  : IF-8
 *NIM    : 10118341
 *Tanggal Pengerjaan : 6 Juni 2021
 */