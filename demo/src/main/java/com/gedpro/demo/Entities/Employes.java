package com.gedpro.demo.Entities;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 
 * @author evrard
 *
 */
@Entity
public class Employes {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private Long id;
	
	@Column
	private String matricule;
	
	@Column
	private String nom;
	
	@Column
	private String prenom;
	
	@Column
	private String telephone;
	
	@Column
	private String login;
	
	/* Bloquer la vue du mot de passe sur les GET methodes*/
	@Column
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
	private String password;
	
	/* Liaison de l'eomplyé à un departement */
	@OneToOne
	private Departements department;
	
	
	@OneToMany(mappedBy="employe")
	private Set<Conges> conges;


	public Employes() {
		
	}


	public Employes(Long id, String matricule, String nom, String prenom, String telephone, String login,
			String password, Departements department, Set<Conges> conges) {
		
		this.id = id;
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.telephone = telephone;
		this.login = login;
		this.password = password;
		this.department = department;
		this.conges = conges;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getMatricule() {
		return matricule;
	}


	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}


	public String getNom() {
		return nom;
	}


	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getTelephone() {
		return telephone;
	}


	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


	public String getLogin() {
		return login;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Departements getDepartment() {
		return department;
	}


	public void setDepartment(Departements department) {
		this.department = department;
	}


	public Set<Conges> getConges() {
		return conges;
	}


	public void setConges(Set<Conges> conges) {
		this.conges = conges;
	}


	@Override
	public String toString() {
		return "Employes [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom
				+ ", telephone=" + telephone + ", login=" + login + ", password=" + password + ", department="
				+ department + ", conges=" + conges + "]";
	}
	
	
}
