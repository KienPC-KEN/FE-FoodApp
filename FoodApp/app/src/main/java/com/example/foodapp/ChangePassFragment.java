package com.example.foodapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.fragment.app.Fragment;

public class ChangePassFragment extends Fragment {
    private Button btnResert, btnSave;
    private EditText passOld, passNew, retypePass;
    private ImageView back;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_change_password, container, false);
        passOld = view.findViewById(R.id.pass_old);
        passNew = view.findViewById(R.id.pass_new);
        retypePass = view.findViewById(R.id.retype_passnew);
        btnResert = view.findViewById(R.id.btn_resert);
        btnSave = view.findViewById(R.id.btn_save);
        back = view.findViewById(R.id.back_w);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        btnResert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                passOld.setText("");
                passNew.setText("");
                retypePass.setText("");
            }
        });

        return view;
    }
}
