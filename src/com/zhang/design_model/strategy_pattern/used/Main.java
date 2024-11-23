package com.zhang.design_model.strategy_pattern.used;

public class Main {

    public static void main(String[] args) {
        int userInputId = 2 ; // 用户输入的值，数据库存储的是1所以
        GenderHandlerStrategy strategy = new GenderHandlerStrategyFactory().getType(userInputId);
        if (strategy != null) {
            strategy.genderHandler();
        }
    }
}
