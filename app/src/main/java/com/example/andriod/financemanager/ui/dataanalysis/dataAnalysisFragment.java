package com.example.andriod.financemanager.ui.dataanalysis;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.andriod.financemanager.R;

public class dataAnalysisFragment extends Fragment {

    private DataAnalysisViewModel dataAnalysisViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dataAnalysisViewModel =
                ViewModelProviders.of(this).get(DataAnalysisViewModel.class);
        View root = inflater.inflate(R.layout.fragment_data_analysis, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        dataAnalysisViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}