package com.hogenbros.shamania.controller.web;

import com.hogenbros.shamania.acces.ShamanRepository;
import com.hogenbros.shamania.model.Shaman;
import com.hogenbros.shamania.service.GameMechanics;
import com.hogenbros.shamania.service.model.Hero;
import com.hogenbros.shamania.service.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import static com.hogenbros.shamania.service.GameMechanics.*;

@Controller
public class BattleWebController {

    @Autowired
    ShamanRepository shamanRepository;

    @RequestMapping("/battle/start/{name}")
    public String startBattle(@PathVariable("name") String name, Model model) {
        Shaman shaman = shamanRepository.findShamanByFullName(name);
        Hero hero = shamanToHero(shaman);
        model.addAttribute("hero", hero);
        return "battle_menu";
    }
}
