package ar.edu.unju.edm.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ar.edu.unju.edm.TrabajoFinalGrupo1PvedmApplication;
import ar.edu.unju.edm.model.Persona;

@Repository("personalmp")
public class Personalmp implements IPersona {
	@Autowired
	private Persona persona;

	public static Logger LOG = LoggerFactory.getLogger(TrabajoFinalGrupo1PvedmApplication.class);
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		LOG.info("La persona fue agregada " + persona.getNombres());
	}

	@Override
	public Persona mostrar() {
		// TODO Auto-generated method stub
		LOG.info("Mostrar los datos de la persona ");
		return persona;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		LOG.info("Se elimino el usuario ");
	}

	@Override
	public Persona modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
