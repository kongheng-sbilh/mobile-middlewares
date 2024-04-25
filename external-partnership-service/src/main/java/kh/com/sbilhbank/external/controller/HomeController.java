package kh.com.sbilhbank.external.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/eps")
public class HomeController {

    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String greetingForAdmin() {
        return "Hello sir, this message from EXTERNAL-PARTNERSHIP-SERVICE!";
    }

    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String greetingForUser() {
        return "Hello this message from EXTERNAL-PARTNERSHIP-SERVICE!";
    }
}
