package com.hogenbros.shamania.controller.rest;

import com.hogenbros.shamania.acces.ShamanRepository;
import com.hogenbros.shamania.model.Shaman;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class ShamanController {
    Logger logger = LoggerFactory.getLogger(ShamanController.class);

    @Autowired
    ShamanRepository shamanRepository;

    @PostMapping("/shaman/new/{fullName}")
    @CrossOrigin
    public void newShaman(@PathVariable String fullName, HttpServletResponse response) {
        logger.info("shackle");
        Shaman shaman = new Shaman();
        shaman.setFullName(fullName);
        shamanRepository.save(shaman);
        response.setStatus(200);
    }

}
