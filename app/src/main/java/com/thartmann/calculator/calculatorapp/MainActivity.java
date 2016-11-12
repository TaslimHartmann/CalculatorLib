package com.thartmann.calculator.calculatorapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.thartmann.com.calculatorlibrary.Calculator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Calculator calculator = new Calculator();
        calculator.doAdd(1, 2);
    }
}
