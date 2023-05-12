package com.example.hospital;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_doctores")
public class Doctores {
    @Id
	private Integer matricula;
	
	private String nombre;
	
	private String apellidop;
	
	private String apellidom;

    private String especialidad;
	
	public Integer getMatricula() {
	    return matricula;
	  }
	
	public void setMatricula(Integer matricula) {
	    this.matricula = matricula;
	  }

	public String getNombre() {
	    return nombre;
	  }

	public void setNombre(String nombre) {
	    this.nombre = nombre;
	  }
	
	public String getApellidoP() {
	    return apellidop;
	  }
	
	public void setApellidoP(String apellidop) {
	    this.apellidop = apellidop;
	  }

	public String getApellidoM() {
	    return apellidom;
	  }
	
	public void setApellidoM(String apellidom) {
	    this.apellidom = apellidom;
	  }
    
    public String getEspecialidad() {
	    return especialidad;
	  }
	
	public void setEspecialidad(String especialidad) {
	    this.especialidad = especialidad;
	  }
}
