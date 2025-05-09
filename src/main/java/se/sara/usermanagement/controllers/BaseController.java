package se.sara.usermanagement.controllers;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.core.user.OAuth2User;

public class BaseController {
    public String getLoggedInEmail() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if (auth != null && auth.getPrincipal() instanceof OAuth2User) {
            OAuth2User user = (OAuth2User) auth.getPrincipal();
            if (user != null) {
                Object email = user.getAttribute("email");
                return email != null ? email.toString() : null;
            }
        }
        return null;
    }
}
