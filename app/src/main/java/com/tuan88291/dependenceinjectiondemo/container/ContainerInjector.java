package com.tuan88291.dependenceinjectiondemo.container;

import com.tuan88291.dependenceinjectiondemo.utils.classA.ClassAserviceImpl;
import com.tuan88291.dependenceinjectiondemo.utils.classA.ClassAhost;
import com.tuan88291.dependenceinjectiondemo.utils.classA.ClassCserviceImpl;
import com.tuan88291.dependenceinjectiondemo.utils.classB.ClassBserviceImpl;
import com.tuan88291.dependenceinjectiondemo.utils.classB.ClassBhost;

public class ContainerInjector implements iContainer {
    private static ContainerInjector instance;
    public static ContainerInjector getInstance(){
        if (instance == null){
            synchronized(ContainerInjector.class) {
                if(null == instance) {
                    instance  = new ContainerInjector();
                }
            }
        }
        return instance;
    }
    @Override
    public ClassAhost getClassA() {
        return new ClassAhost(new ClassAserviceImpl());
//        return new ClassAhost(new ClassCserviceImpl());
    }

    @Override
    public ClassBhost getClassB() {
        return new ClassBhost(new ClassBserviceImpl());
    }
}
