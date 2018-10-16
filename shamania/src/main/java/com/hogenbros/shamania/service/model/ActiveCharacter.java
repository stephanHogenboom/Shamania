package com.hogenbros.shamania.service.model;

public class ActiveCharacter extends Person{

    private int currentHp;
    private int Strength;
    private int intelligence;

    public ActiveCharacter(String name, int currentHp, int strength, int intelligence, Role role) {
        super(name);
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

    public void setCurrentHp(int currentHp) {
        this.currentHp = currentHp;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}
