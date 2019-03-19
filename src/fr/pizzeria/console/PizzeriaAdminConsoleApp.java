package fr.pizzeria.console;

import java.util.Scanner;

import DAO.PizzaMemDao;
import Service.MenuFactory;


public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		PizzaMemDao memPizza = new PizzaMemDao();
		MenuFactory mf = new MenuFactory();
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
				mf.create("Lister").executeUC(sc, memPizza);
				break;
			case 2:
				mf.create("Ajouter").executeUC(sc, memPizza);
				break;
			case 3:
				mf.create("Modifier").executeUC(sc, memPizza);
				break;
			case 4:
				mf.create("Supprimer").executeUC(sc, memPizza);
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
