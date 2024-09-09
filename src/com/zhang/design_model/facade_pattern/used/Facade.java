package com.zhang.design_model.facade_pattern.used;

import com.zhang.design_model.facade_pattern.unused.AModuleAPIImpl;
import com.zhang.design_model.facade_pattern.unused.BModuleAPIImpl;
import com.zhang.design_model.facade_pattern.unused.CModuleAPIImpl;

public class Facade {

    public void helloWorld() {
        // 组合
        new AModuleAPIImpl().componentA();
        new BModuleAPIImpl().componentB();
        new CModuleAPIImpl().componentC();
    }
}
