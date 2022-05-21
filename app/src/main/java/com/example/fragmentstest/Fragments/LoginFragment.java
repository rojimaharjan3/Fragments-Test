package com.example.fragmentstest.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.fragmentstest.R;


public class LoginFragment extends Fragment {



    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        //mainactivity maa jasari onCreate bhitra jati ni kaam garxau , tei same aba eta garna sakneyy bhayau



        return view;
    }
}