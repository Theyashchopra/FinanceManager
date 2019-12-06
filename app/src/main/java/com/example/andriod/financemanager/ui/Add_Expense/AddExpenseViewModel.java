package com.example.andriod.financemanager.ui.Add_Expense;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddExpenseViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AddExpenseViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
