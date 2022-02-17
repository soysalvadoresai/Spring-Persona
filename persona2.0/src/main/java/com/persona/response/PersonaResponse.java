package com.persona.response;

import com.persona.entity.Persona;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonaResponse {
	
	private Long id;
	private String nombre;
	private int edad;
	private String direccion;
	
	private String empresa;
	private String direccion_empresa;
	
	
	public PersonaResponse(Persona persona) {
		this.id = persona.getId();
		this.nombre = persona.getNombre();
		this.edad = persona.getEdad();
		this.direccion = persona.getDireccion();
		
		this.empresa = persona.getId_empresa().getEmpresa();
		this.direccion_empresa = persona.getId_empresa().getDireccion_empresa();
	}
	
	
	

}
