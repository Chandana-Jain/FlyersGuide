package edu.udayton.daytonflyersguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.text.DecimalFormat;

public class Flyers2 extends AppCompatActivity {

    private final double FEE_PER_SEMESTER  = 3000;
    private int numberOfSemester;
    private double totalFeeCost;
    private String studentChoice;
    private int accomodation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flyers2);

        Button btnCost = (Button) findViewById(R.id.btnCost);

        assert btnCost!=null;
        View.OnClickListener btnSemFeeListener = new View.OnClickListener() {

            EditText txtSemester = (EditText)findViewById(R.id.txtSemester);
            Spinner txtGroup = (Spinner)findViewById(R.id.txtGroup);
            TextView txtResult = (TextView) findViewById(R.id.txtResult);

            @Override
            public void onClick(View v) {
                Editable Input  = txtSemester.getText();
                String InputStr = Input.toString();

                try{

                    numberOfSemester = Integer.parseInt(InputStr);
                    studentChoice = txtGroup.getSelectedItem().toString();
                    DecimalFormat currency = new DecimalFormat("$######");

                    if(studentChoice.contains("With Accomodation")){
                        accomodation = 2000;
                        totalFeeCost = accomodation + (FEE_PER_SEMESTER * numberOfSemester);
                        String OutputStr = "Fee for "+ studentChoice + " is " + currency.format(totalFeeCost);
                        txtResult.setText(OutputStr);

                    }

                    if(studentChoice.contains("Without Accomodation")){
                        totalFeeCost = (FEE_PER_SEMESTER * numberOfSemester);
                        String OutputStr = "Fee for "+ studentChoice + " is " + currency.format(totalFeeCost);
                        txtResult.setText(OutputStr);
                    }

                } catch(Exception ex){
                    Log.e(ex.getMessage(),ex.toString());
                }


            }
        };

        btnCost.setOnClickListener(btnSemFeeListener);

    } // end of OnCreate method
}// end of flyers2 class