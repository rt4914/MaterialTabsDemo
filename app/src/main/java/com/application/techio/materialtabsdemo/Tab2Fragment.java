package com.application.techio.materialtabsdemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by demon on 7/24/2016.
 */
public class Tab2Fragment extends Fragment {

    public Tab2Fragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_tab2, container, false);

        TextView tvTwo = (TextView) v.findViewById(R.id.tvTwo);

        tvTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"You Clicked 2",Toast.LENGTH_SHORT).show();
            }
        });

        return v;
    }
}
