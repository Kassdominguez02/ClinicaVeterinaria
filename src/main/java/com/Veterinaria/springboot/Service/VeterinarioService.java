package com.Veterinaria.springboot.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Veterinaria.springboot.Entity.Veterinario;
import com.Veterinaria.springboot.Repository.VeterinarioRepository;


@Service
public class VeterinarioService {
	
	//Para manejar la inyeccion de dependecias
	
		//Constante para el autowired
		
		public final VeterinarioRepository veterinarioRepository;
		
		@Autowired //anotacion
		
		//constructor para la instancia
		public VeterinarioService(VeterinarioRepository veterinarioRepository) {
	        this.veterinarioRepository = veterinarioRepository;
	    }
		
		//metodo CRUD
		
		//Registrar un veterinario desde la entidad:
		
		public Veterinario crearVeterinario(Veterinario veterinario) {
	        return veterinarioRepository.save(veterinario);
	    }
		
		public List<Veterinario> ObtenerVeterinarios() {
			return veterinarioRepository.findAll();
		}
		
		

		
		

}
