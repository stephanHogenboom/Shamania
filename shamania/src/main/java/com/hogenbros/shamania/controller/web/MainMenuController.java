package com.hogenbros.shamania.controller.web;

import com.hogenbros.shamania.acces.PersonRepository;
import com.hogenbros.shamania.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainMenuController {

    private Logger LOGGER = LoggerFactory.getLogger(MainMenuController.class);

    @Autowired
    PersonRepository repository;

    @RequestMapping("/main")
    public String toMainMenu() {
        LOGGER.info("returning main menu brah");
        return "main_menu";
    }

    @RequestMapping("/start")
    public String toGamePage(@RequestParam("id") long id, Model model) {
        if (id != 0L) {
            Person person = repository.findPersonById(id);
            model.addAttribute("person", person);
        }
        LOGGER.info("starting the game, brah");
        return "start";
    }
}
