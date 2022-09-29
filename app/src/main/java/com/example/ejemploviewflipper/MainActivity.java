package com.example.ejemploviewflipper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity {
    private ViewFlipper viewFlipper;
    public Button btAnterior, btSiguiente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewFlipper = findViewById(R.id.view_flipper);
        btAnterior = findViewById(R.id.bttAnterior);
        btSiguiente = findViewById(R.id.bttSiguiente);

        btAnterior.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_in_right);
                viewFlipper.setInAnimation(getApplicationContext(), R.anim.slide_out_left);
                viewFlipper.showPrevious();
            }
        });

        btSiguiente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                viewFlipper.setInAnimation(getApplicationContext(), android.R.anim.slide_in_left);
                viewFlipper.setInAnimation(getApplicationContext(), android.R.anim.slide_out_right);
                viewFlipper.showNext();

            }
        });

    }
}
