package com.tuan88291.dependenceinjectiondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tuan88291.dependenceinjectiondemo.container.ContainerImpl;
import com.tuan88291.dependenceinjectiondemo.container.iContainer;

public class MainActivity extends AppCompatActivity {

    private iContainer injector;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        injector = new ContainerImpl();
        injector.getClassA().showUpClassA("this is class A");
        injector.getClassB().showUpClassB("this is class B");
    }
}
