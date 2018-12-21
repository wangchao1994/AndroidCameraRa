package com.example.wangchao.androidcamerademo.manage;

import android.util.Log;
import android.widget.FrameLayout;

import com.example.api.CameraView;
import com.example.api.base2camera.AutoFitTextureView;
import com.example.librarycamera.app.IApp;
import com.example.wangchao.androidcamerademo.R;

public class CameraManager{

    private static final String TAG = "CameraManager";
    private IApp mIApp;
    private FrameLayout mCurSurfaceViewLayout;
    private AutoFitTextureView mSurfaceView;
    private boolean mIsFirstStartUp = false;
    public CameraManager(IApp app){
        mIApp = app;
    }
    public void attachSurfaceViewLayout() {
        Log.i(TAG, "[attachSurfaceViewLayout] begin mCurSurfaceViewLayout = " + mCurSurfaceViewLayout);
        if (mSurfaceView == null) {
            FrameLayout surfaceViewRoot = (FrameLayout) mIApp.getActivity().findViewById(R.id.camera_surfaceview_root);
            mCurSurfaceViewLayout = (FrameLayout) mIApp.getActivity().getLayoutInflater().inflate(R.layout.camera_preview_layout, null);
            mSurfaceView = (AutoFitTextureView) mCurSurfaceViewLayout.findViewById(R.id.camera_preview);
            surfaceViewRoot.addView(mCurSurfaceViewLayout);
        }
        Log.i(TAG, "[attachSurfaceViewLayout] end ");
    }

}
