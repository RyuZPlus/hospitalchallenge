package com.example.hospital;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_citas")
public class Citas {
    @Id
	private Integer consultorio;
	
	private Integer doctor;
	
	private String horario;
	
	private String paciente;
	
	public Integer getConsultorio() {
	    return consultorio;
	  }
	
	public void setConsultorio(Integer consultorio) {
	    this.consultorio = consultorio;
	  }

	public Integer getDoctor() {
	    return doctor;
	  }

	public void setDoctor(Integer doctor) {
	    this.doctor = doctor;
	  }
	
	public String getHorario() {
	    return horario;
	  }
	
	public void setHorario(String horario) {
	    this.horario = horario;
	  }

	public String getPaciente() {
	    return paciente;
	  }
	
	public void setPaciente(String paciente) {
	    this.paciente = paciente;
	  }
}
