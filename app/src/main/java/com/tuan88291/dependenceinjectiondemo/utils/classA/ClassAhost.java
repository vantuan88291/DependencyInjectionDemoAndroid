package com.tuan88291.dependenceinjectiondemo.utils.classA;

public class ClassAhost {
    private ClassAservice something;
    public ClassAhost(ClassAservice something){
        this.something = something;
    }
    public void showUp(String msg){
        something.showUpClassA(msg);
    }
}
