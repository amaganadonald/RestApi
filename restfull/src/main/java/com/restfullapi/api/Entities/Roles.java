package com.restfullapi.api.Entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Roles {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String nom;
	
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	@ManyToMany(fetch = FetchType.EAGER)
	private List<Employes> employe = new ArrayList<>();
   
	public Roles() {
	}

	public Roles(String nom, String description, Date dateCreation, List<Employes> employe) {
		this.nom = nom;
		this.description = description;
		this.dateCreation = dateCreation;
		this.employe = employe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public List<Employes> getEmploye() {
		return employe;
	}

	public void setEmploye(List<Employes> employe) {
		this.employe = employe;
	}

	@Override
	public String toString() {
		return "Roles [id=" + id + ", nom=" + nom + ", description=" + description + ", dateCreation=" + dateCreation
				+ ", employe=" + employe + "]";
	}
	
	
}
