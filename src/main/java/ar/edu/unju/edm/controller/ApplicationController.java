package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import ar.edu.unju.edm.model.Usuario;
import ar.edu.unju.edm.service.IUsuarioService;

@Controller
public class ApplicationController {
	IUsuarioService usuarioService;
	public ApplicationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GetMapping ("/formularioUsuario")
	public String cargarFormulario(Model model) {
		model.addAttribute("usuarioDelForm", new Usuario());
		return "Usuario" ;
	}
	
	@PostMapping ("/formularioUsuario")
	public String crearUsuario(@ModelAttribute("usuarioDelForm") Usuario usuario, ModelMap model) {
		try {
			usuarioService.guardar(usuario);
			model.addAttribute("usuarioDelForm", new Usuario());
			model.addAttribute("listTab", "active");
		}catch (Exception e) {
			model.addAttribute("formUsuarioErrorMessage", e.getMessage());
			model.addAttribute("useForm", usuario);
			model.addAttribute("formTab", "active");
		}
		//model.addAttribute();
		//model.addAttribute();
		return "Usuario";
	}
	
		
}
