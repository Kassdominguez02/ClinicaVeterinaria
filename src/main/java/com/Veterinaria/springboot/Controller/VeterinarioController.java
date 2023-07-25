package com.Veterinaria.springboot.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Veterinaria.springboot.Entity.Veterinario;
import com.Veterinaria.springboot.Service.VeterinarioService;



@RestController //indica que es un controller
@RequestMapping (path="/veterinaria/veterinario")

//Anotacion CrossOrigin 
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT })


public class VeterinarioController {
	
	//inyeccion de dependecias
	
		//declaramos la constante
		
		public final VeterinarioService veterinarioService;
		
		//anotacion
		@Autowired
		
		//constructor
		
		public VeterinarioController(VeterinarioService veterinarioService) {
			this.veterinarioService=veterinarioService;
		}
		
		// Metodos HTTP
		
		@GetMapping
	    public List<Veterinario> getAllVeterinario() {
	        return veterinarioService.ObtenerVeterinarios();
	    }
	    @PostMapping
	    public Veterinario crearVeterinario(@RequestBody Veterinario veterinario) {
	        return veterinarioService.crearVeterinario(veterinario);
	    }


}//clase
