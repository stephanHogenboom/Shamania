package com.hogenbros.shamania.controller.web;

import com.hogenbros.shamania.acces.ShamanRepository;
import com.hogenbros.shamania.model.Shaman;
import com.hogenbros.shamania.service.model.Hero;
import com.hogenbros.shamania.service.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BattleWebController {

    @Autowired
    ShamanRepository shamanRepository;

    @RequestMapping("/battle/start/{name}")
    public String startBattle(@RequestParam("name") String name, Model model) {
        Shaman shaman = shamanRepository.findShamanByFullName(name);
        Hero hero = new Hero(shaman.getFullName(), 100, 10, 10, Role.Conjurer);
        model.addAttribute("shaman", shaman);
        return "battle_menu";
    }
}
