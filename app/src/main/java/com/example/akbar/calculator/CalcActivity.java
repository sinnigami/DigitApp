package com.example.akbar.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class CalcActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
    }

    public void sumClick(View v) {
        EditText digit1 = (EditText) findViewById(R.id.editText);
        EditText digit2 = (EditText) findViewById(R.id.editText2);
        Long dig1 = Long.valueOf(digit1.getText().toString());
        Long dig2 = Long.valueOf(digit2.getText().toString());
        Long resultSum = dig1 + dig2;
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText("Результат " + resultSum);
    }

    public void minusClick(View v) {
        EditText digit1 = (EditText) findViewById(R.id.editText);
        EditText digit2 = (EditText) findViewById(R.id.editText2);
        Long dig1 = Long.valueOf(digit1.getText().toString());
        Long dig2 = Long.valueOf(digit2.getText().toString());
        Long resultMinus = dig1 - dig2;
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText("Результат " + resultMinus); }

    public void umnojClick(View v) {
        EditText digit1 = (EditText) findViewById(R.id.editText);
        EditText digit2 = (EditText) findViewById(R.id.editText2);
        Long dig1 = Long.valueOf(digit1.getText().toString());
        Long dig2 = Long.valueOf(digit2.getText().toString());
        Long resultUmnoj = dig1 * dig2;
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText("Результат " + resultUmnoj);  }

    public void delClick(View v) {
        EditText digit1 = (EditText) findViewById(R.id.editText);
        EditText digit2 = (EditText) findViewById(R.id.editText2);
        Double dig1 = Double.valueOf(digit1.getText().toString());
        Double dig2 = Double.valueOf(digit2.getText().toString());
        Double resultDel = dig1 / dig2;
        TextView t = (TextView) findViewById(R.id.textView2);
        t.setText("Результат " + resultDel);  }
}
