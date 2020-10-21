package com.example.escreening3.ui.fragHndProgramme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.escreening3.R;

public class FragHndProgramme extends Fragment {

    private FragHndProgrammeViewModel fragHndProgrammeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fragHndProgrammeViewModel =
                ViewModelProviders.of(this).get(FragHndProgrammeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_hnd_programme, container, false);
        final TextView textView = root.findViewById(R.id.text_fragFive);
        fragHndProgrammeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

}
