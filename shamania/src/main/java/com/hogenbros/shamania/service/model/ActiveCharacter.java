package com.hogenbros.shamania.service.model;

public class ActiveCharacter extends Person{

    private int currentHp;
    private int Strength;
    private int intelligence;
    private int level;

    public ActiveCharacter(String name, int currentHp, int lvl, int strength, int intelligence, Role role) {
        super(name);
        this.level = lvl;
        this.currentHp = currentHp;
        Strength = strength;
        this.intelligence = intelligence;
        this.role = role;
    }

    private Role role;

    public ActiveCharacter() {
        super("Unknown");
    }

    public int getCurrentHp() {
        return currentHp;
    }

    public int getStrength() {
        return Strength;
    }

    public Role getRole() {
        return role;
    }

    public int getIntelligence() {
        return intelligence;
    }

}
