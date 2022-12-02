package com.gedpro.demo.Entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 
 * @author evrard
 *
 */
@Entity
public class Departements {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private String sigle;
	
	@Column
	private String nomDepartement;
	
	@Column
	@JsonFormat(pattern="dd/mm/YYYY HH:mm:ss")
	private Timestamp dateCreation;

	public Departements() {
		
	}

	public Departements(Long id, String sigle, String nomDepartement, Timestamp dateCreation) {
		
		this.id = id;
		this.sigle = sigle;
		this.nomDepartement = nomDepartement;
		this.dateCreation = dateCreation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSigle() {
		return sigle;
	}

	public void setSigle(String sigle) {
		this.sigle = sigle;
	}

	public String getNomDepartement() {
		return nomDepartement;
	}

	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}

	public Timestamp getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Timestamp dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Departements [id=" + id + ", sigle=" + sigle + ", nomDepartement=" + nomDepartement + ", dateCreation="
				+ dateCreation + "]";
	}
	
	
}
