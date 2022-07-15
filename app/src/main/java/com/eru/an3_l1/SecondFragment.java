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


public class SecondFragment extends Fragment {
    private EditText et2;
    private Button btnBack;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        et2 = view.findViewById(R.id.et_2);
        btnBack = view.findViewById(R.id.btn_back);
        if (getArguments() != null) {
            String value = getArguments().getString("key");
            et2.setText(value);
        }

        btnBack.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putString("key1", et2.getText().toString());
            ThirdFragment thirdFragment = new ThirdFragment();
            thirdFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container1, thirdFragment).addToBackStack(null).commit();
        });
    }
}