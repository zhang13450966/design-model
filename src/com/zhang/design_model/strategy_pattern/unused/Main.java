package com.zhang.design_model.strategy_pattern.unused;

import com.zhang.design_model.strategy_pattern.used.GenderEnum;

/**
 * 策略模式 去除 if else if 结构，使代码更整洁，更模块化
 */
public class Main {

    public static void main(String[] args) {

        int userInputId = 1 ;
        if (GenderEnum.MALE.getId() == userInputId) {
            // 算法1 假设100行
            System.out.println("执行男性处理类方法");
        } else if (GenderEnum.FEMALE.getId() == userInputId) {
            // 算法2 假设两百行
            System.out.println("执行女性处理类方法");
        }
    }
}
