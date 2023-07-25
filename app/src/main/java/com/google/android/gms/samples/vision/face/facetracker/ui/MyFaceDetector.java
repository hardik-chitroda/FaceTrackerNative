package com.google.android.gms.samples.vision.face.facetracker.ui;

import android.hardware.camera2.params.Face;
import android.util.SparseArray;

import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.Frame;

class MyFaceDetector extends Detector<Face> {
  private Detector<Face> mDelegate;

  MyFaceDetector(Detector<Face> delegate) {
    mDelegate = delegate;
  }

  public SparseArray<Face> detect(Frame frame) {
    // *** add your custom frame processing code here
    return mDelegate.detect(frame);
  }

  public boolean isOperational() {
    return mDelegate.isOperational();
  }

  public boolean setFocus(int id) {
    return mDelegate.setFocus(id);
  }
}