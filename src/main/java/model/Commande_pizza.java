package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Commande_pizza {

	@Id
	private int commande_id;
	private int pizza_Id;

	/**
	 * @return the commande_id
	 */
	public int getCommande_id() {
		return commande_id;
	}

	/**
	 * @param commande_id the commande_id to set
	 */
	public void setCommande_id(int commande_id) {
		this.commande_id = commande_id;
	}

	/**
	 * @return the pizza_Id
	 */
	public int getPizza_Id() {
		return pizza_Id;
	}

	/**
	 * @param pizza_Id the pizza_Id to set
	 */
	public void setPizza_Id(int pizza_Id) {
		this.pizza_Id = pizza_Id;
	}

}
