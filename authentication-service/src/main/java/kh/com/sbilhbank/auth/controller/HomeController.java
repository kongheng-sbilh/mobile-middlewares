package kh.com.sbilhbank.auth.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class HomeController {

    @GetMapping("/user")
    @PreAuthorize("hasRole('USER')")
    public String greeting() {
        return "Hello this message from AUTHENTICATION SERVICE";
    }

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ADMIN')")
    public String authenticateMessage() {
        return "Hello sir, this message from AUTHENTICATION SERVICE";
    }
}
