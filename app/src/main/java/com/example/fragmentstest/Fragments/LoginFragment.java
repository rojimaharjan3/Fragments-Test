package com.example.fragmentstest.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentstest.R;
import com.example.fragmentstest.SecondActivity;


public class LoginFragment extends Fragment {



    public LoginFragment() {
        // Required empty public constructor
    }

    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        //mainactivity maa jasari onCreate bhitra jati ni kaam garxau , tei same aba eta garna sakneyy bhayau

        textView= view.findViewById(R.id.login_Text_View);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext() , SecondActivity.class);
                startActivity(intent);
            }
        });


        return view;
    }
}