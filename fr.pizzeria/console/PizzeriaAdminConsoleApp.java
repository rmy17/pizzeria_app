package console;

import java.util.Scanner;

import DAO.IPizzaDao;
import DAO.PizzaFileDao;
import DAO.PizzaMemDao;
import Service.MenuFactory;
import exception.SavePizzaException;
import exception.StockageException;


public class PizzeriaAdminConsoleApp {

	public static void main(String[] args) {
		IPizzaDao memPizza = new PizzaMemDao();
		IPizzaDao filePizza = new PizzaFileDao();
		MenuFactory mf = new MenuFactory();
		Scanner sc = new Scanner(System.in);
		boolean on = true;
		while (on == true) {
			System.out.println(
					"1. Lister les pizza\n2. Ajouter une nouvelle pizza\n3. Mettre à jour une pizza\n4. Supprimer une pizza\n5. Sauvegarder la liste de pizza dans un fichier\n99. Sortir");
			System.out.println("Bonjour !");
			System.out.println("Que voulez vous faire ? Tapez le numéro de la proposition pour faire un choix");
			String rep = sc.nextLine();
			int val = 0;
			
			try
			{
				val = Integer.parseInt(rep);
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
				case 5:
					mf.create("Sauvegarder").executeUC(sc,filePizza);
				case 99:
					on = false;
					System.out.println("Au revoir \u2639");
					break;
				default:
					System.out.println("Erreur votre choix n'est pas correct !");
				}
			}
			catch (NumberFormatException e) {
				val = 0;
			}
			catch (SavePizzaException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
			
			
			catch(StockageException e ) {
				System.out.println(e.getMessage());
			}
			
			
		}
		sc.close();
	}
}
