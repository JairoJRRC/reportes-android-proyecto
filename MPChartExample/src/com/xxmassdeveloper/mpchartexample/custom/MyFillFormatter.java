package com.xxmassdeveloper.mpchartexample.custom;

import com.github.mikephil.charting.formatter.IFillFormatter;
import com.github.mikephil.charting.interfaces.dataprovider.LineDataProvider;
import com.github.mikephil.charting.interfaces.datasets.ILineDataSet;

/**
 * * Created by Jairo Rojas (jairo.rafa.1997@gmail.com) on 12/09/15.
 */
public class MyFillFormatter implements IFillFormatter
{

    private float mFillPos = 0f;

    public MyFillFormatter(float fillpos) {
        this.mFillPos = fillpos;
    }

    @Override
    public float getFillLinePosition(ILineDataSet dataSet, LineDataProvider dataProvider) {
        return mFillPos;
    }
}
