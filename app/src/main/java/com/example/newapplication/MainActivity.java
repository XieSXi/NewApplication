package com.example.newapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView sco;
    TextView sco2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sco = (TextView) findViewById(R.id.score);
        sco2= (TextView) findViewById(R.id.score2);

    }
    public void btnAdd1(View btn){
        if (btn.getId()==R.id.btn1) {
            showScore(1);
        }
        else{showScore2(1);}
    }
    public void btnAdd2(View btn){
        if (btn.getId()==R.id.btn2) {
            showScore(2);
        }
        else{showScore2(2);};
    }
    public void btnAdd3(View btn){
        if (btn.getId()==R.id.btn3) {
            showScore(3);
        }
        else{showScore2(3);}
    }
    public void btnReset(View btn){
         sco.setText("0");
         sco2.setText("0");
    }
    private void showScore(int inc){
        String OldScore = (String) sco.getText();
        int newScore =Integer.parseInt(OldScore)+inc;
        sco.setText("" +newScore);
    }
    private void showScore2(int inc){
        String OldScore = (String) sco2.getText();
        int newScore =Integer.parseInt(OldScore)+inc;
        sco2.setText("" +newScore);
    }
}
