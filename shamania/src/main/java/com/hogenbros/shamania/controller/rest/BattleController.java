package com.hogenbros.shamania.controller.rest;

import com.hogenbros.shamania.acces.ShamanRepository;
import com.hogenbros.shamania.model.Shaman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
public class BattleController {

    @Autowired
    ShamanRepository shamanRepository;

    @PostMapping("/battle/shaman/{fullName}/action/{actionName}")
    public void handleBattleCommand(@PathVariable String fullName,
                                    @PathVariable String actionName,
                                    HttpServletResponse response) {
        Shaman shaman = shamanRepository.findShamanByFullName(fullName);

    }

}
