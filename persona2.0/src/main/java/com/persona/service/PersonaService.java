package com.persona.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.persona.entity.Empresa;
import com.persona.entity.Persona;
import com.persona.repository.EmpresaRepository;
import com.persona.repository.PersonaRepository;
import com.persona.request.CreatePersonaRequest;

@Service
public class PersonaService {
	
	@Autowired
	PersonaRepository personaRepository;
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	public Persona createPersona(CreatePersonaRequest createPersonaRequest) {
		
		Persona persona = new Persona(createPersonaRequest);	
		
		Empresa empresa = new Empresa();
		empresa.setEmpresa(createPersonaRequest.getEmpresa());
		empresa.setDireccion_empresa(createPersonaRequest.getDireccion_empresa());
		
		empresa = empresaRepository.save(empresa);
		
		persona.setId_empresa(empresa);
		persona = personaRepository.save(persona);
		
		return persona;
	}
	
	public List<Persona> getAllPersonas () {
		return personaRepository.findAll();
	}
	

}
