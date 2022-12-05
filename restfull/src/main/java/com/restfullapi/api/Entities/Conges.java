package com.restfullapi.api.Entities;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
public class Conges {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Temporal(TemporalType.DATE)
	private Date dateDebut;
	@Temporal(TemporalType.DATE)
	private Date Datefin;
	private String Observation;
	@OneToOne
	private PConges demande;
	public Conges() {

	}
	public Conges(Date dateDebut, Date datefin, String observation, PConges demande) {
		this.dateDebut = dateDebut;
		Datefin = datefin;
		Observation = observation;
		this.demande = demande;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDatefin() {
		return Datefin;
	}
	public void setDatefin(Date datefin) {
		Datefin = datefin;
	}
	public String getObservation() {
		return Observation;
	}
	public void setObservation(String observation) {
		Observation = observation;
	}
	public PConges getDemande() {
		return demande;
	}
	public void setDemande(PConges demande) {
		this.demande = demande;
	}
	@Override
	public String toString() {
		return "Conges [id=" + id + ", dateDebut=" + dateDebut + ", Datefin=" + Datefin + ", Observation=" + Observation
				+ ", demande=" + demande + "]";
	}
	
}
