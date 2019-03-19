package Service;

import java.util.Scanner;

import DAO.PizzaMemDao;
import fr.pizzeria.model.Pizza;

public class ListerPizzasService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, PizzaMemDao memPizza) {
		System.out.println("Liste pizzas");
		Pizza[] pizzas = memPizza.findAllPizzas();
		affiche(pizzas);
	}
	
	private static void affiche(Pizza[] pizza) {
		for (Pizza pi : pizza) {
			if (pi != null) {
				System.out.println(pi);
			}
		}
	}

}
