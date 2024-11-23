package com.zhang.design_model.strategy_pattern.unused;

public enum GenderEnum {

    MALE(1, "男"), FEMALE(2, "女");

    private int id;
    private String name;

    private GenderEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
