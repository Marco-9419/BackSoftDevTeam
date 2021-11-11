package com.softdevteam;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.softdevteam.models.Persona;
import com.softdevteam.repositories.PersonaRepository;
import com.softdevteam.services.PersonaService;

@SpringBootTest
class RegistroDePersonalApplicationTests {

	@Autowired
	PersonaService personaService;
	@Autowired
	PersonaRepository personaRepository;
	
	@Test
	void savePersona() {
		
		Persona persona = new Persona(2L,"asdassajdhkjakjsadh", "Fernando", "Perez", 5532597456L);
		
		Persona personaGuardar = personaService.savePersona(persona);
		
		assertEquals(personaGuardar.getRfc(), persona.getRfc());
	}

	@Test
	void getPersonas() {
		Persona persona = new Persona(2L,"LIASHD983917ASDAJSasdasfe", "Nuñes", "Orlando", 51251844512L);
		Persona persona2 = new Persona(3L,"MSDKJAFD93478349JK", "Juan", "Hernandez", 15152152154L);
		Persona persona3 = new Persona(4L,"ASNDHBKSAD98324HJN", "Pablo", "Esquivel", 45151515159L);
		
		personaService.savePersona(persona);
		personaService.savePersona(persona2);
		personaService.savePersona(persona3);
		
		ArrayList<Persona> arrayPersonas = personaService.getPersonas(); 
		
		assertEquals(arrayPersonas.size(), 3);
	}
	
	@Test
	void deletePersonas() {
		
		Persona persona = new Persona(5L,"LIASHD983917ASDAJS", "Oscar", "Linares", 4846851515L);
		Persona personaEliminada = personaService.savePersona(persona);
		System.out.println("---------PErosna eliminada------------------" + personaEliminada.toString());
		
		personaService.deletePersona("LIASHD983917ASDAJS");
		System.out.println("---------Testing------------------" );
		
		personaEliminada.getId();
		
		
		Optional<Persona> buscarPersona = personaRepository.findById(personaEliminada.getId()); 
		
		System.out.println("---------Testing------------------" + buscarPersona);
		
		assertEquals(true, buscarPersona.isEmpty());
		
	}
	
}
