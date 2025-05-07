package se.sara.usermanagement.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import java.util.ArrayList;

@Controller
public class LoginController {

    public String getLoginPage(Model model  ) {
        return "login";

    }
}

