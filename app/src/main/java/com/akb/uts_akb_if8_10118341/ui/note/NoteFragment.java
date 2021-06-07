package com.akb.uts_akb_if8_10118341.ui.note;

import android.content.ContentValues;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.akb.uts_akb_if8_10118341.R;
import com.akb.uts_akb_if8_10118341.databinding.FragmentNoteBinding;

public class NoteFragment extends Fragment {


    DBHandler handler;
    EditText NamaNote, TanggalNote,Keterangan;
    Button TambahData;
    CheckBox keepData;

    private FragmentNoteBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {


        binding = FragmentNoteBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        return root;
    }
    /**
     *Nama   : Muhammad Rijal Sulaeman
     *kelas  : IF-8
     *NIM    : 10118341
     *Tanggal Pengerjaan : 6 Juni 2021
     */
}
