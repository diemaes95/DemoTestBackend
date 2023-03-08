package com.everist.everfuture.repository;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Objects;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
@Tag("normal")
class EmpleadoTest {

	@Test
	void test() {
		
		//GIVEN
		String username = "testUsername";
		String nombre = "pepito";
		String apellidos = "Morales Constantin"; 
		long salario = 1800;
		
		//WHEN
		Empleado e1 = new Empleado();
		e1.setUsername(username);
		e1.setNombre(nombre);
		e1.setApellidos(apellidos);
		e1.setSalario(salario);
		Empleado e2 = new Empleado(username, "u","e",1000);
		
		//THEN
		assertAll( 	()-> assertEquals(username, e1.getUsername(), "mismo nombre"),
					()-> assertEquals(nombre, e1.getNombre(), "Mismo nombre"),
					()-> assertEquals(apellidos, e1.getApellidos(), "Mismos apellidos"),
					()-> assertEquals(salario, e1.getSalario(), "Mismo salario"),
					()-> assertEquals(e1,e1,"mismo objeto"),
					()-> assertNotEquals(e1,nombre,"distinto tipo de  objeto"),
					()-> assertEquals(e1,e2,"mismo username"),
					()-> assertEquals(Objects.hash(e1.getUsername()), e1.hashCode())
		);
		
	}

}
