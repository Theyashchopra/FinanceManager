package com.example.andriod.financemanager;

import android.app.Application;

public class Variable_app extends Application {
    private float total_money=0;
    private float money_spent=0;
    public float getMoney_spent() {
        return money_spent;
    }

    public void setMoney_spent(float money_spent) {
        this.money_spent = money_spent;
    }

    public float getTotal_money() {
        return total_money;
    }

    public void setTotal_money(float total_money) {
        this.total_money = total_money;
    }


}