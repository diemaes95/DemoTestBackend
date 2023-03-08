package com.everist.everfuture.repository.repo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.everist.everfuture.repository.Empleado;

@Tag("mockeado")
@ExtendWith(MockitoExtension.class)
class EmpleadoRepoJPATest {

	@Mock
	EmpleadoRepoJPA daoMock;
	
	@Test
	void findByNombreLikeTest() {
		//Given
		String username = "testUser";
		Empleado e1 = new Empleado(username, "Diego", "Maestra", 1500);
		Optional<Empleado> data = Optional.of(e1);
		//WHEN
		when(daoMock.findById(username)).thenReturn(data);
		
		Empleado empleado1 = daoMock.findById(username).orElse(null);
		Empleado empleado2 = daoMock.findById("").orElse(null);
		
		//THEN
		assertEquals(e1, empleado1);
		assertEquals(empleado2, null);
	}

}
