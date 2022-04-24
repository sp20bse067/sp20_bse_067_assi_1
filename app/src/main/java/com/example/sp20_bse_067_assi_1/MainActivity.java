package com.example.sp20_bse_067_assi_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.renderscript.ScriptGroup;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button input_data_btn, calculate_btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        input_data_btn = (Button) findViewById(R.id.input_data_btn);
        calculate_btn = (Button) findViewById(R.id.calculate_btn);
        input_data_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                InputDataFragment inputDataFragment = new InputDataFragment();
                getSupportFragmentManager().beginTransaction().replace(R.id.container, inputDataFragment, null).commit();
            }
        });
        calculate_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}