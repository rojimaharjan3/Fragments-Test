package com.example.fragmentstest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragmentstest.Fragments.LoginFragment;
import com.example.fragmentstest.Fragments.SignupFragment;

public class MainActivity extends AppCompatActivity {
    Button loginButton , signupButton;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton=findViewById(R.id.login_button);
        signupButton = findViewById(R.id.signup_button);
        linearLayout = findViewById(R.id.linear_layout);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LoginFragment loginFragment = new LoginFragment(); //loginFragment namak object banayau hamle
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                //replace linear_layout with login fragment
                //Use replace() to replace an existing fragment in a container with an instance of a new fragment class that you provide.
                transaction.replace(R.id.linear_layout , loginFragment);
                transaction.commit();
            }
        });

        signupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SignupFragment signupFragment = new SignupFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linear_layout , signupFragment);
                transaction.commit();
            }
        });
    }
}