package com.bignerdranch.android.criminalintent;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bignerdranch.android.criminalintent.Utils.PictureUtils;

import java.io.File;

public class ZoomInFragment extends DialogFragment {
    private static final String ARG_PHOTO_FILE = "photo_file";

    File mPhotoFile;
    ImageView mZoomView;

    public ZoomInFragment() {
        // Required empty public constructor
    }

    public static ZoomInFragment newInstance(File photoFile) {
        ZoomInFragment fragment = new ZoomInFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PHOTO_FILE, photoFile);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPhotoFile = (File) getArguments().getSerializable(ARG_PHOTO_FILE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.dialog_zoom, container, false);

        Bitmap bitmap = PictureUtils.getScaledBitmap(mPhotoFile.getPath(), getActivity());

        mZoomView = (ImageView) v.findViewById(R.id.zoomed_picture);
        mZoomView.setImageBitmap(bitmap);

        return v;
    }
}
