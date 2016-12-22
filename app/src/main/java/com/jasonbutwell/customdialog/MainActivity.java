package com.jasonbutwell.customdialog;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showSimpleDialog();
        showSingleChoiceDialogFragment();
        showCustomDialog();
    }

    public void showSimpleDialog() {
        SimpleDialogFragment simpleDialogFragment = new SimpleDialogFragment();
        simpleDialogFragment.show(getSupportFragmentManager(),"SimpleDialogFragment");

    }

    public void showCustomDialog() {
        CustomDialogFragment customDialog = new CustomDialogFragment();
        customDialog.show(getSupportFragmentManager(), "CustomDialogFragment");
    }

    public void showSingleChoiceDialogFragment() {
        SingleChoiceDialogFragment singleDialog = new SingleChoiceDialogFragment();
        singleDialog.show(getSupportFragmentManager(), "SingleChoiceDialogFragment");
    }
}
