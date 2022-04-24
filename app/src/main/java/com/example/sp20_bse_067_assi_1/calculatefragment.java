package com.example.sp20_bse_067_assi_1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class CalculateFragment extends Fragment {
    EditText et, et_result;
    Button btn_add, btn_sub, btn_multiply, btn_divide;
    public static final String pref = "myPref", key = "dataKey";
    SharedPreferences sharedPreferences;
    private Context mContext;
    float num1 = 0.0f, num2 = 0.0f, num3 = 0.0f, result = 0.0f;
    @SuppressLint("WrongViewCast")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_calculatefragment, container, false);
        et = (EditText) view.findViewById(R.id.et);
        et_result = (EditText) view.findViewById(R.id.et_result);
        btn_add = (Button) view.findViewById(R.id.btn_add);
        btn_sub = (Button) view.findViewById(R.id.btn_sub);
        btn_multiply = (Button) view.findViewById(R.id.btn_multiply);
        btn_divide = (Button) view.findViewById(R.id.btn_divide);


        mContext = getContext();
        sharedPreferences = getActivity().getApplication().getSharedPreferences(pref, Context.MODE_PRIVATE);
        if(sharedPreferences.contains(key)){
            num1 = sharedPreferences.getFloat("num1", 0.0f);
            num2 = sharedPreferences.getFloat("num2", 0.0f);
            num3 = sharedPreferences.getFloat("num3", 0.0f);
        }
        et.setText("First number: "+num1+"\nSecond Number: "+num2+"\nThird Number: "+num3);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = num1 + num2 + num3;
                et_result.setText(result+"");
            }
        });
        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = num1 - num2 - num3;
                et_result.setText(result+"");
            }
        });
        btn_multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = num1 * num2 * num3;
                et_result.setText(result+"");
            }
        });
        btn_divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result = num1 / num2 / num3;
                et_result.setText(result+"");
            }
        });
        return view;
    }
}