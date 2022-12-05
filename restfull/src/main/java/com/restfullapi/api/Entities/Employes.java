package com.restfullapi.api.Entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity
public class Employes {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(unique = true)
	private String matricule;
	@Column(nullable = false)
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNaissance;
	private Boolean estActif;
	private String email;
	@Column(unique = true, length = 10)
	private String login;
	private String password;
	@OneToMany(mappedBy="employe", fetch = FetchType.LAZY)
	private Collection<PConges> demandeConge;
	@OneToOne
	private Departement departement;
	@ManyToMany(mappedBy="employe", fetch = FetchType.EAGER)
	private List<Roles> role = new ArrayList<>();
	public Employes() {
		
	}
	

	public Employes(String matricule, String nom, String prenom, Date dateNaissance, Boolean estActif, String email,
			String login, String password, Collection<PConges> demandeConge, Departement departement, List<Roles> role ) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.estActif = estActif;
		this.email = email;
		this.login = login;
		this.password = password;
		this.demandeConge = demandeConge;
		this.departement = departement;
		this.role = role;
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
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Boolean getEstActif() {
		return estActif;
	}
	public void setEstActif(Boolean estActif) {
		this.estActif = estActif;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Collection<PConges> getDemandeConge() {
		return demandeConge;
	}

	public void setDemandeConge(Collection<PConges> demandeConge) {
		this.demandeConge = demandeConge;
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


	public Departement getDepartement() {
		return departement;
	}


	public void setDepartement(Departement departement) {
		this.departement = departement;
	}


	public List<Roles> getRole() {
		return role;
	}


	public void setRole(List<Roles> role) {
		this.role = role;
	}


	@Override
	public String toString() {
		return "Employes [id=" + id + ", matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom
				+ ", dateNaissance=" + dateNaissance + ", estActif=" + estActif + ", email=" + email + ", login="
				+ login + ", password=" + password + ", demandeConge=" + demandeConge + ", departement=" + departement
				+ ", role=" + role + "]";
	}


	
}
