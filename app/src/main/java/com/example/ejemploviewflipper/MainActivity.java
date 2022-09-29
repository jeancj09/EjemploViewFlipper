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
Button btnmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnmap=findViewById(R.id.btnmap);
        viewFlipper=findViewById(R.id.view_flipper);
        TextView textView=new TextView(this);
        textView.setText("Panamá");
        textView.setGravity(Gravity.CENTER);

        viewFlipper.addView(textView);
        viewFlipper.setFlipInterval(2000);
        viewFlipper.startFlipping();
btnmap.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
Intent intent=new Intent(getApplicationContext(),Mapa.class);
startActivity(intent);
    }
});
    }
    public void previousView(View v){
        viewFlipper.setInAnimation(this, R.anim.slide_in_right);
        viewFlipper.setInAnimation(this, R.anim.slide_out_left);
viewFlipper.showPrevious();
    }
    public void nextView(View v){
        viewFlipper.setInAnimation(this, android.R.anim.slide_in_left);
        viewFlipper.setInAnimation(this, android.R.anim.slide_out_right);
        viewFlipper.showNext();

    }
}