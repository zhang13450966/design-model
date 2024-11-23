package com.zhang.design_model.strategy_pattern.used;

public class GenderHandlerFemaleStrategy implements GenderHandlerStrategy {
    @Override
    public void genderHandler() {
        // 两百行代码
        System.out.println("执行了女性处理类代码");
    }
}
