package com.hogenbros.shamania.controller.rest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.hogenbros.shamania.acces.ShamanRepository;
import com.hogenbros.shamania.model.Shaman;
import com.hogenbros.shamania.service.GameMechanics;
import com.hogenbros.shamania.service.model.Hero;
import com.hogenbros.shamania.service.model.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Stephan Hogenboom
 * Simple RestController that is used to create and update shaman entities
 */

@RestController
public class ShamanController {
    private static final Logger LOG = LoggerFactory.getLogger(ShamanController.class);
    private static final int START_LEVEL = 1;
    private static final int START_STRENGTH = 10;
    private static final int START_INTELLIGENCE = 10;
    private static final ObjectMapper MAPPER = new ObjectMapper();
    private static final Role STARTING_ROLE = Role.Conjurer;

    @Autowired
    ShamanRepository shamanRepository;

    @PostMapping("/shaman/new/{fullName}")
    @CrossOrigin
    public void newShaman(@PathVariable String fullName, HttpServletResponse response) {
        if (fullName == null || fullName.trim().isEmpty()) {
            throw new IllegalStateException("FullName should not be empty!");
        }
        LOG.info("creating new shaman with name= %s", fullName);
        Shaman shaman = new Shaman(fullName, START_LEVEL, START_STRENGTH, START_INTELLIGENCE);
        shamanRepository.save(shaman);
        Hero hero = new Hero(
                shaman.getFullName(),
                GameMechanics.caculateMaxHealth(shaman),
                shaman.getStrenght(),
                shaman.getIntelligence(),
                STARTING_ROLE);
        try {
            String heroAsJson = MAPPER.writeValueAsString(hero);
            response.setHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE);
            response.getOutputStream().write(heroAsJson.getBytes());
        } catch (IOException e) {
            response.setStatus(500);
        }
    }
}
