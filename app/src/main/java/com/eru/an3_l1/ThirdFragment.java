package com.eru.an3_l1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class ThirdFragment extends Fragment {
    private EditText et3;
    private Button btn3;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_third, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et3 = view.findViewById(R.id.et_3);
        btn3 = view.findViewById(R.id.btn_3);
        if (getArguments() != null) {
            String value = getArguments().getString("key1");
            et3.setText(value);
        }

        btn3.setOnClickListener(view1 -> {
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container1, new FirstFragment()).addToBackStack(null).commit();
        });
    }
}