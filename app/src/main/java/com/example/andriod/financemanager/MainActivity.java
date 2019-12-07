package com.example.andriod.financemanager;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Variable_app va1=new Variable_app();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void change(View view){
        LinearLayout l1=findViewById(R.id.linear1);
        l1.setVisibility(View.GONE);
        LinearLayout l2=findViewById(R.id.linear2);
        l2.setVisibility(View.VISIBLE);
    }
    public void change1(View view){
        LinearLayout l3=findViewById(R.id.linear2);
        l3.setVisibility(View.GONE);
        LinearLayout l4=findViewById(R.id.linear3);
        l4.setVisibility(View.VISIBLE);
        TextView t_in=findViewById(R.id.edit_income);
        if (t_in.getText().toString().length() != 0) {
            va1.setTotal_money(Float.parseFloat(t_in.getText().toString().trim()));
        }
    }
    public void nextactivity(View view) {
        Intent i1 =new Intent(this,sandwitch.class);
        startActivity(i1);
    }

}