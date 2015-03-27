package com.thesis.carhud.carhudb01;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by l2ol3otic2 on 3/25/2015.
 */
public class Fragment1 extends Fragment {
    View rootview;
    @Nullable
    @Override
    public View onCreateView(final LayoutInflater inflater , final ViewGroup Container ,Bundle saveIntanceState){
        rootview = inflater.inflate(R.layout.fragment1_layout,Container,false);
        Log.d("Page","1");
        return rootview;
    }
}
