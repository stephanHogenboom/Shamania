package com.hogenbros.shamania.model;

import com.hogenbros.shamania.service.model.Role;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "shaman")
@Table(name = "shaman")
public class Shaman {

    @Id
    @Column(name = "full_name", unique = true)
    private String fullName;

    @Column(name = "level")
    private Integer level;

    @Column
    private Integer strength;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column
    private Integer intelligence;

    // default constructor used by frameworks as Jackson and Hibernate;
    public Shaman() {

    }

    public Shaman(String name, int lvl, int strength, int intelligence, Role role) {
        this.level = lvl;
        this.strength = strength;
        this.intelligence = intelligence;
        this.fullName = name;
        this.role = role;
    }

    @OneToMany(
            mappedBy="owner",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Skill> skillList = new ArrayList<>();

    public String getFullName() {
        return fullName;
    }

    public int getLevel() {
        return level;
    }

    public int getStrength() {
        return strength;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public List<Skill> getSkillList() {
        return skillList;
    }

    public Role getRole() {
        return role;
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "fullName='" + fullName + '\'' +
                ", level=" + level +
                ", strength=" + strength +
                ", role=" + role +
                ", intelligence=" + intelligence +
                '}';
    }
}
