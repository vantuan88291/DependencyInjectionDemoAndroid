package com.tuan88291.dependenceinjectiondemo.utils.classA;

public class DoSomethingHost {
    private iDoSomething something;
    public DoSomethingHost(iDoSomething something){
        this.something = something;
    }
    public void showUp(String msg){
        something.showUpClassA(msg);
    }
}
