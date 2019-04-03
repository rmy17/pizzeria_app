package Service;

import java.util.ArrayList;
import java.util.Scanner;

import DAO.IPizzaDao;
import model.Pizza;

public class ListerPizzasService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, IPizzaDao memPizza) {
		System.out.println("Liste pizzas");
		ArrayList<Pizza> pizzas = memPizza.findAllPizzas();
		affiche(pizzas);
	}
	
	private static void affiche(ArrayList<Pizza> pizza) {
		for (Pizza pi : pizza) {
			if (pi != null) {
				System.out.println(pi);
			}
		}
	}

}
