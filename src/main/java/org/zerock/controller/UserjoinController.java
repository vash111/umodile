package org.zerock.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lombok.extern.log4j.Log4j;

@Controller
@RequestMapping("/user")
public class UserjoinController {

    @GetMapping("/join")
    public String userLogin(Model model) {
        return "user/join";  
    }
    
    @GetMapping("/Edit")
    public String userEdit(Model model) {
        return "user/Edit";  
    }
    
}