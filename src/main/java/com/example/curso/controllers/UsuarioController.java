package com.example.curso.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.curso.dao.UsuarioDao;
import com.example.curso.models.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id) {
        Usuario usuario = new Usuario();
        usuario.setId(id);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucas@site.com");
        usuario.setTelefono("12354648");
        return usuario;
    }
    
    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        return usuarioDao.getUsuarios();
    }
    
    // @RequestMapping(value = "usuario")
    // public Usuario editar() {
    //     Usuario usuario = new Usuario();
    //     usuario.setNombre("Lucas");
    //     usuario.setApellido("Moy");
    //     usuario.setEmail("lucas@site.com");
    //     usuario.setTelefono("12354648");
    //     return usuario;
    // }
    
    // @RequestMapping(value = "usuario")
    // public Usuario eliminar() {
    //     Usuario usuario = new Usuario();
    //     usuario.setNombre("Lucas");
    //     usuario.setApellido("Moy");
    //     usuario.setEmail("lucas@site.com");
    //     usuario.setTelefono("12354648");
    //     return usuario;
    // }
    
    // @RequestMapping(value = "usuario")
    // public Usuario buscar() {
    //     Usuario usuario = new Usuario();
    //     usuario.setNombre("Lucas");
    //     usuario.setApellido("Moy");
    //     usuario.setEmail("lucas@site.com");
    //     usuario.setTelefono("12354648");
    //     return usuario;
    // }
    
}

