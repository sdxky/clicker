package com.example.clicker;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class CounterFragment extends Fragment {


    private int counter = 0;
    private TextView textViewCounter;


    public CounterFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_counter, container, false);
        textViewCounter = view.findViewById(R.id.tv_counter);
        Button buttonIncrement = view.findViewById(R.id.btn_increment);
        Button buttonDecrement = view.findViewById(R.id.btn_decrement);

        buttonIncrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter++;
                textViewCounter.setText(String.valueOf(counter));
            }

        });

        buttonDecrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter--;
                textViewCounter.setText(String.valueOf(counter));
            }
        });
        return view;
    }
}
