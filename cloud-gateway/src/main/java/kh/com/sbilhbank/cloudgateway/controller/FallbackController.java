package kh.com.sbilhbank.cloudgateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {

    @GetMapping("/authServiceFallBack")
    public String authServiceFallBack() {
        return "Authentication Service is down!";
    }

    @GetMapping("/cmsServiceFallBack")
    public String cmsServiceFallBack() {
        return "Card Management Service is down!";
    }

    @GetMapping("/cbsServiceFallBack")
    public String cbsServiceFallBack() {
        return "Core Banking Service is down!";
    }

    @GetMapping("/epsServiceFallBack")
    public String epsServiceFallBack() {
        return "External Partnership Service is down!";
    }
}
