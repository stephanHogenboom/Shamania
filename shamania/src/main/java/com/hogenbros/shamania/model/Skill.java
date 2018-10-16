package com.hogenbros.shamania.model;


import javax.persistence.*;

@Entity(name = "skill")
@Table(name = "skill")
public class Skill {

    @Id
    @Column(name = "skill_name")
    private String name;

    @ManyToOne
    @JoinColumn(name="full_name")
    private Shaman owner;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
