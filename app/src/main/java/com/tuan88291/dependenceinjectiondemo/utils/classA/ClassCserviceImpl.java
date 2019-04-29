package com.tuan88291.dependenceinjectiondemo.utils.classA;

import android.util.Log;

public class ClassCserviceImpl implements ClassAservice {
    @Override
    public void showUpClassA(String msg) {
        Log.d("new msg from class C", msg);

    }
}
