package com.zhang.design_model.simple_factory_pattern.unused;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 未使用简单工厂
 */
public class Impl implements API {

    Logger logger = Logger.getLogger(getClass().getName());
    @Override
    public void test() {

        logger.log(Level.INFO, "未使用简单工厂");
    }
}
