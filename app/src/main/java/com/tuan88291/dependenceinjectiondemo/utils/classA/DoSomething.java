package com.tuan88291.dependenceinjectiondemo.utils.classA;

import android.util.Log;

public class DoSomething implements iDoSomething {
    private static iDoSomething instance;
    public static iDoSomething getInstance(){
        if (instance == null){
            instance = new DoSomething();
        }
        return instance;
    }
    @Override
    public void showUpClassA(String msg) {
        Log.d("new msg from class A", msg);
    }
}
