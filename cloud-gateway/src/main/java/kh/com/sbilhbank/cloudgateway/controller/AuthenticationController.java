package kh.com.sbilhbank.cloudgateway.controller;

import kh.com.sbilhbank.cloudgateway.model.AuthenticationResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.security.oauth2.core.oidc.user.OidcUser;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class AuthenticationController {

    @GetMapping("/token")
    public ResponseEntity<AuthenticationResponse> login(
        @AuthenticationPrincipal OidcUser oidcUser,
        Model model,
        @RegisteredOAuth2AuthorizedClient("yyyyyy")
        OAuth2AuthorizedClient client
    ) {
        AuthenticationResponse authenticationResponse
            = AuthenticationResponse.builder()
            .userId(oidcUser.getEmail())
            .accessToken(client.getAccessToken().getTokenValue())
            .refreshToken(client.getRefreshToken().getTokenValue())
            .expiresAt(client.getAccessToken().getExpiresAt().getEpochSecond())
            .build();
        return new ResponseEntity<>(authenticationResponse, HttpStatus.OK);
    }
}
