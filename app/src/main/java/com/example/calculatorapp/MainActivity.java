package com.example.calculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Bello";

      Button btn[] = new Button[10];
      Button btnC,btnCh,btnP,btnD,btnX,btnS,btnA,btnE,btnDc;
      Double s=0.0;
      int f=0,d=0;
      Double num;
      char c='n';
      String st="";
      TextView tv1,tv2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn[0] = findViewById(R.id.btn0);
        btn[1] = findViewById(R.id.btn1);
        btn[2] = findViewById(R.id.btn2);
        btn[3] = findViewById(R.id.btn3);
        btn[4] = findViewById(R.id.btn4);
        btn[5] = findViewById(R.id.btn5);
        btn[6] = findViewById(R.id.btn6);
        btn[7] = findViewById(R.id.btn7);
        btn[8] = findViewById(R.id.btn8);
        btn[9] = findViewById(R.id.btn9);
        btnC = findViewById(R.id.btnC);
        btnCh = findViewById(R.id.btnCh);
        btnP = findViewById(R.id.btnP);
        btnD = findViewById(R.id.btnD);
        btnX = findViewById(R.id.btnX);
        btnS = findViewById(R.id.btnS);
        btnA = findViewById(R.id.btnA);
        btnDc = findViewById(R.id.btnDc);
        btnE = findViewById(R.id.btnE);
        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);


        for(int i=0;i<10;i++){
            final int finalI = i;
            btn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(c=='m'){
                        s=0.0;
                        st="";
                        c='n';
                        d=0;
                    }
                        st = st + finalI;

                    if(st.length()>=10){
                        tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,35);
                    }
                    else{
                        tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,55);
                    }
                        tv2.setText(st);
                        f=0;
                }
            });
        }

        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                 s=0.0;
                 f=0;
                 st="";
                 d=0;
                tv1.setText(st);
                tv2.setText(st);
                tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,55);
                c='n';
            }
        });
        btnCh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!st.equals("")){
                num = Double.parseDouble(st);
                num=num*(-1);
                st=num+"";
                tv2.setText(st);
                    if(Math.ceil(num)==num){

                        tv2.setText(Math.round(num) + "");
                    }
                    else{
                        tv2.setText(num+"");
                    }
                }
            }
        });
        btnP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    if(f==0) {
                        num = Double.parseDouble(st);
                        switch (c) {
                            case '+':
                                s = s + num;
                                break;
                            case '-':
                                s = s - num;
                                break;
                            case '*':
                                s = s * num;
                                break;
                            case '/':
                                s = s / num;
                                break;
                            case '%':
                                s = s % num;
                                break;
                            default:
                                s = num;
                        }
                    }
                    f=1;
                st="";d=0;

                if(Math.ceil(s)==s){

                    tv1.setText(Math.round(s) + "%");
                }
                else{
                    tv1.setText(s+"%");
                }
                if(String.valueOf(s).length()>10){
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,35);
                }
                else{
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,55);
                }
                tv2.setText(st);
                c='%';

            }
        });
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(f==0){
                    num = Double.parseDouble(st);
                switch(c){
                    case '+': s = s + num;
                        break;
                    case '-': s = s - num;
                        break;
                    case '*': s = s * num;
                        break;
                    case '/': s = s / num;
                        break;
                    case '%': s = s % num;
                        break;
                    default: s=num;
                }}

                st="";
                c='+';
                f=1;d=0;
                if(Math.ceil(s)!=s){
                    tv1.setText(s+"+");
                }
                else{
                    tv1.setText(Math.round(s) + "+");

                }
                if(String.valueOf(s).length()>10){
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                }
                else{
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,55);
                }
                tv2.setText(st);
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(f==0) {
                    num = Double.parseDouble(st);
                    Log.v(TAG, "   num : "+ num+"   st : "+ st+"   c : "+c+"   s : "+s);
                    switch (c) {
                        case '+':
                            s = s + num;
                            break;
                        case '-':
                            s = s - num;
                            break;
                        case '*':
                            s = s * num;
                            break;
                        case '/':
                            s = s / num;
                            break;
                        case '%':
                            s = s % num;
                            break;
                        default:
                            s = num;
                    }
                }
                f=1;
                st="";
                c='-';d=0;
                if(Math.ceil(s)!=s){
                    tv1.setText(s+"-");
                }
                else{
                    tv1.setText(Math.round(s) + "-");

                }
                if(String.valueOf(s).length()>10){
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                }
                else{
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,55);
                }
                tv2.setText(st);
            }
        });
        btnX.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                if(f==0) {
                    num = Double.parseDouble(st);
                    switch (c) {
                        case '+':
                            s = s + num;
                            break;
                        case '-':
                            s = s - num;
                            break;
                        case '*':
                            s = s * num;
                            break;
                        case '/':
                            s = s / num;
                            break;
                        case '%':
                            s = s % num;
                            break;
                        default:
                            s = num;
                    }
                }
                f=1;
                st="";
                c='*';d=0;
                if(Math.ceil(s)!=s){
                    tv1.setText(s+"*");
                }
                else{
                    tv1.setText(Math.round(s) + "*");

                }
                if(String.valueOf(s).length()>10){
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,40);
                }
                else{
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,55);
                }
                tv2.setText(st);
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(st);

                switch(c){
                    case '+': s = s + num;
                        break;
                    case '-': s = s - num;
                        break;
                    case '*': s = s * num;
                        break;
                    case '/': s = s / num;
                        break;
                    case '%': s = s % num;
                        break;
                    default: s=num;
                }

                f=1;
                st="";
                c='/';d=0;
                if(Math.ceil(s)!=s){
                    tv1.setText(s+"/");
                }
                else{
                    tv1.setText(Math.round(s) + "/");

                }
               // Toast.makeText(MainActivity.this, "Added "+s, Toast.LENGTH_SHORT).show();
                if(String.valueOf(s).length()>10){
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,35);
                }
                else{
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,55);
                }
                tv2.setText(st);
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num = Double.parseDouble(st);
                switch(c){
                    case '+': s = s + num;
                        break;
                    case '-': s = s - num;
                        break;
                    case '*': s = s * num;
                        break;
                    case '/': s = s / num;
                        break;
                    case '%': s = s % num;
                        break;
                    default: s=num;
                }
                st=String.valueOf(s);
                c='m';
                f=0;d=0;
                tv1.setText("");

                Log.v(TAG,"hELLOOO "+s+" TYPE: ");

                if(String.valueOf(s).length()>10){
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,35);
                    Log.v(TAG,"hELLOOO22223333333333333 "+s);
                }
                else{
                    tv2.setTextSize(TypedValue.COMPLEX_UNIT_SP,55);
                    Log.v(TAG,"hELLOOO2222 "+s);
                }

                if(Math.ceil(s)==s){
                    tv2.setText(Math.round(s)+"");
                }
                else{
                    tv2.setText(s+"");
                }

            }
        });
        btnDc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(d==0){
                    d++;
                    st = st + ".";
                }
                tv2.setText(st);

            }
        });




    }

}