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
 * Class Type de congés
 */
@Entity
public class TypeConges {
	/** Identifiant du type auto incrementé*/
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	/** Nom du type de congés */
	@Column
	private String libelle;
	
	/** Description du type de congés */
	@Column
	private String description;
	
	/** Date de création du type de congé */
	@Column
	@JsonFormat(pattern="dd-mm-YYYY HH:mm:ss", timezone="UTC")
	private Timestamp dateCreation;

	public TypeConges() {
		
	}

	public TypeConges(Long id, String libelle, String description, Timestamp dateCreation) {
	
		this.id = id;
		this.libelle = libelle;
		this.description = description;
		this.dateCreation = dateCreation;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Timestamp getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Timestamp dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "TypeConge [id=" + id + ", libelle=" + libelle + ", description=" + description + ", dateCreation="
				+ dateCreation + "]";
	}
	
	

}
