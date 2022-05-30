package com.example.salary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView tvDA,tvHRA,tvNetSalary;
    private EditText etSalary;
    private Button btnCalc,btnClc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tvDA=findViewById(R.id.MainActivity_tv_DA);
        tvHRA=findViewById(R.id.MainActivity_tv_HRA);
        tvNetSalary=findViewById(R.id.MainActivity_tv_net_salary);
        etSalary=findViewById(R.id.MainActivity_et_salary);
        btnCalc=findViewById(R.id.MainActivity_btn_calc);
        btnClc=findViewById(R.id.MainActivity_btn_clc);


        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double basic,DA,HRA,netSalary;
                basic=Double.parseDouble(etSalary.getText().toString());
                DA=(basic*25)/100;
                HRA=(basic*16)/100;
                netSalary=basic+DA+HRA;
                tvDA.setText(String.valueOf(DA));
                tvHRA.setText(String.valueOf(HRA));
                tvNetSalary.setText(String.valueOf(netSalary));
                Toast.makeText(MainActivity.this, "Bas Calculate hi hoga, mile ga nahi", Toast.LENGTH_LONG).show();
            }
        });

        btnClc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etSalary.setText(String.valueOf(""));
                tvDA.setText(String.valueOf(""));
                tvHRA.setText(String.valueOf(""));
                tvNetSalary.setText(String.valueOf(""));
            }
        });
    }
}