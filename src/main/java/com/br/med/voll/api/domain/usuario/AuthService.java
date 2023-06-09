package com.br.med.voll.api.domain.usuario;

import com.br.med.voll.api.infra.exception.TratadorDeErros;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class AuthService implements UserDetailsService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException  {
        System.out.println("Inside loadUserByUsername method");
        return repository.findByLogin(login);
    }
}
