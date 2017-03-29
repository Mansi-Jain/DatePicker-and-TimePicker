package com.example.dream.dateandtimepicker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
    }

    public void selectDate(View view){
        Intent intent = new Intent(this,Date_Picker.class);
        startActivity(intent);

    }

    public void selectTime(View view){
        Intent intent1 = new Intent(this,Time_Picker.class);
        startActivity(intent1);
    }




}
