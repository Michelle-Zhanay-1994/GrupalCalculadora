package com.example.grupal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private EditText num1;
    private EditText num2;
    private TextView resultado;
    private Button suma;
    private Button resta;
    private Button mult;
    private Button div;
    private Button igual;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.num1);
        num1.setOnClickListener(this);
        num2 = (EditText) findViewById(R.id.num2);
        num2.setOnClickListener(this);
        resultado = (TextView) findViewById(R.id.resultado);
        resultado.setOnClickListener(this);
        suma = (Button) findViewById(R.id.suma);
        suma.setOnClickListener(this);
        resta = (Button) findViewById(R.id.resta);
        resta.setOnClickListener(this);
        mult = (Button) findViewById(R.id.multiplicacion);
        mult.setOnClickListener(this);
        div = (Button) findViewById(R.id.division);
        div.setOnClickListener(this);
        igual = (Button) findViewById(R.id.igual);
        igual.setOnClickListener(this);

    }
public void onClick(View view){

    double n1 = Double.valueOf(num1.getText().toString());
    double n2 = Double.valueOf(num2.getText().toString());
    if(view == suma){
    double r = n1+n2;
    String res= String.valueOf(r);
    resultado.setText(res);
    }
    if(view == resta){
        double r = n1-n2;
        String res= String.valueOf(r);
        resultado.setText(res);
    }
    if(view == mult){
        double r = n1*n2;
        String res= String.valueOf(r);
        resultado.setText(res);
    }
    if(view == div){
        double r = n1/n2;
        String res= String.valueOf(r);
        resultado.setText(res);
    }
    if(view == igual){
        num1.setText("");
        num2.setText("");
    }
}




}