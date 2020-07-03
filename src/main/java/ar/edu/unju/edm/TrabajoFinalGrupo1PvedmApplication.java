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
public class TrabajoFinalGrupo1PvedmApplication {
	@Autowired
	IUsuarioService usuarioService;
	IPersonaService personaService;
	@Autowired
	Usuario usuario;
	Persona persona;
	public static void main(String[] args) {
		SpringApplication.run(TrabajoFinalGrupo1PvedmApplication.class, args);
	}

}
