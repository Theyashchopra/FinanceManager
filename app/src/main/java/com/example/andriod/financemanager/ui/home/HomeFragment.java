package com.example.andriod.financemanager.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.andriod.financemanager.R;
import com.example.andriod.financemanager.Variable_app;

public class HomeFragment extends Fragment {
    Variable_app va3=new Variable_app();
    private HomeViewModel homeViewModel;

    public View onCreateView( LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        homeViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged( String s) {
                textView.setText(s);
            }
        });
        final TextView tv2=root.findViewById(R.id.Remainingmoney);
        homeViewModel.getText1().observe(this, new Observer<String>() {
            @Override
            public void onChanged( String s) {
                tv2.setText(s);
            }
        });
        return root;
    }
}