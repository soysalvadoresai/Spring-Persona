package com.persona.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.persona.request.CreatePersonaRequest;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "edad")
	private int edad;
	
	@Column(name = "direccion")
	private String direccion;
	
	@OneToOne
	@JoinColumn(name = "id_empresa")
	private Empresa id_empresa;

	public Persona(CreatePersonaRequest createPersonaRequest) {
		this.nombre = createPersonaRequest.getNombre();
		this.edad = createPersonaRequest.getEdad();
		this.direccion = createPersonaRequest.getDireccion();
	}
	
	

}
