package com.tuan88291.dependenceinjectiondemo.utils.classB;

import android.util.Log;

public class DoClassBImpl implements iClassB {
    @Override
    public void showUpClassB(String msg) {
        Log.d("new msg from class B", msg);

    }
}
