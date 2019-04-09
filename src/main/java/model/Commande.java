package model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Table Commande class
 * 
 * @author rmy17
 *
 */
@Entity
@Table(name = "commande")
public class Commande {

	@Id
	private int id;
	private int numero_commande;
	private String status;
	private LocalDateTime date_commande;
	private int livreur_id;
	private int client_id;

	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;

	@ManyToOne
	@JoinColumn(name = "livreur_id")
	private Livreur livreur;

	@ManyToMany
	@JoinTable(name = "Commande_pizza", joinColumns = @JoinColumn(name = "commande_id", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "pizza_id", referencedColumnName = "id"))
	private List<Pizza> pizzas;

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
	 * @return the numero_commande
	 */
	public int getNumero_commande() {
		return numero_commande;
	}

	/**
	 * @param numero_commande the numero_commande to set
	 */
	public void setNumero_commande(int numero_commande) {
		this.numero_commande = numero_commande;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the date_commande
	 */
	public LocalDateTime getDate_commande() {
		return date_commande;
	}

	/**
	 * @param date_commande the date_commande to set
	 */
	public void setDate_commande(LocalDateTime date_commande) {
		this.date_commande = date_commande;
	}

	/**
	 * @return the livreur_id
	 */
	public int getLivreur_id() {
		return livreur_id;
	}

	/**
	 * @param livreur_id the livreur_id to set
	 */
	public void setLivreur_id(int livreur_id) {
		this.livreur_id = livreur_id;
	}

	/**
	 * @return the client_id
	 */
	public int getClient_id() {
		return client_id;
	}

	/**
	 * @param client_id the client_id to set
	 */
	public void setClient_id(int client_id) {
		this.client_id = client_id;
	}

}
