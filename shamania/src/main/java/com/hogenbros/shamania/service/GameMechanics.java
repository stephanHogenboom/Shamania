package com.hogenbros.shamania.service;

import com.hogenbros.shamania.model.Shaman;

public class GameMechanics {
    private static final int BASE_HEALTH = 100;
    private static final int HEALTH_PER_STRENGHT = 25;
    private static final int HEALTH_PER_LEVEL = 10;




    public static int calculateMaxHealth(Shaman shaman) {
        assertAllValuesArePositive(shaman);
        return  Math.abs(BASE_HEALTH + HEALTH_PER_LEVEL * shaman.getLevel() + shaman.getStrenght() * HEALTH_PER_STRENGHT);
    }

    private static void assertAllValuesArePositive(Shaman shaman) {
        if (shaman.getStrenght() < 0) {
            throw new IllegalStateException("Strength cannot be lower than zero!");
        }
        if (shaman.getLevel() < 0) {
            throw new IllegalStateException("level cannot be lower than zero!");
        }
        if (shaman.getIntelligence() < 0) {
            throw new IllegalStateException("intelligence cannot be lower than zero!");
        }
    }
}
