package ar.edu.unju.edm.service;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unju.edm.model.Persona;
import ar.edu.unju.edm.repository.IPersona;

public class PersonaServicelmp implements IPersonaService {
	
	@Autowired
	private IPersona ipersona;
	
	@Override
	public void guardar() {
		// TODO Auto-generated method stub
		ipersona.guardar();
	}

	@Override
	public Persona mostrar() {
		// TODO Auto-generated method stub
		Persona persona = ipersona.mostrar();
		return persona;
	}

	@Override
	public void eliminar() {
		// TODO Auto-generated method stub
		ipersona.eliminar();
	}

	@Override
	public Persona modificar() {
		// TODO Auto-generated method stub
		return null;
	}

}
