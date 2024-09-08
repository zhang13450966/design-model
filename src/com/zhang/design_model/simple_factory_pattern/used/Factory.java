package com.zhang.design_model.simple_factory_pattern.used;

public class Factory {

    private Factory() {
        throw new IllegalStateException("Utility class");
    }

    public static <T> API createApi(Class<T> tClass){

        if(tClass == Impl1.class){
            return new Impl1();
        }else if(tClass == Impl2.class){
            return new Impl2();
        }else{
            throw new IllegalArgumentException("参数错误");
        }
    }
}
