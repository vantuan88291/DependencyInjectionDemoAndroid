package com.tuan88291.dependenceinjectiondemo.container;

import com.tuan88291.dependenceinjectiondemo.utils.classA.ClassAhost;
import com.tuan88291.dependenceinjectiondemo.utils.classB.ClassBhost;

public interface iContainer {
    ClassAhost getClassA();
    ClassBhost getClassB();
}
