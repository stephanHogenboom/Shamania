package com.hogenbros.shamania.service.model;

abstract public class Person {

    private String name;

    protected Person(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }
    protected void setName(String name) {
        this.name = name;
    }
}
