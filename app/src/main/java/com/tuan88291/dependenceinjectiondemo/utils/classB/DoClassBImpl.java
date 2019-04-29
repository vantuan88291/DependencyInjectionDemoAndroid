package com.tuan88291.dependenceinjectiondemo.utils.classB;

import android.util.Log;

public class DoClassBImpl implements iClassB {
    private static iClassB instance;
    public static iClassB getInstance(){
        if (instance == null){
            instance = new DoClassBImpl();
        }
        return instance;
    }
    @Override
    public void showUpClassB(String msg) {
        Log.d("new msg from class B", msg);

    }
}
