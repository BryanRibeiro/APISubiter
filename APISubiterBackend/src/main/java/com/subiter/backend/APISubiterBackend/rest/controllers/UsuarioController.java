package com.subiter.backend.APISubiterBackend.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import com.subiter.backend.APISubiterBackend.model.entity.Usuario;
import com.subiter.backend.APISubiterBackend.service.UsuarioService;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public List<Usuario> getAllUsers(){

        return usuarioService.getAllUsers();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario saveUser(@RequestBody @Valid Usuario usuario){

        return usuarioService.save(usuario);  
    }

    @GetMapping("/{id}")
    public Usuario getUserById(@PathVariable Integer id){

        return usuarioService.getUserById(id);
    }

}
