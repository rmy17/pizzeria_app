package Service;


import java.util.Scanner;

import DAO.IPizzaDao;
import fr.pizzeria.exception.SavePizzaException;
import fr.pizzeria.exception.StockageException;
import fr.pizzeria.model.Pizza;

public class AjouterPizzasService extends MenuService{

	public void executeUC(Scanner scanner,IPizzaDao memPizza) throws StockageException{
		// TODO Auto-generated method stub
		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code :");
		String	code = scanner.nextLine();
		System.out.println(code.length());
		if (code.length() != 3) {
			throw new SavePizzaException("Veuillez saisir un code de 3 lettres");
		}
		if(memPizza.pizzaExists(code) == true) {
			throw new SavePizzaException("Ce code existe déjà, rentrer un autre code");
		}
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String nom = scanner.nextLine();
		System.out.println("Veuillez saisir le prix :");
		String prixstr = scanner.nextLine();
		double prix = Double.parseDouble(prixstr);
		if(prix < 0 || prix < 30) {
			throw new SavePizzaException("Donner un prix positif et inférieur à 30");
		}
		Pizza nouv = new Pizza(code, nom, prix);
		
		memPizza.saveNewPizza(nouv);
	}
}
