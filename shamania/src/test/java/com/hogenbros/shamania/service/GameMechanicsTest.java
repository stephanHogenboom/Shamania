package com.hogenbros.shamania.service;

import com.hogenbros.shamania.model.Shaman;
import org.junit.Test;

import static com.hogenbros.shamania.service.GameMechanics.calculateMaxHealth;
import static org.assertj.core.api.Assertions.assertThat;


public class GameMechanicsTest {


    @Test
    public void testShamanHealthCalculations() {
        Shaman seriousBob = new Shaman("Serious bob", 100, 10, 9000);
        assertThat(calculateMaxHealth(seriousBob)).isEqualTo(1350); //100 + 100 * 10 + 25 * 10
        Shaman shackleShaman = new Shaman("Rhasta", 1, 10, 10);
        assertThat(calculateMaxHealth(shackleShaman)).isEqualTo(360); //100 + 1 * 10 + 25 * 10
    }

    @Test(expected = IllegalStateException.class)
    public void testNegativeValuesStregnth() {
        Shaman drunkenBob = new Shaman("wasted bobby", 1, -30 ,10);
        calculateMaxHealth(drunkenBob);
    }

    @Test(expected = IllegalStateException.class)
    public void testNegativeValuesLevel() {
        Shaman drunkenBob = new Shaman("wasted bobby", - 1, 30 ,10);
        calculateMaxHealth(drunkenBob);
    }

    @Test(expected = IllegalStateException.class)
    public void testNegativeValuesIntelligence() {
        Shaman drunkenBob = new Shaman("wasted bobby", 1, 30 ,- 10);
        calculateMaxHealth(drunkenBob);
    }
}