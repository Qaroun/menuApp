package com.example.menuapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;


public class CalculatriceFragment extends Fragment {

    EditText et1,et2,et3;
    Button btn1,btn2,btn3,btn4,btn5;



    public CalculatriceFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_calculatrice, container, false);

        et1 = view.findViewById(R.id.et1);
        et2 = view.findViewById(R.id.et2);
        et3 = view.findViewById(R.id.et3);
        btn1=view.findViewById(R.id.btn1);
        btn2=view.findViewById(R.id.btn2);
        btn3=view.findViewById(R.id.btn3);
        btn4=view.findViewById(R.id.btn4);
        btn5=view.findViewById(R.id.btn5);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double .parseDouble(et1.getText().toString());
                double n2 = Double .parseDouble(et2.getText().toString());
                double n3;
                n3 = n1+n2;
                et3.setText(String.valueOf(n3));
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double .parseDouble(et1.getText().toString());
                double n2 = Double .parseDouble(et2.getText().toString());
                double n3;
                n3=n1-n2;
                et3.setText(String.valueOf(n3));
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double .parseDouble(et1.getText().toString());
                double n2 = Double .parseDouble(et2.getText().toString());
                double n3;
                n3=n1*n2;
                et3.setText(String.valueOf(n3));
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1 = Double .parseDouble(et1.getText().toString());
                double n2 = Double .parseDouble(et2.getText().toString());
                double n3;
                n3=n1/n2;
                et3.setText(String.valueOf(n3));
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.getText().clear();
                et2.getText().clear();
                et3.getText().clear();
            }
        });

        return view;
    }
}