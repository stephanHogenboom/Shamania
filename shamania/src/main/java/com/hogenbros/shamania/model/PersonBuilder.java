package com.hogenbros.shamania.model;

public class PersonBuilder {
    private Person person;

    public static PersonBuilder create() {
        return new PersonBuilder();
    }

    private PersonBuilder() {
        this.person = new Person();
    }

    public PersonBuilder withName(String name) {
        this.person.setName(name);
        return this;
    }

    public Person build() {
        return this.person;
    }
}
