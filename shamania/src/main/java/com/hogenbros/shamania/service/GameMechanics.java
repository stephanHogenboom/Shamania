package com.hogenbros.shamania.service;

import com.hogenbros.shamania.model.Shaman;

public class GameMechanics {
    private static final int BASE_HEALTH = 100;
    private static final int HEALTH_PER_STRENGHT = 25;
    private static final int HEALTH_PER_LEVEL = 10;

    public static int calculateMaxHealth(Shaman shaman) {
        return  Math.abs(BASE_HEALTH + HEALTH_PER_LEVEL * shaman.getLevel() + shaman.getStrenght() * HEALTH_PER_STRENGHT);
    }

}
