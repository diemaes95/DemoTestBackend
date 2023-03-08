package com.everist.everfuture.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@Tag("normal")
class ClienteTest {

	@Test
	void test() {
		
		//GIVEN
		String username = "testUsername";
		String nombre = "pepito";
		String apellidos = "Morales Constantin"; 
		long salario = 1800;
		
		//WHEN
		Cliente c1 = new Cliente();
		c1.setUsername(username);
		c1.setNombre(nombre);
		c1.setApellidos(apellidos);
		c1.setSalario(salario);
		Cliente c2 = new Cliente(username, "u","e",1000);
		
		//THEN
		assertAll( 	()-> assertEquals(username, c1.getUsername(), "mismo nombre"),
					()-> assertEquals(nombre, c1.getNombre(), "Mismo nombre"),
					()-> assertEquals(apellidos, c1.getApellidos(), "Mismos apellidos"),
					()-> assertEquals(salario, c1.getSalario(), "Mismo salario"),
					()-> assertEquals(c1,c1,"mismo objeto"),
					()-> assertNotEquals(c1,nombre,"distinto tipo de  objeto"),
					()-> assertEquals(c1,c2,"mismo username"),
					()-> assertEquals(Objects.hash(c1.getUsername()), c1.hashCode())
		);
		
	}

}
