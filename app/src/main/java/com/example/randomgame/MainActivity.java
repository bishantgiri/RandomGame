package com.example.randomgame;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.sql.SQLOutput;

public class MainActivity extends AppCompatActivity {
    private Button btnFirst,btnSecond,btnStart;
    private TextView tvOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnFirst=findViewById(R.id.btnFirst);
        btnSecond=findViewById(R.id.btnSecond);
        btnStart=findViewById(R.id.btnStart);
        tvOut=findViewById(R.id.tvScore);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NumRandom nr=new NumRandom();
                int value=nr.getValue();
                int value1=nr.getValue1();

                btnFirst.setText(Integer.toString(value));
                btnSecond.setText(Integer.toString(value1));
            }
        });
//        btnFirst.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                int counter=0;
//              int num1= Integer.parseInt(btnFirst.getText().toString());
//                int num2= Integer.parseInt(btnSecond.getText().toString());
////                if(num1>num2){
////                    return counter++;
////                } else
////                {
////                    System.out.println("Error");
////                }
//            }
//        });




    }
}
