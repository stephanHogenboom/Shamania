package com.hogenbros.shamania.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity(name = "shaman")
@Table(name = "shaman")
public class Shaman {

    @Id
    @Column(name = "full_name", unique = true)
    private String fullName;

    @Column
    private int strenght;

    @Column
    private int intelligence;

    @OneToMany(
            mappedBy="owner",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Skill> skillList = new ArrayList<>();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}
