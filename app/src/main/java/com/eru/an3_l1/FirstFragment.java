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

public class FirstFragment extends Fragment {
    private EditText et1;
    private Button btn_click;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        et1 = view.findViewById(R.id.et_1);
        btn_click = view.findViewById(R.id.btn_click);

        btn_click.setOnClickListener(view1 -> {
            Bundle bundle = new Bundle();
            bundle.putString("key", et1.getText().toString());
            SecondFragment fragment2 = new SecondFragment();
            fragment2.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.container1, fragment2).addToBackStack(null).commit();
        });
    }


}