package com.xxmassdeveloper.mpchartexample.custom;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;
import com.github.mikephil.charting.utils.ViewPortHandler;

import java.text.DecimalFormat;

/**
 * * Created by Jairo Rojas (jairo.rafa.1997@gmail.com) on 14/09/15.
 */
public class MyCustomXAxisValueFormatter implements IAxisValueFormatter
{

    private DecimalFormat mFormat;
    private ViewPortHandler mViewPortHandler;

    public MyCustomXAxisValueFormatter(ViewPortHandler viewPortHandler) {
        mViewPortHandler = viewPortHandler;
        mFormat = new DecimalFormat("###,###,###,##0.0");
    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {

        final float xScale = mViewPortHandler.getScaleX();
        if (xScale > 5)
            return "4";
        else if (xScale > 3)
            return "3";
        else if (xScale > 1)
            return "2";
        else
            return mFormat.format(value);
    }
}
