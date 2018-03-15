package uk.ac.napier.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button0;
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonSubtract;
    Button buttonTimes;
    Button buttonDivide;
    Button buttonEquals;
    Button buttonPoint;
    Button buttonClear;
    Button buttonFullClear;

    TextView Working;
    TextView Answer;

    float fValueOne;
    float fValueTwo;

    String sValueOne;
    String sValueTwo;

    boolean booAdd;
    boolean booSubtract;
    boolean booTimes;
    boolean booDivide;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       button0 = findViewById (R.id.button0);
       button1 = findViewById (R.id.button1);
       button2 = findViewById (R.id.button2);
       button3 = findViewById (R.id.button3);
       button4 = findViewById (R.id.button4);
       button5 = findViewById (R.id.button5);
       button6 = findViewById (R.id.button6);
       button7 = findViewById (R.id.button7);
       button8 = findViewById (R.id.button8);
       button9 = findViewById (R.id.button9);
       buttonAdd = findViewById (R.id.buttonAdd);
       buttonSubtract = findViewById (R.id.buttonSubtract);
       buttonTimes = findViewById (R.id.buttonTimes);
       buttonDivide = findViewById (R.id.buttonDivide);
       buttonEquals = findViewById (R.id.buttonEquals);
       buttonPoint = findViewById (R.id.buttonPoint);
       buttonClear = findViewById (R.id.buttonClear);
       buttonFullClear = findViewById (R.id.buttonFullClear);

       Working = findViewById(R.id.textViewWokring);
       Answer = findViewById(R.id.textViewAnswer);


        button0.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                Working.setText(Working.getText()+"9");
            }
        });




        buttonAdd.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    if (Working == null) {
                        Working.setText("");
                    } else {
                        sValueOne = Working.getText() + "";
                        if(sValueOne.isEmpty())
                        {
                            Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                        } else {
                            fValueOne = Float.parseFloat(sValueOne);
                            booAdd = true;
                            Working.setText(null);
                        }
                    }
            }
        });

        buttonSubtract.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sValueOne = Working.getText() + "";
                if(sValueOne.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    fValueOne = Float.parseFloat(sValueOne);
                    booSubtract = true;
                    Working.setText(null);
                }
            }
        });

        buttonTimes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sValueOne = Working.getText() + "";
                if(sValueOne.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    fValueOne = Float.parseFloat(sValueOne);
                    booTimes = true;
                    Working.setText(null);
                }
            }
        });

        buttonDivide.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sValueOne = Working.getText() + "";
                if(sValueOne.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    fValueOne = Float.parseFloat(sValueOne);
                    booTimes = true ;
                    Working.setText(null);
                }
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sValueTwo = Working.getText() + "";
                if(sValueTwo.isEmpty())
                {
                    Toast.makeText(MainActivity.this, "Enter a number", Toast.LENGTH_SHORT).show();
                } else {
                    fValueOne = Float.parseFloat(sValueOne);


                fValueTwo = Float.parseFloat(Working.getText() + "");
                    if (booAdd == true) {

                        //Working.setText
                        Answer.setText(fValueOne + fValueTwo + "");
                        booAdd = false;
                    }
                    if (booSubtract == true){
                        Answer.setText(fValueOne - fValueTwo+"");
                        booSubtract=false;
                    }

                    if (booTimes == true){
                        Answer.setText(fValueOne * fValueTwo+"");
                        booTimes=false;
                    }

                    if (booDivide == true){
                        Answer.setText(fValueOne / fValueTwo+"");
                        booDivide=false;
                    }
                }
            }
        });


        buttonPoint.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Working.setText(Working.getText()+".");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Working.setText("");
                Answer.setText("");
            }
        });
    }
}
