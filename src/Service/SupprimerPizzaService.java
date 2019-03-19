package Service;

import java.util.Scanner;

import DAO.PizzaMemDao;

public class SupprimerPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao memPizza) {
		String code;
		do {
			System.out.println("Suppression d'une pizza");
			System.out.println("Veuillez choisir le code de la pizza à supprimer :");
			code = scanner.nextLine();
		} while (memPizza.pizzaExists(code) == false);
		memPizza.deletePizza(code);
	}

	
	
}
