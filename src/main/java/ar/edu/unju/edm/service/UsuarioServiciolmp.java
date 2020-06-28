package ar.edu.unju.edm.service;

import java.awt.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.IUsuario;

@Service
public class UsuarioServiciolmp implements IUsuarioService {

	@Autowired
	 IUsuario iusuario;
	
	@Override
	public void crear(Usuario unUsuario) {
		// TODO Auto-generated method stub
		System.out.println(unUsuario.getApellidoReal());
		iusuario.guardar();
	}


	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		iusuario.eliminar();
	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		Usuario usuario = iusuario.modificar();
		return usuario;
	}

	@Override
	public List Listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Usuario> encontrarUsuario(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
