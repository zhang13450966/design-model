package com.zhang.design_model.strategy_pattern.used;

public class GenderHandlerMaleStrategy implements GenderHandlerStrategy{

    @Override
    public void genderHandler() {
        // 100行代码
        System.out.println("执行了男性处理类方法");
    }

}
