package com.restfullapi.api.Entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Departement {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Column(unique = true)
	private String sigle;
	private String nom;
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	private Boolean status;
	public Departement() {
		
	}
	public Departement(String sigle, String nom, Date dateCreation, Boolean status) {
		this.sigle = sigle;
		this.nom = nom;
		this.dateCreation = dateCreation;
		this.status = status;
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
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Departement [id=" + id + ", sigle=" + sigle + ", nom=" + nom + ", dateCreation=" + dateCreation
				+ ", status=" + status + "]";
	}
	
	
}
