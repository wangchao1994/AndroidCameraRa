package com.example.wangchao.androidcamerademo;
import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.example.librarycamera.app.IApp;


public class CameraActivity extends AppCompatActivity  implements IApp {

    private static final String TAG = "CameraActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }


    @Override
    public Activity getActivity() {
        return this;
    }
}