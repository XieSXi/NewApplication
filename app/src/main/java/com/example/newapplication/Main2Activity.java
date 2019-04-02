package com.example.newapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    TextView out;
    EditText in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        in=(EditText) findViewById(R.id.inptext);
        out=(TextView) findViewById(R.id.outtext);

    }
    public void onClick(View btn){
        String rmb = in.getText().toString();
        float r = 0;
        if(rmb.length()>0){  r=Float.parseFloat(rmb);}
        else {
            Toast.makeText(this, "您还未输入金额", Toast.LENGTH_SHORT).show();
        }
        if(btn.getId()==R.id.dollar){float dol = r*(1/6.7f);
        out.setText(String.valueOf(dol));}
         else if(btn.getId()==R.id.euro){float eur = r*(1/11f);
            out.setText(String.valueOf(eur));}
             else {float won = r*(500);
                  out.setText(String.valueOf(won));}


    }
    public void openOne (View btn){
        Intent hello= new Intent(this,MainActivity.class);
        startActivity(hello);
    
    }
}
