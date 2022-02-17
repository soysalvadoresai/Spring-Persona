package com.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.persona.entity.Empresa;


@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {

}
