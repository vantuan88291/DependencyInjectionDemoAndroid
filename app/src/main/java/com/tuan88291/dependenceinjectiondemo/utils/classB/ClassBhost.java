package com.tuan88291.dependenceinjectiondemo.utils.classB;

public class ClassBhost {
    private ClassBservice classB;
    public ClassBhost(ClassBservice classB){
        this.classB = classB;
    }
    public void showUp(String msg){
        this.classB.showUpClassB(msg);
    }
}
