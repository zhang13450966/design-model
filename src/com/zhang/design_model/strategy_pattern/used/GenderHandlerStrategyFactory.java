package com.zhang.design_model.strategy_pattern.used;

import com.zhang.design_model.strategy_pattern.unused.GenderEnum;

import java.util.HashMap;
import java.util.Map;

public class GenderHandlerStrategyFactory {

    private static final Map<Integer, GenderHandlerStrategy> map = new HashMap<>();

    static {
        map.put(GenderEnum.MALE.getId(), new GenderHandlerMaleStrategy());
        map.put(GenderEnum.FEMALE.getId(), new GenderHandlerFemaleStrategy());
    }

    public GenderHandlerStrategy getType(Integer id) {

        if (id != null && map.containsKey(id)) {
            return map.get(id);
        }
        return null;
    }
}
