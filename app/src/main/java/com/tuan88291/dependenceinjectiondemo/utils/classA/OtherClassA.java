package com.tuan88291.dependenceinjectiondemo.utils.classA;

import android.util.Log;

public class OtherClassA implements iDoSomething {
    @Override
    public void showUpClassA(String msg) {
        Log.d("new msg from other", msg);

    }
}
