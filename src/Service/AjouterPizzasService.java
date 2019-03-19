package Service;


import java.util.Scanner;
import DAO.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class AjouterPizzasService extends MenuService{

	public void executeUC(Scanner scanner,PizzaMemDao memPizza) {
		// TODO Auto-generated method stub
		System.out.println("Ajout d'une nouvelle pizza");
		System.out.println("Veuillez saisir le code :");
		String code = scanner.nextLine();
		System.out.println("Veuillez saisir le nom (sans espace) :");
		String nom = scanner.nextLine();
		System.out.println("Veuillez saisir le prix :");
		String prixstr = scanner.nextLine();
		double prix = Double.parseDouble(prixstr);
		Pizza nouv = new Pizza(code, nom, prix);
		memPizza.saveNewPizza(nouv);
	}
}
