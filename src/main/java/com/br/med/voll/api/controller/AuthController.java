package com.br.med.voll.api.controller;

import com.br.med.voll.api.domain.usuario.DadosAuth;
import com.br.med.voll.api.domain.usuario.Usuario;
import com.br.med.voll.api.infra.security.TokenService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/login")
public class AuthController {

    @Autowired
    private AuthenticationManager manager;

    @Autowired
    private TokenService tokenService;

    @PostMapping
    public ResponseEntity efetuarLogin(@RequestBody @Valid DadosAuth dados){
        System.out.println("Efetuar Login");
        var token = new UsernamePasswordAuthenticationToken(dados.login(), dados.senha());
        var authentication = manager.authenticate(token);

        return ResponseEntity.ok(tokenService.gerarToken((Usuario) authentication.getPrincipal()));
    }


}
