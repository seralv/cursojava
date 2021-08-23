package com.example.curso.controllers;

import java.util.ArrayList;
import java.util.List;

import com.example.curso.models.Usuario;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

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
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setId(32132L);
        usuario.setNombre("Lucas");
        usuario.setApellido("Moy");
        usuario.setEmail("lucas@site.com");
        usuario.setTelefono("12354648");
        
        Usuario usuario2 = new Usuario();
        usuario2.setId(32132L);
        usuario2.setNombre("Martin");
        usuario2.setApellido("Jofre");
        usuario2.setEmail("martin@site.com");
        usuario2.setTelefono("12331348");
        
        Usuario usuario3 = new Usuario();
        usuario3.setId(123123L);
        usuario3.setNombre("Penelope");
        usuario3.setApellido("Martinez");
        usuario3.setEmail("penelope@site.com");
        usuario3.setTelefono("796548");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
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

