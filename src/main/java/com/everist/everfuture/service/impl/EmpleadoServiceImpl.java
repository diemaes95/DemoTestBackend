package com.everist.everfuture.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.everist.everfuture.repository.Empleado;
import com.everist.everfuture.repository.repo.EmpleadoRepoJPA;
import com.everist.everfuture.service.EmpleadoService;

public class EmpleadoServiceImpl implements EmpleadoService {
	
	@Autowired
	EmpleadoRepoJPA dao;
	
	@Override
	public Empleado insertar(Empleado e) {
		return dao.save(e);
	}

}
