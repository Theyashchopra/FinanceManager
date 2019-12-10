package com.example.andriod.financemanager;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;
public class MainActivity extends AppCompatActivity {
    Variable_app va1=new Variable_app();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SharedPreferences p2=getSharedPreferences("Registercheck",MODE_PRIVATE);
        String check=p2.getString("register","");
        if (check.equals("true")){
            startActivity(new Intent(MainActivity.this,sandwitch.class));
            Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_SHORT).show();
            MainActivity.this.finish();
        }else{
            Toast.makeText(MainActivity.this,"Please Register",Toast.LENGTH_SHORT).show();
        }
    }
    public void change(View view) {
        EditText e1=findViewById(R.id.edit1);
        if (e1.getText().toString().equals("")) {
            Toast.makeText(MainActivity.this, "Enter Name", Toast.LENGTH_LONG).show();
        } else {
            LinearLayout l1 = findViewById(R.id.linear1);
            l1.setVisibility(View.GONE);
            LinearLayout l2 = findViewById(R.id.linear2);
            l2.setVisibility(View.VISIBLE);
        }
    }
    public void change1(View view){
        EditText e2=findViewById(R.id.edit_income);

        if(e2.getText().toString().equals("")){
            Toast.makeText(MainActivity.this,"Enter Income",Toast.LENGTH_LONG).show();
        }
        else {
            LinearLayout l3 = findViewById(R.id.linear2);
            l3.setVisibility(View.GONE);
            LinearLayout l4 = findViewById(R.id.linear3);
            l4.setVisibility(View.VISIBLE);
            if (e2.getText().toString().length() != 0) {
                va1.setTotal_money(Float.parseFloat(e2.getText().toString().trim()));
            }
        }
    }
    public void nextactivity(View view) {
        EditText e3=findViewById(R.id.edit3);
        int date=Integer.parseInt(e3.getText().toString().trim());
        if((date < 1) || (date > 31)){
            Toast.makeText(MainActivity.this,"Invalid Date",Toast.LENGTH_LONG).show();
        }else {
            SharedPreferences p1=getSharedPreferences("Registercheck",MODE_PRIVATE);
            SharedPreferences.Editor editor=p1.edit();
            editor.putString("register","true");
            editor.apply();
            Intent i1 = new Intent(this, sandwitch.class);
            startActivity(i1);
            Toast.makeText(MainActivity.this,"Registration done",Toast.LENGTH_SHORT).show();
            MainActivity.this.finish();
        }
    }

}