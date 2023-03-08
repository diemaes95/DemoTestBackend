package com.everist.everfuture.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.everist.everfuture.repository.repo.EmpleadoRepoJPA;
import com.everist.everfuture.service.impl.EmpleadoServiceImpl;

@Tag("mockeado")
@ExtendWith(MockitoExtension.class)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmpleadoServiceTest {
	
	@Mock
	EmpleadoRepoJPA daoMock;
	
	@InjectMocks
	EmpleadoServiceImpl serviceMock;
	@Test
	void insertTest() {
		fail("Not yet implemented");
	}

}		
