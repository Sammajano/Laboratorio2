package com.example.virus.laboratorio2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


     Button suma1a;
     Button suma2a;
     Button suma3a;
    Button suma1b;
    Button suma2b;
    Button suma3b;
    Button reset;
    TextView marcadorA;
    TextView marcadorB;
    int total=0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         suma1a = findViewById(R.id.suma1a);
         suma2a = findViewById(R.id.suma2a);
         suma3a = findViewById(R.id.suma3a);
         suma1b = findViewById(R.id.suma1b);
        suma2b = findViewById(R.id.suma2b);
        suma3b = findViewById(R.id.suma3b);
        marcadorA= findViewById(R.id.marcadorA);
        marcadorB=findViewById(R.id.marcadorB);



         suma1a.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View v) {
                 total=(total+1);
                marcadorA.setText(total);


             }
         });

        suma2a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total=(total+2);
                marcadorA.setText(total);
            }
        });
        suma3a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorA.setText(total+3);
            }
        });
        suma1b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorB.setText(total+1);
            }
        });

        suma2b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorB.setText(total+2);
            }
        });
        suma3b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                marcadorB.setText(total+3);
            }
        });

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total=0;
                marcadorA.setText(total);
                marcadorB.setText(total);
            }
        });
    }


}
