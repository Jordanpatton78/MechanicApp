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
        Button transButton1;
        Button transButton2;
        final TextView transText1 = findViewById(R.id.transText1);
        final TextView transText2=findViewById(R.id.transText2);
        final String transResponse=getString(R.string.transResponse);
        transButton1= findViewById(R.id.transButton1);
        transButton2=findViewById(R.id.transButton2);

        transButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            transText1.setText(transResponse);
            }
        });
        transButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                transText2.setText(transResponse);
            }
                                        });
    }
}
