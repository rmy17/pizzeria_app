package fr.pizzeria.model;

public class Pizza {
	int id;
	String code;
	String libelle;
	double prix;
	static int cpt = 1;
	
	public Pizza(String code, String libelle, double prix) {
		cpt++;
		this.id = cpt;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}
	
	public Pizza(int id, String code, String libelle, double prix) {
		this.id = id;
		this.code = code;
		this.libelle = libelle;
		this.prix = prix;
	}

	public void afficheId() {
		System.out.println(this.id);
	}
	
	public int getId(){
		return this.id;
	}
	
	public String getCode() {
		return this.code;
	}
	
	public String getLibelle(){
		return this.libelle;
	}
	
	public double getPrix(){
		return this.prix;
	}
	
	public void setCode(String newCode){
		this.code = newCode;
	}
	
	public void setLibelle(String newLibelle){
		this.libelle = newLibelle;
	}
	
	public void setPrix(double newPrix) {
		this.prix = newPrix;
	}
}
