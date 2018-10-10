package com.hogenbros.shamania.service;

import com.hogenbros.shamania.model.Person;
import com.hogenbros.shamania.model.PersonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GameMechanics {
    BufferedReader br;
    Person protagonist;

    public static void main(String[] args) throws IOException {
        GameMechanics gm = new GameMechanics();
        gm.onStartUp();
    }

    private void onStartUp() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        printStartText();

    }

    private void printStartText() {
        System.out.println("Hello there stranger, welcome to Shamania!");
        System.out.println("You seem to have a lot of affinity with spiritual realm!");
        System.out.println("What is your name?");
        try {
            String name = br.readLine();
            protagonist = PersonBuilder
                    .create()
                    .withName(name)
                    .build();
            System.out.printf("Welcome %s! \n", protagonist.getName());
        } catch (Exception e) {
            System.out.println("Exception happend with cause:" + e.getCause());
            e.printStackTrace();
        }
    }



}
