package fr.pizzeria.console;

import java.util.Scanner;

import DAO.PizzaMemDao;
import Service.AjouterPizzasService;
import Service.ListerPizzasService;
import Service.ModifierPizzaService;
import Service.SupprimerPizzaService;


public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		PizzaMemDao memPizza = new PizzaMemDao();
		ListerPizzasService list = new ListerPizzasService();
		AjouterPizzasService add = new AjouterPizzasService();
		ModifierPizzaService modif = new ModifierPizzaService();
		SupprimerPizzaService supp = new SupprimerPizzaService();
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		while (on == true) {
			System.out.println(
					"1. Lister les pizza\n2. Ajouter une nouvelle pizza\n3. Mettre à jour une pizza\n4. Supprimer une pizza\n99. Sortir");
			System.out.println("Bonjour !");
			System.out.println("Que voulez vous faire ? Tapez le numéro de la proposition pour faire un choix");
			String rep = sc.nextLine();
			int val = Integer.parseInt(rep);
			switch (val) {
			case 1:
				list.executeUC(sc, memPizza);
				break;
			case 2:
				
				add.executeUC(sc, memPizza);
				break;
			case 3:
				modif.executeUC(sc, memPizza);
				break;
			case 4:
				supp.executeUC(sc, memPizza);
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
}
