package com.persona.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePersonaRequest {
	
	private String nombre;
	
	private int edad;
	
	private String direccion;
	
	private String empresa;
	
	private String direccion_empresa;

}
