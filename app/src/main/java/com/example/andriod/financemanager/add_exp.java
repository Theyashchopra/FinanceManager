package com.example.andriod.financemanager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class add_exp extends AppCompatActivity {
    Variable_app va2=new Variable_app();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_exp);
    }

    public void exp_adder(View view) {
        TextView e_ne=findViewById(R.id.e_newexpense);
            if (e_ne.getText().toString().length() != 0) {
                va2.setMoney_spent(Float.parseFloat(e_ne.getText().toString().trim()) + va2.getMoney_spent());
            }
        Intent i11 =new Intent(this,sandwitch.class);
        startActivity(i11);
    }
}
