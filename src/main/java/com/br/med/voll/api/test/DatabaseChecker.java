package com.br.med.voll.api.test;

import com.br.med.voll.api.domain.usuario.UsuarioRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class DatabaseChecker {

    private final UsuarioRepository usuarioRepository;

    @Autowired
    public DatabaseChecker(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }
    @PostConstruct
    public void checkDatabaseAccess() {
        try {
            usuarioRepository.findAll();
            System.out.println("Database access: Success");
            System.out.println(usuarioRepository.findByLogin("joao.carlos@voll.med").getUsername());
            System.out.println(usuarioRepository.findByLogin("joao.carlos@voll.med").getPassword());
        } catch (Exception e) {
            System.err.println("Database access: Failed");
            e.printStackTrace();
        }
    }
}