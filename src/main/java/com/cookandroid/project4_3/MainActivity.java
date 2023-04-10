package com.cookandroid.project4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText edit1, edit2;
    Button btnAdd, btnSud, btnMul, btnDiv, btnDiv2;
    TextView textResult;
    String num1, num2;
    Integer result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("초간단 계산기");

        int i = 0;

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSud = (Button) findViewById(R.id.BtnSud);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnDiv2 = (Button) findViewById(R.id.BtnDiv2);

        textResult = (TextView) findViewById(R.id.TextResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edit1.getText().toString().length() == 0) {

                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else if (edit2.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) + Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnSud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().toString().length() == 0) {

                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else if (edit2.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) - Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });


        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().toString().length() == 0) {

                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else if (edit2.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) * Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else if (edit2.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) / Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());

                }
            }
        });

        btnDiv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edit1.getText().toString().length() == 0) {

                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else if (edit2.getText().toString().length() == 0) {
                    Toast.makeText(MainActivity.this, "값을 입력해주세요", Toast.LENGTH_SHORT).show();
                } else {
                    num1 = edit1.getText().toString();
                    num2 = edit2.getText().toString();
                    result = Integer.parseInt(num1) % Integer.parseInt(num2);
                    textResult.setText("계산 결과 : " + result.toString());
                }
            }
        });
    }
}
