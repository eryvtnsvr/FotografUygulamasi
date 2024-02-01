package com.example.butunleme.ui.cikisyap;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.butunleme.IlkEkran;
import com.example.butunleme.R;
import com.example.butunleme.databinding.FragmentCikisyapBinding;
import com.google.firebase.auth.FirebaseAuth;


public class CikisyapFragment extends Fragment {

    private FragmentCikisyapBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentCikisyapBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button cik = binding.cik;
        cik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseAuth.getInstance().signOut();

                startActivity(new Intent(getActivity(), IlkEkran.class));
                getActivity().finish();
            }
        });

        return root;



    }
}