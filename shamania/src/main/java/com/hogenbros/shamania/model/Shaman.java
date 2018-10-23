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
    private int level;

    @Column
    private int strenght;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column
    private int intelligence;

    public Shaman(String name, int lvl, int strenght, int intelligence, Role role) {
        this.level = lvl;
        this.strenght = strenght;
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

    public int getStrenght() {
        return strenght;
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
}
