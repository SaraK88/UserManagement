package se.sara.usermanagement.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.sara.usermanagement.models.PlayerRepository;

import java.util.ArrayList;
import java.util.List;

@Controller()
public class HomeController extends BaseController{
    @Autowired
    private PlayerRepository playerRepository;

    @GetMapping("/")
    public String home(Model model) {

        String user = getLoggedInEmail();
        model.addAttribute("players", playerRepository.findAll());
        model.addAttribute("user", user);
        return "home";
    }
    @GetMapping("/profile")
    public String profile(Model model) {
        String user =getLoggedInEmail();
        model.addAttribute("user",user);
        return "profile";
    }

    @GetMapping("/admin")
    public String admin(Model model) {
        String user = getLoggedInEmail();
        model.addAttribute("user", user);
        return "admin";
    }
}
