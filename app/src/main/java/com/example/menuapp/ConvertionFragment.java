package com.example.menuapp;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class ConvertionFragment extends Fragment {

    private EditText txtEuro;
    private Button btnConv;
    private TextView resultat;

    public ConvertionFragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    private void setContentView(int activity_main) {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_conversion, container, false);

        txtEuro = view.findViewById(R.id.texteuro);
        btnConv = view.findViewById(R.id.buttonconv);
        resultat = view.findViewById(R.id.textconv);
        btnConv.setOnClickListener(v -> {
            float euro = Float.parseFloat(txtEuro.getText().toString());
            float mad = euro * 11.18f;
            resultat.setText(String.valueOf(mad) + "MAD");
        });
        return view;
    }
}