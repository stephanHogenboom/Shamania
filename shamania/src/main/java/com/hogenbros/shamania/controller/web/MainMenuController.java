package com.hogenbros.shamania.controller.web;

import com.hogenbros.shamania.acces.ShamanRepository;
import com.hogenbros.shamania.model.Shaman;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainMenuController {

    private Logger LOGGER = LoggerFactory.getLogger(MainMenuController.class);

    @Autowired
    ShamanRepository repository;

    @RequestMapping("/")
    public String toMainMenu() {
        LOGGER.info("returning main menu brah");
        return "main_menu";
    }

    @RequestMapping("/start")
    public String toGamePage(@RequestParam("name") String name, Model model) {
        if (name != null) {
            Shaman shaman = repository.findShamanByFullName(name);
            model.addAttribute("shaman", shaman);
        }
        LOGGER.info("starting the game, brah");
        return "start";
    }
}
