package ar.edu.unju.edm.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.TrabajoFinalGrupo1PvedmApplication;
import ar.edu.unju.edm.model.Usuario;

@Repository("usuariolmp")
public class Usuariolmp implements IUsuario {
	
	@Autowired
	private Usuario usuario;

	public static Logger LOG = LoggerFactory.getLogger(TrabajoFinalGrupo1PvedmApplication.class);
	
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		LOG.info("El usuario  fue guardado " + usuario.getNombreUsuario());
	}

	@Override
	public Usuario mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos del usuario");
		return usuario;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se elimino el usuario ");

	}

	@Override
	public Usuario modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
