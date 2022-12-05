package com.restfullapi.api.Entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class PConges {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDemande;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Enumerated(EnumType.STRING)
	private StatusDemande statusDemande;
	@OneToOne
	private TypeConges typeConge;
	@ManyToOne
	@JsonProperty(access=JsonProperty.Access.READ_ONLY)
	private Employes employe;
	@OneToOne(mappedBy = "demande")
	@JsonProperty(access=JsonProperty.Access.READ_ONLY)
	private Conges conge;
	public PConges() {
	
	}
	public PConges(Date dateDemande, Date dateDebut, StatusDemande statusDemande, TypeConges typeConge,
			Employes employe, Conges conge) {
		this.dateDemande = dateDemande;
		this.dateDebut = dateDebut;
		this.statusDemande = statusDemande;
		this.typeConge = typeConge;
		this.employe = employe;
		this.conge = conge;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateDemande() {
		return dateDemande;
	}
	public void setDateDemande(Date dateDemande) {
		this.dateDemande = dateDemande;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public StatusDemande getStatusDemande() {
		return statusDemande;
	}
	public void setStatusDemande(StatusDemande statusDemande) {
		this.statusDemande = statusDemande;
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
	public Conges getConge() {
		return conge;
	}
	public void setConge(Conges conge) {
		this.conge = conge;
	}
	@Override
	public String toString() {
		return "PConges [id=" + id + ", dateDemande=" + dateDemande + ", dateDebut=" + dateDebut + ", statusDemande="
				+ statusDemande + ", typeConge=" + typeConge + ", employe=" + employe + ", conge=" + conge + "]";
	}
	
	
}
