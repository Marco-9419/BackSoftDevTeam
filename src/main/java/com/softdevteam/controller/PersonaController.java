package com.softdevteam.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.softdevteam.models.Persona;
import com.softdevteam.services.PersonaService;

@RestController
public class PersonaController {

	private PersonaService personaService;

	public PersonaController(PersonaService personaService) {
		
		this.personaService = personaService;
	}
	
	@GetMapping
	@CrossOrigin(origins = "http://127.0.0.1:5500/")
	public ArrayList<Persona> getPersonas(){
		
		
		return personaService.getPersonas();
	}
	
	@PostMapping
	@CrossOrigin(origins = "http://127.0.0.1:5500/")
	public Persona savePersona(@RequestBody Persona persona) {
		
		return personaService.savePersona(persona);
	}
	
	@DeleteMapping(path = "/{rfc}")
	@CrossOrigin(origins = "http://127.0.0.1:5500/")
	public void deletePersona(@PathVariable("rfc") String rfc) {
	
		System.out.println("/////////-----" + rfc);
		
		personaService.deletePersona(rfc);
	}
}
