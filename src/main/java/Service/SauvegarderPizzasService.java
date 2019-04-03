package Service;


import java.io.*;
import java.util.Scanner;

import DAO.IPizzaDao;

public class SauvegarderPizzasService extends MenuService{

	@Override
	public void executeUC(Scanner scanner, IPizzaDao memPizza) {
		// TODO Auto-generated method stub
		
		System.out.println("Donner un nom de fichier");
		String nomFile = scanner.nextLine();
		FileOutputStream fos = null;
		/*
		try {
			fos = new FileOutputStream(new File(nomFile));
			byte[] buf = new byte[8];
			
			int n = 0;
			
			
		}
		*/
		
	}
}
