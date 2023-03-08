package com.everist.everfuture.repository.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.everist.everfuture.repository.Empleado;

public interface EmpleadoRepoJPA extends JpaRepository<Empleado, String> {

	List<Empleado> findByNombreLike(String nombre);
	
}
