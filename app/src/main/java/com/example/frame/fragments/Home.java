package com.example.frame.fragments;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.os.Bundle;

import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.frame.R;

import java.util.ArrayList;
import java.util.List;

public class Home extends Fragment {
    private final Handler handler = new Handler(Looper.getMainLooper());

    public Home() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        ImageSlider imageSlider = view.findViewById(R.id.imageSlider);
        TextView textView1 = view.findViewById(R.id.textview1);
        TextView textView2 = view.findViewById(R.id.textview2);
        Button button=view.findViewById(R.id.readmore);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();

                // Create an instance of the Aboutus fragment
                Aboutus aboutusFragment = new Aboutus();

                // Replace the current fragment with the Aboutus fragment
                fragmentManager.beginTransaction()
                        .replace(R.id.framelayout, aboutusFragment) // R.id.fragment_container is the ID of the container where you host your fragments
                        .addToBackStack(null)
                        .commit();
            }
        });
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
            }, i * 300);
        }
        ImageView imageView=view.findViewById(R.id.imageview);
        imageView.setColorFilter(ContextCompat.getColor(requireContext(),R.color.voliet1), PorterDuff.Mode.MULTIPLY);
        List<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.one, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.two, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.three, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.four, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.five, ScaleTypes.CENTER_INSIDE));
        imageList.add(new SlideModel(R.drawable.six, ScaleTypes.CENTER_INSIDE));


        imageSlider.setImageList(imageList);

        return view;
    }




}


