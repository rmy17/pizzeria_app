package fr.pizzeria.console;

import fr.pizzeria.model.*;
import java.util.*;
public class PizzeriaAdminConsoleApp {

	public static void main(String []args) {
		Pizza p1 = new Pizza(0,"PEP","Pépéroni",12.50);
		Pizza p2 = new Pizza(1,"MAR","Margherita",14.00);
		Pizza p3 = new Pizza(2,"REIN","La Reine",11.50);
		Pizza p4 = new Pizza(3,"FRO","La 4 fromages",12.00);
		Pizza p5 = new Pizza(4,"CAN","La cannibale",12.50);
		Pizza p6 = new Pizza(5,"SAV","La savoyarde",13.00);
		Pizza p7 = new Pizza(6,"ORI","L'orientale",13.50);
		Pizza p8 = new Pizza(7,"IND","L'indienne",14.00); 
		Pizza[] pizza = new Pizza[100];
		pizza[0]=p1;pizza[1]=p2;pizza[2]=p3;pizza[3]=p4;pizza[4]=p5;pizza[5]=p6;pizza[6]=p7;pizza[7]=p8;
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		while (on == true) {
			System.out.println("1. Lister les pizza\n2. Ajouter une nouvelle pizza\n3. Mettre à jour une pizza\n4. Supprimer une pizza\n99. Sortir");
			System.out.println("Bonjour !");
			System.out.println("Que voulez vous faire ? Tapez le numéro de la proposition pour faire un choix");
			String rep = sc.nextLine();
			int val = Integer.parseInt(rep);
			switch(val) {
			case 1 :
				System.out.println("Liste pizzas");
				affiche(pizza);
				break;
			case 2 :
				System.out.println("Ajout d'une nouvelle pizza");
				System.out.println("Veuillez saisir le code :");
				String code = sc.nextLine();
				System.out.println("Veuillez saisir le nom (sans espace) :");
				String nom = sc.nextLine();
				System.out.println("Veuillez saisir le prix :");
				String prixstr = sc.nextLine();
				double prix = Double.parseDouble(prixstr); 
				Pizza nouv = new Pizza(code,nom, prix);
				int idx =  premierNull(pizza);
				pizza[idx]=nouv;
				break;
			case 3 :
				System.out.println("Mise à jour d'une pizza");
				affiche(pizza);
				System.out.println("Veuillez choisir le code de la pizza à modifier.");
				code = sc.nextLine();
				int nb = recupPizza(code,pizza);
				System.out.println("Veuillez saisir le nouveau code");
				code = sc.nextLine();
				pizza[nb].setCode(code);
				System.out.println("Veuillez saisir le nouveau nom (sans espace)");
				code = sc.nextLine();
				pizza[nb].setLibelle(code);
				String newPrixStr = sc.nextLine();
				Double newPrix = Double.parseDouble(newPrixStr);
				pizza[nb].setPrix(newPrix); 
			case 4:
				System.out.println("Suppression d'une pizza");
				System.out.println("Veuillez choisir le code de la pizza à supprimer :");
				code = sc.nextLine();
				nb = recupPizza(code, pizza);
				pizza[nb]=null;
				break;
			case 99:
				on = false;
				System.out.println("Au revoir \u2639");
				break;
			default:
				System.out.println("Erreur votre choix n'est pas correct !");
			}
		}
		sc.close();
	}
	
	private static void affiche(Pizza[] pizza) {
		for(Pizza pi : pizza){
			if( pi != null) {
				System.out.println(pi);
			}
		}
	}
	
	private static int recupPizza(String code, Pizza [] pizza) {
		for(int i = 0; i<pizza.length;i++) {
			if(pizza[i] != null && pizza[i].getCode().equals(code)) {
				return i;
			}
		}
		return -1;
	}
	
	private static int premierNull(Pizza [] pizza) {
		for(int i = 0; i<pizza.length;i++) {
			if(pizza[i] == null) {
				 return i;
			}
		}
		return -1;
	}
}
