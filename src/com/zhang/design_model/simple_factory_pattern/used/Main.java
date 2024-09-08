package com.zhang.design_model.simple_factory_pattern.used;

/**
 * 使用简单工厂模式
 * 当产品增加时不需要修改客户端代码，只需要增加产品类和修改工厂类
 * 但是当产品类增加时，需要修改工厂类，违背了开闭原则
 * 所以简单工厂模式只适用于产品类比较少的情况
 */
public class Main {

    public static void main(String[] args) {
        //通过工厂创建一个产品对象
        API api = Factory.createApi(Impl1.class);
        //调用产品对象的方法
        api.test();
    }
}
