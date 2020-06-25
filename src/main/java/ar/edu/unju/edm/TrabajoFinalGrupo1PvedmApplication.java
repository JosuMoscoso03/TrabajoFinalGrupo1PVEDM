package ar.edu.unju.edm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.model.Persona;
import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IPersonaService;
import ar.edu.unju.edm.service.IUsuarioService;

@SpringBootApplication
public class TrabajoFinalGrupo1PvedmApplication implements CommandLineRunner {
	@Autowired
	IUsuarioService usuarioService;
	IPersonaService personaService;
	@Autowired
	Usuario usuario;
	Persona persona;
	public static void main(String[] args) {
		SpringApplication.run(TrabajoFinalGrupo1PvedmApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		usuario.setApellidoReal("Cruz");
		usuario.setNombreReal("Daniela");
		usuario.setNombreUsuario("dani13");
		usuario.setPassword("13013");
		usuario.setTipoUsuario("BD");
		
		usuarioService.guardar();
		
		persona.setApellido("Cruz");
		persona.setNombres("Daniela");
		persona.setNacionalidad("argentina");
		persona.setDocumento("13013345");
		
		personaService.guardar();
		
	}
	

}
