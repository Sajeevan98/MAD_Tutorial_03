package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText etNum_1,etNum_2;
    String no1,no2;
    int num1,num2;
    TextView numResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        etNum_1 = findViewById(R.id.etNum1);
        etNum_2 = findViewById(R.id.etNum2);
        numResult = findViewById(R.id.tvResult);

        Intent intent = getIntent();

        no1 = intent.getStringExtra("number1");
        no2 = intent.getStringExtra("number2");

        etNum_1.setText(no1);
        etNum_2.setText(no2);

        num1 = Integer.parseInt(no1);
        num2 = Integer.parseInt(no2);
    }

    public void add(View view){
        numResult.setText(num1 + " + " + num2 + " = " + (num1+num2));
    }
    public void substract(View view){
        numResult.setText(num1 + " - " + num2 + " = " + (num1-num2));
    }
    public void multiply(View view){
        numResult.setText(num1 + " * " + num2 + " = " + (num1*num2));
    }
    public void devide(View view){
        numResult.setText(num1 + " / " + num2 + " = " + (num1/num2));
    }
}