package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "client")
public class Client {
	
	@Id
	@Column(name="id")
	private int id;
	@Column(name="nom")
	private String nom;
	@Column(name="nom")
	private String prenom;
	@Column(name="nom")
	private String email;
	@Column(name="nom")
	private String mot_de_passe;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}
	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}
	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the mot_de_passe
	 */
	public String getMot_de_passe() {
		return mot_de_passe;
	}
	/**
	 * @param mot_de_passe the mot_de_passe to set
	 */
	public void setMot_de_passe(String mot_de_passe) {
		this.mot_de_passe = mot_de_passe;
	}
	
	

	
}
