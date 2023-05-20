package com.bloc3.vitrine_produits_promo.REST;

import com.bloc3.vitrine_produits_promo.config.AuthenticationRequest;
import com.bloc3.vitrine_produits_promo.config.AuthenticationResponse;
import com.bloc3.vitrine_produits_promo.config.AuthenticationService;
import com.bloc3.vitrine_produits_promo.config.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor

public class AuthenticationController {

    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register (
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }


    @CrossOrigin(origins = "http://localhost:8080", allowCredentials = "true")
    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate (
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));

    }
}
