package com.tuan88291.dependenceinjectiondemo.container;

import com.tuan88291.dependenceinjectiondemo.utils.classA.DoSomething;
import com.tuan88291.dependenceinjectiondemo.utils.classA.DoSomethingHost;
import com.tuan88291.dependenceinjectiondemo.utils.classB.DoClassBImpl;
import com.tuan88291.dependenceinjectiondemo.utils.classB.DoClassBImplHost;

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
    public DoSomethingHost getClassA() {
        return new DoSomethingHost(new DoSomething());
    }

    @Override
    public DoClassBImplHost getClassB() {
        return new DoClassBImplHost(new DoClassBImpl());
    }
}
