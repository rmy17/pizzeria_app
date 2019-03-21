package Service;

import java.util.Scanner;

import DAO.IPizzaDao;
import fr.pizzeria.exception.StockageException;

public abstract class MenuService {

	public abstract void executeUC(Scanner scanner, IPizzaDao memPizza) throws StockageException;
}
