package com.hogenbros.shamania.controller.rest;

import com.hogenbros.shamania.acces.ShamanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
public class ShamanController {

    @Autowired
    ShamanRepository shamanRepository;



    @PostMapping("shaman/save")
    @CrossOrigin
    public void saveShaman(HttpServletRequest request, HttpServletResponse response) {

    }

}
