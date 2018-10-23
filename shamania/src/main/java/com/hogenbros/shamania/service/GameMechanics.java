package com.hogenbros.shamania.service;

import com.hogenbros.shamania.model.Shaman;

public class GameMechanics {

    public static int caculateMaxHealth(Shaman shaman) {
        return  Math.abs(100 + 10 * shaman.getLevel() + shaman.getStrenght() * 25);
    }

}
