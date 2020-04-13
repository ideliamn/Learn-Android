package com.example.projectbelajar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;

public class DatePickerActivity extends AppCompatActivity {

    TextView tv_date;
    public String date_string;
    Button btn_next;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date_picker);
        tv_date = findViewById(R.id.tv_date);
        btn_next = findViewById(R.id.btn_next);
    }

    public void showDatePicker(View view) {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void processDatePickerResult(int year, int month, int day) {
        String month_string = Integer.toString(month + 1);
        String day_string = Integer.toString(day);
        String year_string = Integer.toString(year);
        date_string = (month_string + "/" + day_string + "/" + year_string);
        Toast.makeText(this, "Date: " + date_string, Toast.LENGTH_SHORT).show();
        tv_date.setText(date_string);
        next(date_string);
    }

    public void next(String date_string) {
        Intent intent = new Intent(getApplicationContext(),AddPostActivity.class);
        intent.putExtra("date_string", date_string);
        startActivity(intent);
    }
}
