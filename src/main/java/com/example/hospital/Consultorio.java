package com.example.hospital;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_consultorio")
public class Consultorio {
    @Id
	private Integer nconsultorio;
	
	private String piso;
	
	public Integer getNConsultorio() {
	    return nconsultorio;
	  }
	
	public void setConsultorio(Integer nconsultorio) {
	    this.nconsultorio = nconsultorio;
	  }

	public String getPiso() {
	    return piso;
	  }

	public void setPiso(String piso) {
	    this.piso = piso;
    }
}
