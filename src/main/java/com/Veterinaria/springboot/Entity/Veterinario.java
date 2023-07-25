package com.Veterinaria.springboot.Entity;

import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="veterinario")
public class Veterinario {
	
	//definimos atributos:
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY )
	
	@Column (name="id", unique=true, nullable=false ) 
	private Long id;
	private String apellidoPaterno; 

	private String apellidoMaterno; 

	private String nombreVeterinario; 

	private String cedula;
	
	// constructor
	
	public Veterinario(Long id, String apellidoPaterno, String apellidoMaterno, String nombreVeterinario,
			String cedula) {
		super();
		this.id = id;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
		this.nombreVeterinario = nombreVeterinario;
		this.cedula = cedula;
	}
	
	//Constructor vacio
		public Veterinario() {
			
		}

	
	//definimos Getter y setters

	public Long getId() {
		return id;
	}

	

	public void setId(Long id) {
		this.id = id;
	}

	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	public String getNombreVeterinario() {
		return nombreVeterinario;
	}

	public void setNombreVeterinario(String nombreVeterinario) {
		this.nombreVeterinario = nombreVeterinario;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	
	// toString
	
	@Override
	public String toString() {
		return "Veterinario [id=" + id + ", apellidoPaterno=" + apellidoPaterno + ", apellidoMaterno=" + apellidoMaterno
				+ ", nombreVeterinario=" + nombreVeterinario + ", cedula=" + cedula + "]";
	} 
	


}//clase
