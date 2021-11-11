package com.softdevteam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.softdevteam.models.Persona;
import com.softdevteam.repositories.PersonaRepository;

@SpringBootApplication
public class RegistroDePersonalApplication implements CommandLineRunner{

	@Autowired
	PersonaRepository personaRepository;
	
	@Override
	public void run(String... args) throws Exception{
		
//	Persona persona1 = new Persona(2L,"LIASHD983917ASDAJS", "Fernando", "Perez", 5532597456L);	
	
//	personaRepository.save(persona1);
	
	}
	public static void main(String[] args) {
		SpringApplication.run(RegistroDePersonalApplication.class, args);
		
		
	}

}
