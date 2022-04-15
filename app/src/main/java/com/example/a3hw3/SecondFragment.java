package com.example.a3hw3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class SecondFragment extends Fragment {
    private TextView textView;
    private Button next;
    public static final String KEY_FOR_BUNDLE="key.bundle";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_second, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textView = view.findViewById(R.id.text);
        if (getArguments() != null){
            String value= getArguments().getString(FirstFragment.KEY_FOR_BUNDLE);
            textView.setText(value);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Bundle bundle = new Bundle();
                    bundle.putString(KEY_FOR_BUNDLE, TextView.);
                    SecondFragment fragment = new SecondFragment();

                    fragment.setArguments(bundle);

                    requireActivity().getSupportFragmentManager().beginTransaction().
                            replace(R.id.fragment_container_view_tag,
                                    new SecondFragment()).addToBackStack(null).commit();
                }
        }
    }
}