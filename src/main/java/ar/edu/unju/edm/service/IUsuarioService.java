package ar.edu.unju.edm.service;

import ar.edu.unju.edm.model.Usuario;

public interface IUsuarioService {

		public void guardar();
		public Usuario mostrar();
		public void eliminar();
		public Usuario modificar();
	
}
