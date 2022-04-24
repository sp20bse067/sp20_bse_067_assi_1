package com.example.sp20_bse_067_assi_1;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class InputDataFragment extends Fragment {
    EditText et1, et2, et3;
    Button btn;
    float num1, num2, num3;
    SharedPreferences sharedPreferences;
    private Context mContext;
    public static final String pref = "myPref", key = "dataKey";
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_inputdatafragment, container, false);
        et1 = (EditText) view.findViewById(R.id.et1);
        et2 = (EditText) view.findViewById(R.id.et2);
        et3 = (EditText) view.findViewById(R.id.et3);
        btn = (Button) view.findViewById(R.id.btn);
        mContext = getContext();
        sharedPreferences = mContext.getSharedPreferences(pref, Context.MODE_PRIVATE);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                num1 = Float.parseFloat(et1.getText().toString());
                num2 = Float.parseFloat(et2.getText().toString());
                num3 = Float.parseFloat(et3.getText().toString());
                editor.putFloat("num1", num1);
                editor.putFloat("num2", num2);
                editor.putFloat("num3", num3);
                editor.commit();
            }
        });
        return view;
    }
}