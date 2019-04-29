package com.tuan88291.dependenceinjectiondemo.container;

import com.tuan88291.dependenceinjectiondemo.utils.classA.DoSomething;
import com.tuan88291.dependenceinjectiondemo.utils.classA.iDoSomething;
import com.tuan88291.dependenceinjectiondemo.utils.classB.DoClassBImpl;
import com.tuan88291.dependenceinjectiondemo.utils.classB.iClassB;

public class ContainerImpl implements iContainer {
    private static ContainerImpl instance;
    public static ContainerImpl getInstance(){
        if (instance == null){
            synchronized(ContainerImpl.class) {
                if(null == instance) {
                    instance  = new ContainerImpl();
                }
            }
        }
        return instance;
    }
    @Override
    public iDoSomething getClassA() {
        return DoSomething.getInstance();
    }

    @Override
    public iClassB getClassB() {
        return DoClassBImpl.getInstance();
    }
}
