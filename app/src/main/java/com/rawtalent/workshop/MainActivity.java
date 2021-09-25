package com.rawtalent.workshop;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    EditText op1,op2;
    TextView result;
    Button add,sub,mul,div;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        op1=findViewById(R.id.input1);
        op2=findViewById(R.id.input2);
        result=findViewById(R.id.result);
        add=findViewById(R.id.addbtn);
        sub=findViewById(R.id.substractbtn);
        mul=findViewById(R.id.multiplybtn);
        div=findViewById(R.id.dividebtn);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("");

                String s1=op1.getText().toString();
                String s2=op2.getText().toString();

                if (s1.equals("")||s2.equals("")){
                    Toast.makeText(MainActivity.this, "Please enter valid number", Toast.LENGTH_SHORT).show();
                    return;
                }
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);

                result.setText(""+addition(a,b));
            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("");

                String s1=op1.getText().toString();
                String s2=op2.getText().toString();

                if (s1.equals("")||s2.equals("")){
                    Toast.makeText(MainActivity.this, "Please enter valid number", Toast.LENGTH_SHORT).show();
                    return;
                }
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);

                result.setText(""+substraction(a,b));
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("");

                String s1=op1.getText().toString();
                String s2=op2.getText().toString();

                if (s1.equals("")||s2.equals("")){
                    Toast.makeText(MainActivity.this, "Please enter valid number", Toast.LENGTH_SHORT).show();
                    return;
                }
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);

                result.setText(""+multiplication(a,b));
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("");

                String s1=op1.getText().toString();
                String s2=op2.getText().toString();

                if (s1.equals("")||s2.equals("")){
                    Toast.makeText(MainActivity.this, "Please enter valid number", Toast.LENGTH_SHORT).show();
                    return;
                }
                int a=Integer.parseInt(s1);
                int b=Integer.parseInt(s2);

                result.setText(""+division(a,b));
            }
        });


    }


    public int addition(int a,int b){
        return a+b;
    }

    public int substraction(int a,int b){
        return a-b;
    }
    public int multiplication(int a,int b){
        return a*b;
    }
    public int division(int a,int b){
        return a/b;
    }

}