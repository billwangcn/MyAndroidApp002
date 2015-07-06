package com.example.root.myapplication002;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by root on 7/6/15.
 */
public class MyUtils {

    /**
     * @return YYYY-MM-DD style date.
     */
    public static String getDate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }

}

