package com.example.diseroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    TextView show1,show2,show3,show4,show5,show6;
    ImageView diceimg;
    int a=0,b=0,c=0,d=0,e=0,f=0,num,temp1=0,temp2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        show1=findViewById(R.id.show1);
        show2=findViewById(R.id.show2);
        show3=findViewById(R.id.show3);
        show4=findViewById(R.id.show4);
        show5=findViewById(R.id.show5);
        show6=findViewById(R.id.show6);
        diceimg=findViewById(R.id.diceimg);
        diceimg.setImageResource(R.drawable.inicon);
        diceimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Random random = new Random();
                num=random.nextInt(6)+1;
                temp1=num;
                temp2=a;
                a = temp1;
                show1.setText(a+"");
                temp1=b;
                b=temp2;
                show2.setText(b+"");
                temp2=c;
                c=temp1;
                show3.setText(c+"");
                temp1=d;
                d=temp2;
                show4.setText(d+"");
                temp2=e;
                e=temp1;
                show5.setText(e+"");
                temp1=f;
                f=temp2;
                show6.setText(f+"");

                switch (num)
                {
                    case 1:
                        diceimg.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        diceimg.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        diceimg.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        diceimg.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        diceimg.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        diceimg.setImageResource(R.drawable.dice6);
                        break;
                }

            }
        });
    }
}