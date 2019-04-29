package com.tuan88291.dependenceinjectiondemo.container;

import com.tuan88291.dependenceinjectiondemo.utils.classA.DoSomething;
import com.tuan88291.dependenceinjectiondemo.utils.classA.OtherClassA;
import com.tuan88291.dependenceinjectiondemo.utils.classA.iDoSomething;
import com.tuan88291.dependenceinjectiondemo.utils.classB.DoClassBImpl;
import com.tuan88291.dependenceinjectiondemo.utils.classB.iClassB;

public class ContainerImpl implements iContainer {
    @Override
    public iDoSomething getClassA() {
        return new DoSomething();
//        return new OtherClassA();
    }

    @Override
    public iClassB getClassB() {
        return new DoClassBImpl();
    }
}
