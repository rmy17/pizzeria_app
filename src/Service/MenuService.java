package Service;

import java.util.Scanner;

import DAO.PizzaMemDao;

public abstract class MenuService {

	public abstract void executeUC(Scanner scanner, PizzaMemDao memPizza);
}
