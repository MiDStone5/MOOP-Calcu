package com.example.tampi.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button plus;
    private Button mines;
    private Button times;
    private Button devide;
    private Button eql;
    private Button bersih;
    private TextView texttulis;
    private TextView textntar;
    private final char penjumlahan = '+';
    private final char pengurangan = '-';
    private final char perkalian = '*';
    private final char pembagian = '/';
    private final char equ = '0';
    private double val1 = Double.NaN;
    private double val2;
    private char ACTION;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setingan();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "0");
            }
        });
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                texttulis.setText(texttulis.getText().toString() + "9");
            }
        });
        plus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                compute();
                ACTION = penjumlahan;
                textntar.setText(String.valueOf(val1) + "+");
                texttulis.setText(null);
            }
        });
        mines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = pengurangan;
                textntar.setText(String.valueOf(val1) + "-");
                texttulis.setText(null);
            }
        });
        times.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = perkalian;
                textntar.setText(String.valueOf(val1) + "*");
                texttulis.setText(null);
            }
        });
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = pembagian;
                textntar.setText(String.valueOf(val1) + "/");
                texttulis.setText(null);
            }
        });
        eql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                compute();
                ACTION = equ;
                textntar.setText(textntar.getText().toString() + String.valueOf(val2) + "=" + String.valueOf(val1));
                texttulis.setText(null);
            }
        });
        bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (texttulis.getText().length() > 0){
                    CharSequence name = texttulis.getText().toString();
                    texttulis.setText(name.subSequence(0, name.length()-1));
                }
                else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    texttulis.setText(null);
                    textntar.setText(null);
                }
            }
        });

    }

    private void setingan(){
        one = (Button)findViewById(R.id.no1);
        two = (Button)findViewById(R.id.no2);
        three = (Button)findViewById(R.id.no3);
        four = (Button)findViewById(R.id.no4);
        five = (Button)findViewById(R.id.no5);
        six = (Button)findViewById(R.id.no6);
        seven = (Button)findViewById(R.id.no7);
        eight = (Button)findViewById(R.id.no8);
        nine = (Button)findViewById(R.id.no9);
        zero = (Button)findViewById(R.id.no0);
        plus = (Button)findViewById(R.id.plus);
        mines = (Button)findViewById(R.id.minus);
        times = (Button)findViewById(R.id.kali);
        devide = (Button)findViewById(R.id.bagi);
        eql = (Button)findViewById(R.id.equal);
        bersih = (Button)findViewById(R.id.clear);
        texttulis = (TextView)findViewById(R.id.texttuliss);
        textntar = (TextView)findViewById(R.id.textntarr);

    }

    private void compute(){
        if(!Double.isNaN(val1)){
            val2 = Double.parseDouble(texttulis.getText().toString());

            switch (ACTION){
                    case penjumlahan:
                    val1 = val1 + val2;
                    break;

                    case pengurangan:
                    val1 = val1 - val2;
                    break;

                    case perkalian:
                    val1 = val1 * val2;
                    break;

                    case pembagian:
                    val1 = val1 / val2;
                    break;

                    case equ:
                    break;
            }

        }
        else {
            val1 = Double.parseDouble(texttulis.getText().toString());
        }
    }

}
