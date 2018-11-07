package com.example.dlei.tit;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class Fragmento_Principal extends Fragment {


    public Fragmento_Principal() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v = inflater.inflate(R.layout.fragment_fragmento__principal, container, false);
        Button b = (Button) v.findViewById(R.id.btn_Solicitarcoleta);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it;
                it = new Intent(getActivity(), Qrcode.class);
                startActivity(it);
            }
        });
        return v;
    }

    public interface OnFragmentInteractionListener {
    }
}
