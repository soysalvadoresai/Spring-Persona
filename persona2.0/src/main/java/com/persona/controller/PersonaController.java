package com.persona.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.persona.entity.Persona;
import com.persona.request.CreatePersonaRequest;
import com.persona.response.PersonaResponse;
import com.persona.service.PersonaService;

@RestController
@RequestMapping("/microservicio2/")
public class PersonaController {
	
	@Autowired 
	PersonaService personaService;
	
	@PostMapping("create")
	public PersonaResponse createPersona (@Valid @RequestBody CreatePersonaRequest createPersonaRequest) {
		Persona persona = personaService.createPersona(createPersonaRequest);
		return new PersonaResponse(persona);	
	}
	
	@GetMapping("getAll")
	public List<PersonaResponse> getAllPersonas () {
		List<Persona> personaList = personaService.getAllPersonas();
		List<PersonaResponse> studentResponseList = new ArrayList<PersonaResponse>();
		
		personaList.stream().forEach(student -> {
			studentResponseList.add(new PersonaResponse(student));
		});
		
		return studentResponseList;
	}
	

}
