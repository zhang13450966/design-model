package com.zhang.design_model.simple_factory_pattern.used;

/**
 * 使用简单工厂模式
 * 该接口的实现细节被屏蔽
 */
public class Impl1 implements API{
    @Override
    public void test() {
        System.out.println("Impl1");
    }
}
