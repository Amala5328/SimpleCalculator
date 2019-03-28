package com.example.simplecalculator;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    Button button0, button1, button2, button3, button4, button5, button6,
            button7, button8, button9, buttonAdd, buttonSub, buttonDivision,
            buttonMul, buttonDot, buttonC, buttonEqual, buttonPercentage,buttonRoot;

    EditText EditText;
    TextView Answer;
    private static final String TAG = "MainActivity";
    float mValueOne, mValueTwo;

    boolean mAddition, mSubtract, mMultiplication, mDivision, mPercentage,mRoot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button0 = findViewById(R.id.buttonZero);
        button1 = findViewById(R.id.buttonOne);
        button2 = findViewById(R.id.buttonTwo);
        button3 = findViewById(R.id.buttonThree);
        button4 = findViewById(R.id.buttonFour);
        button5 = findViewById(R.id.buttonFive);
        button6 = findViewById(R.id.buttonSix);
        button7 = findViewById(R.id.buttonSeven);
        button8 = findViewById(R.id.buttonEight);
        button9 = findViewById(R.id.buttonNine);
        buttonDot = findViewById(R.id.buttondott);
        buttonAdd = findViewById(R.id.buttonAdd);
        buttonSub = findViewById(R.id.buttonSubtract);
        buttonMul = findViewById(R.id.buttonMultiply);
        buttonDivision = findViewById(R.id.buttonDivide);
        buttonC = findViewById(R.id.buttonClear);
        buttonEqual = findViewById(R.id.buttonEqual);
        buttonPercentage = findViewById(R.id.buttonPercentage);
        buttonRoot = findViewById(R.id.buttonRoot);
        EditText = findViewById(R.id.Exprn);
        Answer = findViewById(R.id.Answer);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "1";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "2";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "3";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "4";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "5";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "6";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "7";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "8";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "9";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText() + "0";
                EditText.setText(value);
                EditText.setSelection(EditText.length());
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String value = EditText.getText().toString();
                String exprn = value + "+";
                if (value.isEmpty()) {
                    EditText.setText(null);
                } else {
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    mAddition = true;
                    EditText.setText(exprn);
                    EditText.setSelection(EditText.length());
                }
            }
        });


        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText().toString();
                String exprn = value + "-";
                if (value.isEmpty()) {
                    String valueOne = EditText.getText() + "-";
                    EditText.setText(valueOne);
                    EditText.setSelection(EditText.length());
                } else {
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    mSubtract = true;
                    EditText.setText(exprn);
                    EditText.setSelection(EditText.length());
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText().toString();
                String exprn = value + "*";
                if (value.isEmpty()) {
                    EditText.setText(null);
                } else {
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    mMultiplication = true;
                    EditText.setText(exprn);
                    EditText.setSelection(EditText.length());
                }
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String value = EditText.getText().toString();
                String exprn = value + "/";
                if (value.isEmpty()) {
                    EditText.setText(null);
                } else {
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    mDivision = true;
                    EditText.setText(exprn);
                    EditText.setSelection(EditText.length());
                }
            }
        });

        buttonPercentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = EditText.getText().toString();
                String exprn = value + "%";
                if (value.isEmpty()) {
                    EditText.setText(null);
                } else {
                    mValueOne = Float.parseFloat(EditText.getText() + "");
                    mPercentage = true;
                    EditText.setText(exprn);
                    EditText.setSelection(EditText.length());
                }
            }
        });

        buttonRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String value = EditText.getText().toString();
                int range = value.length();
                String substr=value.substring(0,range-1);
                EditText.setText(substr);
                EditText.setSelection(EditText.length());
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String exprn = EditText.getText().toString();

                if (mAddition) {
                    String word = "+";
                    String substr=exprn.substring(exprn.indexOf(word)+1);
                    mValueTwo = Float.parseFloat(substr + "");
                    String value = Float.toString(mValueOne + mValueTwo);
                    Answer.setText(value);
                    mAddition = false;
                }

                if (mSubtract) {
                    String word = "-";
                    String substr=exprn.substring(exprn.indexOf(word)+1);
                    mValueTwo = Float.parseFloat(substr + "");
                    String value = Float.toString(mValueOne - mValueTwo);
                    Answer.setText(value);
                    mSubtract = false;
                }

                if (mMultiplication) {
                    String word = "*";
                    String substr=exprn.substring(exprn.indexOf(word)+1);
                    mValueTwo = Float.parseFloat(substr);
                    String value = Float.toString(mValueOne * mValueTwo);
                    Answer.setText(value);
                    mMultiplication = false;
                }

                if (mDivision) {
                    String word = "/";
                    String substr=exprn.substring(exprn.indexOf(word)+1);
                    mValueTwo = Float.parseFloat(substr + "");
                    String value = Float.toString(mValueOne / mValueTwo);
                    Answer.setText(value);
                    mDivision = false;
                }

                if (mPercentage) {
                    String word = "%";
                    String substr=exprn.substring(exprn.indexOf(word)+1);
                    mValueTwo = Float.parseFloat(substr + "");
                    String value = Float.toString((mValueOne * mValueTwo) / 100);
                    Answer.setText(value);
                    mPercentage = false;
                }

                if (mRoot) {
                    String value = Float.toString((mValueOne * mValueTwo) / 100);
                    Answer.setText(value);
                    ;
                    mPercentage = false;
                }
            }
        });


        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText("");
                Answer.setText("");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText.setText(EditText.getText() + ".");
                EditText.setSelection(EditText.length());
            }
        });


    }
}
