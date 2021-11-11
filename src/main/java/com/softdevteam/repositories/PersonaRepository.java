package com.softdevteam.repositories;
import com.softdevteam.models.Persona;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona, Long>{
	
//	public  Persona findByRfc(String rfc);
	
//	@Modifying
//    @Query("delete from persona where rfc= ?")
	public  abstract Persona findByRfc(String rfc);
	
}
