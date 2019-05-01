package com.tuan88291.dependenceinjectiondemo.container;

import com.tuan88291.dependenceinjectiondemo.utils.classA.ClassAservice;
import com.tuan88291.dependenceinjectiondemo.utils.classB.ClassBservice;

public class showMsg {
    private ClassAservice classAservice;
    private ClassBservice classBservice;
    public showMsg(ClassAservice classAservice, ClassBservice classBservice){
        this.classAservice = classAservice;
        this.classBservice = classBservice;
    }

    public void showAmsgFromA(String msg){
        classAservice.showUpClassA(msg);
    }
}
