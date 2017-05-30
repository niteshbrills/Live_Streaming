package com.brill.nitesh.myapplication.Fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.brill.nitesh.myapplication.R;

/**
 * Created by Nitesh Android on 29-05-2017.
 */

class Fragment2 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment2, container, false);
        TextView textview = (TextView) rootView.findViewById(R.id.textView);
        textview.setText("Fragment2");
        return rootView;
    }
}
