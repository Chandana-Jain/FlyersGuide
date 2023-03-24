package edu.udayton.daytonflyersguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnFlyers = (Button) findViewById(R.id.btnChapelView);
//        Button btnFlyers2 = (Button)findViewById(R.id.btnFeeText);
        //add event handler for button

        View.OnClickListener btnFlyersListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Create Intent

                Intent flyersIntent = new Intent(MainActivity.this, Flyers.class);
                startActivity(flyersIntent);

            }//end of OnClickListener
        };

        btnFlyers.setOnClickListener(btnFlyersListener);


    } // end of OnCreate Method
} // end of MainActivity class