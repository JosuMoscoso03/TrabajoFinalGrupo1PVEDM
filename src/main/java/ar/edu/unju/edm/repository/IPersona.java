package ar.edu.unju.edm.repository;

import ar.edu.unju.edm.model.Persona;

public interface IPersona {
	public void guardar();
	public Persona mostrar();
	public void eliminar();
	public Persona modificar();
}
