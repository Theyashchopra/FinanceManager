package com.example.andriod.financemanager.ui.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.andriod.financemanager.Variable_app;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText,mText1;
    Variable_app va3=new Variable_app();
    public HomeViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Money Spent");
        mText1 = new MutableLiveData<>();
        mText1.setValue((String.valueOf(va3.getMoney_spent())));
    }

    public LiveData<String> getText() {
        return mText;
    }
    public LiveData<String> getText1() {
        return mText1;
    }
}