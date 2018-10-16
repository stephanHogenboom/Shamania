package com.hogenbros.shamania.service.model;

public class ActiveCharacter extends Person{

    private int currentHp;
    private int Strength;
    private Role role;

    public ActiveCharacter(String name, int currentHp, int strength, Role role) {
        super(name);
        this.currentHp = currentHp;
        Strength = strength;
        this.role = role;
    }

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
}
