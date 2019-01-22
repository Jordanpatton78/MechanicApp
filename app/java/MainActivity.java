package com.example.jordan.vehiclediagnosisapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button transButton1=findViewById(R.id.transButton1);
        Button transButton2=findViewById(R.id.transButton2);
        Button transButton3=findViewById(R.id.transButton3);
        Button transButton4=findViewById(R.id.transButton4);
        final TextView transText1=findViewById(R.id.transText1);
        final TextView transText2=findViewById(R.id.transText2);
        final TextView transText3=findViewById(R.id.transText3);
        final TextView transText4=findViewById(R.id.transText4);
        final String transResponse=getString(R.string.transResponse);

        transButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            transText1.setText(transResponse+" You probably have low transmission fluid, or your shift cables or clutch linkage need adjusting.");
            }
        });
        transButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transText2.setText(transResponse+" Your transmission fluid is low, leaking, or dirty.");
            }
                                        });
        transButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transText3.setText(transResponse+" You have low or dirty transmission fluid, or your transmission is worn down.");
            }
        });
        transButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transText4.setText(transResponse+" Hearing something that doesn't sound normal means your transmission needs to be checked.");
            }
        });


    }
}
