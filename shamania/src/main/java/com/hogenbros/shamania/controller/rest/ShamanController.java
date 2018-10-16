package com.hogenbros.shamania.controller.rest;

import com.hogenbros.shamania.acces.ShamanRepository;
import com.hogenbros.shamania.model.Shaman;
import com.hogenbros.shamania.service.model.Hero;
import com.hogenbros.shamania.service.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ShamanController {

    @Autowired
    ShamanRepository shamanRepository;

    @PostMapping("/shaman/new/{fullName")
    @CrossOrigin
    public void newShaman(@RequestParam String name, HttpServletResponse response) {
        Shaman shaman = new Shaman();
        shaman.setFullName(name);
        shamanRepository.save(shaman);
        Hero hero = new Hero(name, 100, 10,  10, Role.Conjurer);
    }

}
