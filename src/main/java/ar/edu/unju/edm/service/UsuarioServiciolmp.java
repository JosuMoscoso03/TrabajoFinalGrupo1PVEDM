package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.repository.IUsuario;

@Repository
public class UsuarioServiciolmp implements IUsuarioService {

	@Autowired
	private IUsuario iusuario;
	
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		iusuario.guardar();
	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		Usuario usuario = iusuario.mostrar();	
		return usuario;
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

}
