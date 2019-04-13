package com.e.taxcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TaxActivity extends AppCompatActivity {

    private TextView tvTaxAmount;
    private Button btnCalculate;
    private EditText etSalary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tax);

        tvTaxAmount = findViewById(R.id.tvTaxAmount);
        btnCalculate = findViewById(R.id.btnCalculate);
        etSalary = findViewById(R.id.etSalary);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId()==R.id.btnCalculate){
                    tvTaxAmount.setText(Double.toString(new TaxCalculator(Double.parseDouble(etSalary.getText().toString())).calculate()));
                }
            }
        });
    }
}
