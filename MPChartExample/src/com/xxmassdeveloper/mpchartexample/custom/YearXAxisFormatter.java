package com.xxmassdeveloper.mpchartexample.custom;

import com.github.mikephil.charting.components.AxisBase;
import com.github.mikephil.charting.formatter.IAxisValueFormatter;

/**
 * * Created by Jairo Rojas (jairo.rafa.1997@gmail.com) on 14/09/15.
 */
public class YearXAxisFormatter implements IAxisValueFormatter
{

    protected String[] mMonths = new String[]{
            "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dec"
    };

    public YearXAxisFormatter() {

    }

    @Override
    public String getFormattedValue(float value, AxisBase axis) {

        float percent = value / axis.mAxisRange;
        return mMonths[(int) (mMonths.length * percent)];
    }
}
