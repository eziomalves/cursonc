package com.eziomalves.cursomc.resources;

import org.springframework.beans.factory.config.YamlProcessor.ResolutionMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET)
	public String listar() {
		return "Rest está funcionando";
	}
}
