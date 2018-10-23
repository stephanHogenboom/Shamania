package com.hogenbros.shamania.service;

import com.hogenbros.shamania.model.Shaman;
import com.hogenbros.shamania.service.model.Hero;

public class GameMechanics {
    private static final int BASE_HEALTH = 100;
    private static final int HEALTH_PER_STRENGTH = 25;
    private static final int HEALTH_PER_LEVEL = 10;


    public static int calculateMaxHealth(Shaman shaman) {
        assertAllValuesArePositive(shaman);
        return  Math.abs(BASE_HEALTH + HEALTH_PER_LEVEL * shaman.getLevel() + shaman.getStrength() * HEALTH_PER_STRENGTH);
    }

    public static Hero shamanToHero(Shaman shaman) {
        return new Hero(
                shaman.getFullName(),
                GameMechanics.calculateMaxHealth(shaman),
                shaman.getLevel(),
                shaman.getStrength(),
                shaman.getIntelligence(),
                shaman.getRole());
    }

    private static void assertAllValuesArePositive(Shaman shaman) {
        if (shaman.getStrength() < 0) {
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
