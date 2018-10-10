package com.hogenbros.shamania.service;

import com.hogenbros.shamania.model.Person;
import com.hogenbros.shamania.model.PersonBuilder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameMechanics {
    BufferedReader br;
    Person protagonist;

    public static void main(String[] args) throws IOException {
        GameMechanics gm = new GameMechanics();
        gm.onStartUp();
    }

    private void onStartUp() throws IOException {
        br = new BufferedReader(new InputStreamReader(System.in));
        printStartTextAndCreateProtagonist();

    }

    private void printStartTextAndCreateProtagonist() {
        printSlowly("Hello there stranger, welcome to Shamania!");
        printSlowly("You seem to have a lot of affinity with spiritual realm!");
        printSlowly("What is your name?");
        try {
            String name = br.readLine();
            protagonist = PersonBuilder
                    .create()
                    .withName(name)
                    .build();
            printSlowly(String.format("Welcome %s! \n", protagonist.getName()));
        } catch (Exception e) {
            System.out.println("Exception happend with cause:" + e.getCause());
            e.printStackTrace();
        }
    }

    private void printSlowly(String text) {
        for (int i = 0; i < text.length(); ++i) {
            System.out.print(text.charAt(i));
            try {
                Thread.sleep( 40);
            } catch (InterruptedException e) {
                System.err.println("Error ! " + e.getMessage());
            }
        }
        System.out.println();
    }


}
