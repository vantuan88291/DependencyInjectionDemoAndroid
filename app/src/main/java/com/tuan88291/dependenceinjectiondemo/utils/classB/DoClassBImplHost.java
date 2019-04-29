package com.tuan88291.dependenceinjectiondemo.utils.classB;

public class DoClassBImplHost {
    private iClassB classB;
    public DoClassBImplHost(iClassB classB){
        this.classB = classB;
    }
    public void showUp(String msg){
        this.classB.showUpClassB(msg);
    }
}
