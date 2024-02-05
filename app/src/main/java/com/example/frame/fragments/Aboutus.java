package com.example.frame.fragments;

import android.graphics.PorterDuff;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.frame.R;


public class Aboutus extends Fragment {
    private final Handler handler = new Handler(Looper.getMainLooper());


    public Aboutus() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_aboutus, container, false);
        TextView textView1 = view.findViewById(R.id.textview1);
        TextView textView2 = view.findViewById(R.id.textview2);
        TextView textView3 = view.findViewById(R.id.textview3);
        TextView textView4 = view.findViewById(R.id.textview4);
        for (int i = 1; i <= 99; i++) {

            int finalI = i;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView4.setText(Integer.toString(finalI)+" %");
                    // textView2.setText(Integer.toString(finalI)+" +");

                }
            }, i * 100);
        }
        for (int i = 1; i <= 10; i++) {

            int finalI = i;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView3.setText(Integer.toString(finalI)+" +");
                    // textView2.setText(Integer.toString(finalI)+" +");

                }
            }, i * 200);
        }

        for (int i = 1; i <= 20; i++) {

            int finalI = i;
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    textView1.setText(Integer.toString(finalI)+" +");
                    textView2.setText(Integer.toString(finalI)+" +");

                }
            }, i * 250);
        }
        return view;

    }
}