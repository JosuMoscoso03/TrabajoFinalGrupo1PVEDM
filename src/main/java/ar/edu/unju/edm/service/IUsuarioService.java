package ar.edu.unju.edm.service;

import java.awt.List;
import java.util.Optional;

import ar.edu.unju.edm.model.Usuario;

public interface IUsuarioService {
	
		public void crear(Usuario unUsuario);
		public List Listar();
		public void eliminar();
		public Usuario modificar();
		public Optional<Usuario> encontrarUsuario(Long id);
	
}
