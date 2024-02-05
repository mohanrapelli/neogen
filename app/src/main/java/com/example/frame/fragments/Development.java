package com.example.frame.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.frame.R;

public class Development extends Fragment {

    public Development() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_development, container, false);

        TextView textView=v.findViewById(R.id.topic);
        TextView textView1=v.findViewById(R.id.data);
        ImageView imageView=v.findViewById(R.id.arrowright);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (textView1.getVisibility() == View.GONE) {
                    textView1.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    textView.setTextColor(getResources().getColor(android.R.color.holo_purple)); // Reset text color to default or any other color
                    imageView.setImageResource(R.drawable.baseline_arrow_drop_up_24);
                } else {
                    textView1.setVisibility(View.GONE);
                    textView.setVisibility(View.VISIBLE);
                    textView.setTextColor(getResources().getColor(R.color.orange)); // Set the desired text color
                    imageView.setImageResource(R.drawable.baseline_arrow_right_24);
                }
            }
        });
        TextView nettext=v.findViewById(R.id.net);
        TextView netdata=v.findViewById(R.id.dotnet);
        ImageView arrowdot=v.findViewById(R.id.arrownet);
        arrowdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (netdata.getVisibility() == View.GONE) {
                    netdata.setVisibility(View.VISIBLE);
                    nettext.setVisibility(View.VISIBLE);
                    nettext.setTextColor(getResources().getColor(android.R.color.holo_purple)); // Reset text color to default or any other color
                    arrowdot.setImageResource(R.drawable.baseline_arrow_drop_up_24);
                } else {
                    netdata.setVisibility(View.GONE);
                    nettext.setVisibility(View.VISIBLE);
                    nettext.setTextColor(getResources().getColor(R.color.orange)); // Set the desired text color
                    arrowdot.setImageResource(R.drawable.baseline_arrow_right_24);
                }
            }
        });
        TextView networking=v.findViewById(R.id.networking);
        TextView networkingdata=v.findViewById(R.id.networkingdata);
        ImageView arrownetwork=v.findViewById(R.id.arrownetworking);
        arrownetwork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (networkingdata.getVisibility() == View.GONE) {
                    networkingdata.setVisibility(View.VISIBLE);
                    networking.setVisibility(View.VISIBLE);
                    networking.setTextColor(getResources().getColor(android.R.color.holo_purple)); // Reset text color to default or any other color
                    arrownetwork.setImageResource(R.drawable.baseline_arrow_drop_up_24);
                } else {
                    networkingdata.setVisibility(View.GONE);
                    networking.setVisibility(View.VISIBLE);
                    networking.setTextColor(getResources().getColor(R.color.orange)); // Set the desired text color
                    arrownetwork.setImageResource(R.drawable.baseline_arrow_right_24);
                }
            }
        });
        TextView awttext=v.findViewById(R.id.awt);
        TextView awtdata=v.findViewById(R.id.awtdata);
        ImageView awtimage=v.findViewById(R.id.arrowawt);
        awtimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (awtdata.getVisibility() == View.GONE) {
                    awtdata.setVisibility(View.VISIBLE);
                    awttext.setVisibility(View.VISIBLE);
                    awttext.setTextColor(getResources().getColor(android.R.color.holo_purple)); // Reset text color to default or any other color
                    awtimage.setImageResource(R.drawable.baseline_arrow_drop_up_24);
                } else {
                    awtdata.setVisibility(View.GONE);
                    awttext.setVisibility(View.VISIBLE);
                    awttext.setTextColor(getResources().getColor(R.color.orange)); // Set the desired text color
                    awtimage.setImageResource(R.drawable.baseline_arrow_right_24);
                }
            }
        });
        TextView azure=v.findViewById(R.id.azure);
        TextView azuredata=v.findViewById(R.id.azuredata);
        ImageView azureimg=v.findViewById(R.id.arrowazure);
        azureimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (azuredata.getVisibility() == View.GONE) {
                    azuredata.setVisibility(View.VISIBLE);
                    azure.setVisibility(View.VISIBLE);
                    azure.setTextColor(getResources().getColor(android.R.color.holo_purple)); // Reset text color to default or any other color
                    azureimg.setImageResource(R.drawable.baseline_arrow_drop_up_24);
                } else {
                    azuredata.setVisibility(View.GONE);
                    azure.setVisibility(View.VISIBLE);
                    azure.setTextColor(getResources().getColor(R.color.orange)); // Set the desired text color
                    azureimg.setImageResource(R.drawable.baseline_arrow_right_24);
                }
            }
        });
        TextView salesforce=v.findViewById(R.id.salesforce);
        TextView salesforcedata=v.findViewById(R.id.salesforcedata);
        ImageView salesforceimg=v.findViewById(R.id.arrowsalesforce);
        salesforceimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (salesforcedata.getVisibility() == View.GONE) {
                    salesforcedata.setVisibility(View.VISIBLE);
                    salesforce.setVisibility(View.VISIBLE);
                    salesforce.setTextColor(getResources().getColor(android.R.color.holo_purple)); // Reset text color to default or any other color
                    salesforceimg.setImageResource(R.drawable.baseline_arrow_drop_up_24);
                } else {
                    salesforcedata.setVisibility(View.GONE);
                    salesforce.setVisibility(View.VISIBLE);
                    salesforce.setTextColor(getResources().getColor(R.color.orange)); // Set the desired text color
                    salesforceimg.setImageResource(R.drawable.baseline_arrow_right_24);
                }
            }
        });
        TextView powerbi=v.findViewById(R.id.powerbi);
        TextView powerbidata=v.findViewById(R.id.powerbidata);
        ImageView powerbiimg=v.findViewById(R.id.arrowpowerbi);
        powerbiimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (powerbidata.getVisibility() == View.GONE) {
                    powerbidata.setVisibility(View.VISIBLE);
                    powerbi.setVisibility(View.VISIBLE);
                    powerbi.setTextColor(getResources().getColor(android.R.color.holo_purple)); // Reset text color to default or any other color
                    powerbiimg.setImageResource(R.drawable.baseline_arrow_drop_up_24);
                } else {
                    powerbidata.setVisibility(View.GONE);
                    powerbi.setVisibility(View.VISIBLE);
                    powerbi.setTextColor(getResources().getColor(R.color.orange)); // Set the desired text color
                    powerbiimg.setImageResource(R.drawable.baseline_arrow_right_24);
                }
            }
        });
        TextView sap=v.findViewById(R.id.sap);
        TextView sapdata=v.findViewById(R.id.sapdata);
        ImageView sapimg=v.findViewById(R.id.arrowsap);
        sapimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (sapdata.getVisibility() == View.GONE) {
                    sapdata.setVisibility(View.VISIBLE);
                    sap.setVisibility(View.VISIBLE);
                    sap.setTextColor(getResources().getColor(android.R.color.holo_purple)); // Reset text color to default or any other color
                    sapimg.setImageResource(R.drawable.baseline_arrow_drop_up_24);
                } else {
                    sapdata.setVisibility(View.GONE);
                    sap.setVisibility(View.VISIBLE);
                    sap.setTextColor(getResources().getColor(R.color.orange)); // Set the desired text color
                    sapimg.setImageResource(R.drawable.baseline_arrow_right_24);
                }
            }
        });

        return v;
    }
}