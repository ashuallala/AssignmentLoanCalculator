package com.example.assignmentloancalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.text.DecimalFormat;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    double amtFive;
    double amtTen;
    double amtFifteen;
    double amtTwenty;
    double amtTwentyFive;
    double amtThirty;
    DecimalFormat df = new DecimalFormat("0.00");

    public void result(View view) {
        //Enter the loan amount and interest rate
        EditText LoanAmount = (EditText) findViewById(R.id.loan_amount);
        double loanAmt = Double.parseDouble(LoanAmount.getText().toString());

        EditText LoanInterest = (EditText) findViewById(R.id.loan_interest);
        double intRate = Double.parseDouble(LoanInterest.getText().toString());


        //Calculation
        amtFive = loanAmt * (1 + ((float) intRate / 100) * 5);
        amtTen = loanAmt * (1 + ((float) intRate / 100) * 10);
        amtFifteen = loanAmt * (1 + ((float) intRate / 100) * 15);
        amtTwenty = loanAmt * (1 + ((float) intRate / 100) * 20);
        amtTwentyFive = loanAmt * (1 + ((float) intRate / 100) * 25);
        amtThirty = loanAmt * (1 + ((float) intRate / 100) * 30);

        //Display the output
        TextView emiTextView1 = (TextView) findViewById(R.id.textView1);
        emiTextView1.setText("The EMI for 5 years is "+df.format((amtFive / 60)));

        TextView emiTextView2 = (TextView) findViewById(R.id.textView2);
        emiTextView2.setText("The EMI for 10 years is "+df.format((amtTen / 120)));

        TextView emiTextView3 = (TextView) findViewById(R.id.textView3);
        emiTextView3.setText("The EMI for 15 years is "+df.format((amtFifteen / 180)));

        TextView emiTextView4 = (TextView) findViewById(R.id.textView4);
        emiTextView4.setText("The EMI for 20 years is "+df.format((amtTwenty / 240)));

        TextView emiTextView5 = (TextView) findViewById(R.id.textView5);
        emiTextView5.setText("The EMI for 25 years is "+df.format((amtTwentyFive / 300)));

        TextView emiTextView6 = (TextView) findViewById(R.id.textView6);
        emiTextView6.setText("The EMI for 30 years is "+df.format((amtTwentyFive / 360)));



    }
}
