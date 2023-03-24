package edu.udayton.daytonflyersguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Flyers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyers);
        Button btnFlyers2 = (Button)findViewById(R.id.btnFeeText);
        Button btnFLyers3 = (Button)findViewById(R.id.btnFeeText2);

        View.OnClickListener btnFlyers2Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent flyers2Intent = new Intent(Flyers.this, Flyers2.class);
                startActivity(flyers2Intent);

            }
        };

        View.OnClickListener btnFlyers3Listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent flyers3Intent = new Intent(Flyers.this, universityWebsite.class);
                startActivity(flyers3Intent);

            }
        };

        btnFlyers2.setOnClickListener(btnFlyers2Listener);
        btnFLyers3.setOnClickListener(btnFlyers3Listener);
    }
}