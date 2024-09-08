package com.zhang.design_model.simple_factory_pattern.unused;

/**
 * 未使用简单工厂模式
 */
public class Main {

    public static void main(String[] args) {
        // 暴露了内部实现的细节
        API api = new Impl();
        api.test();
    }
}
