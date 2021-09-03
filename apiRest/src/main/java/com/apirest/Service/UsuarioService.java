package com.apirest.Service;

import java.io.IOException;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apirest.entidades.Usuario;
import com.apirest.repositorios.UsuarioRepositorio;

@Service
@Transactional
public class UsuarioService {
	
	
	@Autowired
	private UsuarioRepositorio usuarioRepo;
	
	@Autowired
	private MailService mail;
	
	
	public String crearUsuario(String userName,String password,String email) throws IOException {
		
		
		Usuario user = new Usuario();
		
		user.setUserName(userName);
		user.setPassword(password);
		user.setEmail(email);
		
		usuarioRepo.save(user);
		
		mail.sendTextEmail(email);
		return "Usuario Registrado con exito y mail enviado(en teoria)";
		
		
		
		
		
	}

}
