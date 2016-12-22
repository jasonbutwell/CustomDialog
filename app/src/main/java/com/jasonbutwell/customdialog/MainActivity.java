package com.jasonbutwell.customdialog;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.DatePicker;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDatePickerDialog();
        showSimpleDialog();
        showSingleChoiceDialogFragment();
        showCustomDialog();
    }

    // Creates a simple date picker Dialog

    public void showDatePickerDialog() {
        Calendar cal = Calendar.getInstance();
        DatePickerDialog datePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int mofYear, int dayOfMonth) {
                Log.i("DATE",String.format("DATE chosen -- day: %d, month %d, year %d",dayOfMonth, mofYear,year));
            }
        },cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DAY_OF_MONTH));

        datePickerDialog.show();
    }

    // Creates a simple basic Dialog

    public void showSimpleDialog() {
        SimpleDialogFragment simpleDialogFragment = new SimpleDialogFragment();
        simpleDialogFragment.show(getSupportFragmentManager(),"SimpleDialogFragment");
    }

    // A custom Dialog that asks for two fields

    public void showCustomDialog() {
        CustomDialogFragment customDialog = new CustomDialogFragment();
        customDialog.show(getSupportFragmentManager(), "CustomDialogFragment");
    }

    // A single choice Dialog that asks for a single choice from a list

    public void showSingleChoiceDialogFragment() {
        SingleChoiceDialogFragment singleDialog = new SingleChoiceDialogFragment();
        singleDialog.show(getSupportFragmentManager(), "SingleChoiceDialogFragment");
    }
}
