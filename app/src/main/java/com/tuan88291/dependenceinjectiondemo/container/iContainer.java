package com.tuan88291.dependenceinjectiondemo.container;

import com.tuan88291.dependenceinjectiondemo.utils.classA.iDoSomething;
import com.tuan88291.dependenceinjectiondemo.utils.classB.iClassB;

public interface iContainer {
    iDoSomething getClassA();
    iClassB getClassB();
}
