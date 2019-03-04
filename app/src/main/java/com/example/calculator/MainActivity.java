package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnDiv, btnMult, btnAdd, btnSub,
            btnClear, btnEquals;
    private TextView tv1, tv2;
    private final char ADD = '+';
    private final char SUB = '-';
    private final char MULT = '*';
    private final char DIV = '/';
    private final char EQU = '0';
    private double val1 = Double.NaN;
    private double val2;
    private char action;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupView();

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "1");

            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "2");

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "3");

            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "4");

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "5");

            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "6");

            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "7");

            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "8");

            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText(tv1.getText().toString() + "9");

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = ADD;
                tv2.setText(String.valueOf(val1) + '+');
                tv1.setText(null);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = SUB;
                tv2.setText(String.valueOf(val1) + '-');
                tv1.setText(null);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = DIV;
                tv2.setText(String.valueOf(val1) + '/');
                tv1.setText(null);
            }
        });

        btnMult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = MULT;
                tv2.setText(String.valueOf(val1) + '*');
                tv1.setText(null);
            }
        });

        btnEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                action = EQU;
                tv2.setText(tv2.getText().toString() + String.valueOf(val2) + '=' + String.valueOf(val1));
                tv1.setText(null);
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (tv1.getText().length() > 0) {
                    CharSequence name = tv1.getText().toString();
                    tv1.setText(name.subSequence(0, name.length() - 1));
                } else {
                    val1 = Double.NaN;
                    val2 = Double.NaN;
                    tv1.setText(null);
                    tv2.setText(null);
                }

            }
        });
    }

    private void setupView() {
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnDiv = findViewById(R.id.btnDiv);
        btnMult = findViewById(R.id.btnMult);
        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnEquals = findViewById(R.id.btnEquals);
        btnClear = findViewById(R.id.btnClear);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);

    }

    private void compute() {
        //To check if val1 is a number or not
        if (!Double.isNaN(val1)) {
            val2 = Double.parseDouble(tv1.getText().toString());

            switch (action) {
                case (ADD):
                    val1 = val1 + val2;
                    break;
                case (DIV):
                    val1 = val1 / val2;
                    break;
                case (SUB):
                    val1 = val1 - val2;
                    break;
                case (MULT):
                    val1 = val1 * val2;
                    break;
                case (EQU):
                    break;

            }
        } else {
            val1 = Double.parseDouble(tv1.getText().toString());
        }

    }
}

