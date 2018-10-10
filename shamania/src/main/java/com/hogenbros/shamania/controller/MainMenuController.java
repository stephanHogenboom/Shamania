package com.hogenbros.shamania.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class MainMenuController {

    private Logger LOGGER = LoggerFactory.getLogger(MainMenuController.class);

    @RequestMapping("/main")
    public String getToDoPage(Model model) {
        LOGGER.info("returning main menu brah");
        return "main_menu";
    }
}
