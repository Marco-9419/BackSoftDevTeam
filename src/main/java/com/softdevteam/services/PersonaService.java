package com.softdevteam.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softdevteam.models.Persona;
import com.softdevteam.repositories.PersonaRepository;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;

	public ArrayList<Persona> getPersonas(){
		
		return (ArrayList<Persona>) personaRepository.findAll();
	}
	
	public Persona savePersona(Persona persona) {
	
		return personaRepository.save(persona);
	}
	
	public void deletePersona(String rfc) {
		
		
		System.out.println("----------" + rfc);
		
		Persona persona = personaRepository.findByRfc(rfc);
		Long id = persona.getId();
		
		personaRepository.deleteById(id);
	}
	
}
