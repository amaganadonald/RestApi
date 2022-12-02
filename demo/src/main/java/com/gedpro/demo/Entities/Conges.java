package com.gedpro.demo.Entities;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * 
 * @author evrard
 * Suivi des congés
 */
@Entity
public class Conges {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	/* Nombre de jours de conges*/
	@Column
	private int nbJours;
	
	/* Date de la demande de congés */
	@Column
	@JsonFormat(pattern="dd-mm-YYYY HH:mm:ss")
	private Timestamp dateJour;
	
	/* Date de debut du conges */
	@Column
	@JsonFormat(pattern="dd-mm-YYYY HH:mm:ss")
	private Timestamp dateDebut;
	
	/* Status de la demande de conges */
	@Column
	private Boolean status;
	
	/* Type de congés */
	@OneToOne
	private TypeConges typeConge;
	
	
	/* Employé concerné par le congé */
	@ManyToOne
	@JsonIgnore
	@JoinColumn(name="employe_id", nullable=false)
	private Employes employe;

	public Conges() {
		
	}

	public Conges(Long id, int nbJours, Timestamp dateJour, Timestamp dateDebut, Boolean status, TypeConges typeConge,
			Employes employe) {
		
		this.id = id;
		this.nbJours = nbJours;
		this.dateJour = dateJour;
		this.dateDebut = dateDebut;
		this.status = status;
		this.typeConge = typeConge;
		this.employe = employe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getNbJours() {
		return nbJours;
	}

	public void setNbJours(int nbJours) {
		this.nbJours = nbJours;
	}

	public Timestamp getDateJour() {
		return dateJour;
	}

	public void setDateJour(Timestamp dateJour) {
		this.dateJour = dateJour;
	}

	public Timestamp getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Timestamp dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public TypeConges getTypeConge() {
		return typeConge;
	}

	public void setTypeConge(TypeConges typeConge) {
		this.typeConge = typeConge;
	}

	public Employes getEmploye() {
		return employe;
	}

	public void setEmploye(Employes employe) {
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "Conges [id=" + id + ", nbJours=" + nbJours + ", dateJour=" + dateJour + ", dateDebut=" + dateDebut
				+ ", status=" + status + ", typeConge=" + typeConge + ", employe=" + employe + "]";
	}
	
	
}
