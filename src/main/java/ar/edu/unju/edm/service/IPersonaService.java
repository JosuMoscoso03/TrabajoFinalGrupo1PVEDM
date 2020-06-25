package ar.edu.unju.edm.service;

import ar.edu.unju.edm.model.Persona;

public interface IPersonaService {
	public void guardar();
	public Persona mostrar();
	public void eliminar();
	public Persona modificar();

}
