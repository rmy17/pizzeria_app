package Service;

import java.util.Scanner;

import DAO.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ModifierPizzaService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao memPizza) {
		// TODO Auto-generated method stub
		System.out.println("Mise à jour d'une pizza");
		ListerPizzasService l = new ListerPizzasService();
		l.executeUC(scanner, memPizza);
		System.out.println("Veuillez choisir le code de la pizza à modifier.");
		String code = scanner.nextLine();
		System.out.println("Veuillez saisir le nouveau code");
		String newCode = scanner.nextLine();
		System.out.println("Veuillez saisir le nouveau nom (sans espace)");
		String newNom = scanner.nextLine();
		String newPrixStr = scanner.nextLine();
		Double newPrix = Double.parseDouble(newPrixStr);
		memPizza.updatePizza(code, new Pizza(newCode, newNom, newPrix));
	}

	
}
