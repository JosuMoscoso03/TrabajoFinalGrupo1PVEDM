package ar.edu.unju.edm.repository;
import ar.edu.unju.edm.model.Usuario;
public interface IUsuario {

	public void guardar();
	public Usuario mostrar();
	public void eliminar();
	public Usuario modificar();
	
}
