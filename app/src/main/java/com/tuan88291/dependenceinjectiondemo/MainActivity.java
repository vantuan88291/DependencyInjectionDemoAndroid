package com.tuan88291.dependenceinjectiondemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tuan88291.dependenceinjectiondemo.container.showMsg;
import com.tuan88291.dependenceinjectiondemo.utils.classA.ClassAserviceImpl;
import com.tuan88291.dependenceinjectiondemo.utils.classB.ClassBserviceImpl;

public class MainActivity extends AppCompatActivity {

    private showMsg msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        msg = new showMsg(new ClassAserviceImpl(), new ClassBserviceImpl());
        msg.showAmsgFromA("test class A");
    }
}
