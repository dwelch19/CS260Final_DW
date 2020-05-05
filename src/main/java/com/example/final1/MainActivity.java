package com.example.final1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView iv;
    Button plusButton, minusButton;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    private void init() {

        iv = findViewById(R.id.imageView);

        plusButton = findViewById(R.id.button);
        plusButton.setOnClickListener( this );

        minusButton = findViewById(R.id.button2);
        minusButton.setOnClickListener( this );

        count = 7;
    }

    @Override
    public void onClick(View v) {

        if( v.getId() == R.id.button2 ) {

            if (count == 0) {
                count = 1;
                iv.setImageResource(R.drawable.ic_battery_20_black_24dp);
            }
            else if (count == 1) {
                count = 2;
                iv.setImageResource(R.drawable.ic_battery_30_black_24dp);
            }
            else if (count == 2) {
                count = 3 ;
                iv.setImageResource(R.drawable.ic_battery_50_black_24dp);
            }
            else if (count == 3) {
                count = 4;
                iv.setImageResource(R.drawable.ic_battery_60_black_24dp);
            }
            else if (count == 4) {
                count = 5;
                iv.setImageResource(R.drawable.ic_battery_80_black_24dp);
            }
            else if (count == 5) {
                count = 6;
                iv.setImageResource(R.drawable.ic_battery_90_black_24dp);
            }
            else {
                count = 7;
                iv.setImageResource(R.drawable.ic_battery_full_black_24dp);
            }
        }

       else {
            if (count == 7) {
                count = 6;
                iv.setImageResource(R.drawable.ic_battery_90_black_24dp);
            }
            else if (count == 6) {
                count = 5;
                iv.setImageResource(R.drawable.ic_battery_80_black_24dp);
            }
            else if (count == 5) {
                count = 4;
                iv.setImageResource(R.drawable.ic_battery_60_black_24dp);
            }
            else if (count == 4) {
                count = 3;
                iv.setImageResource(R.drawable.ic_battery_50_black_24dp);
            }
            else if (count == 3) {
                count = 2;
                iv.setImageResource(R.drawable.ic_battery_30_black_24dp);
            }
            else if (count == 2) {
                count = 1;
                iv.setImageResource(R.drawable.ic_battery_20_black_24dp);
            }
            else {
                count = 0;
                iv.setImageResource(R.drawable.ic_battery_alert_black_24dp);
            }
        }

    }
}