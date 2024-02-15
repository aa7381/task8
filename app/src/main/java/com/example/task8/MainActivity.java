package com.example.task8;

import static android.app.PendingIntent.getActivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;


public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();
    int mone=0;
    int mone1=0;
    int sum=0;
    int sum2=0;
    int sum3=0;
Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    TextView tV1;
    TextView tV2;
    TextView tV3;
    TextView tV4;
    TextView tV5;
    TextView tV6;

    EditText eT1;
    EditText eT2;
    EditText eT3;
    ImageView[] iV=new ImageView[3];

    int [] id=new int[2];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 =findViewById(R.id.btn1);
        btn2 =findViewById(R.id.btn2);
        btn3 =findViewById(R.id.btn3);
        btn4 =findViewById(R.id.btn4);



        tV1 =findViewById(R.id.tV1);
        tV2 =findViewById(R.id.tV2);
        tV3 =findViewById(R.id.tV3);
        tV4 =findViewById(R.id.tV4);
        tV5 =findViewById(R.id.tV5);
        tV6 =findViewById(R.id.tV6);




        eT1 = (EditText) findViewById(R.id.eT1);
        eT2 = (EditText) findViewById(R.id.eT2);
        eT3 = (EditText) findViewById(R.id.eT3);
        iV[0] =(ImageView) findViewById(R.id.iV);
        iV[1] =(ImageView) findViewById(R.id.iV2);
        iV[2] = (ImageView) findViewById(R.id.iV3);

        id[0]=R.drawable.correct;
        id[1]=R.drawable.worng;

        int randomNumber = rnd.nextInt(100) + 1;

        // הצגת המספר ב-TextView
        tV1.setText(String.valueOf(randomNumber));

        int randomNumber3 = rnd.nextInt(100) + 1;

        // הצגת המספר ב-TextView
        tV6.setText(String.valueOf(randomNumber3));

        int randomNumber1 = rnd.nextInt(100) + 1;

        // הצגת המספר ב-TextView
        tV5.setText(String.valueOf(randomNumber1));


        int randomNumber2 = rnd.nextInt(100) + 1;

        // הצגת המספר ב-TextView
        tV4.setText(String.valueOf(randomNumber2));
        sum2 = randomNumber + randomNumber2 + randomNumber1 ;
        sum = randomNumber + randomNumber2 ;
        sum3 = sum2+randomNumber3;
        tV3.setText(String.valueOf(sum2));

        tV2.setText(String.valueOf(sum));
        tV2.setVisibility(View.INVISIBLE);
        tV5.setVisibility(View.INVISIBLE);
        eT2.setVisibility(View.INVISIBLE);
        btn2.setVisibility(View.INVISIBLE);
        tV3.setVisibility(View.INVISIBLE);
        tV6.setVisibility(View.INVISIBLE);
        eT3.setVisibility(View.INVISIBLE);
        btn3.setVisibility(View.INVISIBLE);
    }

public void clicked1(View view) {


    if (Integer.parseInt(eT1.getText().toString()) == sum) {
            iV[0].setImageResource(id[0]);
            tV2.setVisibility(View.VISIBLE);
            tV5.setVisibility(View.VISIBLE);
            eT2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
        } else {
            iV[0].setImageResource(id[1]);
            tV2.setVisibility(View.VISIBLE);
            tV5.setVisibility(View.VISIBLE);
            eT2.setVisibility(View.VISIBLE);
            btn2.setVisibility(View.VISIBLE);
        }

}
public void clicked2(View view) {
    if (Integer.parseInt(eT1.getText().toString()) == sum) {
        iV[1].setImageResource(id[0]);
        tV3.setVisibility(View.VISIBLE);
        tV6.setVisibility(View.VISIBLE);
        eT3.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    } else {
        iV[1].setImageResource(id[1]);
        tV3.setVisibility(View.VISIBLE);
        tV6.setVisibility(View.VISIBLE);
        eT3.setVisibility(View.VISIBLE);
        btn3.setVisibility(View.VISIBLE);
    }
}
    public void clicked3(View view)
    {
        if(Integer.parseInt(eT1.getText().toString()) == sum)
        {
            iV[2].setImageResource(id[0]);

        }else
        {
            iV[2].setImageResource(id[1]);

        }




}
    public void clicked4(View view)
    {
       // eT1.setText(String.valueOf(' '));
           // this.recreate();
        Intent t= new Intent(MainActivity.this,MainActivity.class);
        startActivity(t);
        finish();

    }
        }








