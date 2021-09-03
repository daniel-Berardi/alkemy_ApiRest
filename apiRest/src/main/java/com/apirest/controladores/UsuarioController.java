package com.apirest.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.apirest.Service.UsuarioService;
import com.apirest.entidades.Usuario;
import com.apirest.repositorios.UsuarioRepositorio;

@RestController
@RequestMapping("/user")
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@Autowired
	private UsuarioRepositorio usuarioRepo;
	
	
	
	@PostMapping("/registrar")
	public void registrarUsuario(@RequestParam String userName,@RequestParam String password,@RequestParam String email) {
		
		try {
			usuarioService.crearUsuario(userName, password, email);
			
		} catch (Exception e) {
			System.out.println("Error");
		}
		
		
		
	}
	
	@GetMapping("/usuarios")
	public List<Usuario> listar(){
		
		return usuarioRepo.findAll();
		
		
	}

}
