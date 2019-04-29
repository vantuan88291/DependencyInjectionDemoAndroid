package com.tuan88291.dependenceinjectiondemo.container;

import com.tuan88291.dependenceinjectiondemo.utils.classA.DoSomethingHost;
import com.tuan88291.dependenceinjectiondemo.utils.classB.DoClassBImplHost;

public interface iContainer {
    DoSomethingHost getClassA();
    DoClassBImplHost getClassB();
}
