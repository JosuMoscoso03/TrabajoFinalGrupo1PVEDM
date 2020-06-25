package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ApplicationController {
	public ApplicationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	@GetMapping ("/home")
	public String iniciarAplicacion() {
		return "index" ;
	}
}
