package DAO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import model.CategoriePizza;
import model.Pizza;

public class PizzaBddDoa implements IPizzaDao{

	private ArrayList<Pizza> pizzas;
	private String url = null;
	private String Dname = null;
	private String userName = null;
	private String password = null;
	private Connection con = null;
	private PreparedStatement st = null;
	
	
	public void beginConnectJbdc() {
		FileInputStream fis;
			
		try {
			fis = new FileInputStream("C:\\Users\\rmy17\\Documents\\workspace-sts-3.9.6.RELEASE\\pizzeria-console-objet\\src\\main\\java\\DAO\\jdbc.properties");
		
		Properties p = new Properties();
		p.load(fis); 
		Dname= (String) p.get ("Dname"); 
	    url= (String) p.get ("URL"); 
	        userName= (String) p.get ("Uname"); 
	        password= (String) p.get ("password");
	        Class.forName(Dname); 
	        con = DriverManager.getConnection( 
	                url, userName, password); 
	        con.setAutoCommit(false);
		}
	    catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	private void closeConnexionBdd ()
	{
		try
		{
			st.close ();
			con.close ();
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
}
	
	@Override
	public ArrayList<Pizza> findAllPizzas() {
		// TODO Auto-generated method stub
		ArrayList <Pizza> pizzas = new ArrayList <> ();
		try {
			beginConnectJbdc();
			st = con.prepareStatement("SELECT * from pizzas");
			ResultSet re = st.executeQuery();
			while(re.next()) 
			{ 
				String cat = re.getString(5);
				CategoriePizza cate = CategoriePizza.valueOf(cat.toUpperCase());
				pizzas.add(new Pizza(re.getInt(1),re.getString(2),re.getString(3),re.getDouble(4),cate));
			}
			closeConnexionBdd();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//throw new MySqlSException ("La récupération de la liste de pizza dans la base de donnée ne s'est pas déroulé correctement");
			System.out.println(e.getMessage());
		}
		return pizzas;
	}

	@Override
	public void saveNewPizza(Pizza pizza) {
		// TODO Auto-generated method stub
		try {
			beginConnectJbdc();
			st = con.prepareStatement("INSERT INTO pizzas (CODE,LIBELLE,PRIX,CATEGORIE) values (?,?,?,?);");
			st.setString(1, pizza.getCode());
			st.setString(2, pizza.getLibelle());
			st.setDouble(3, pizza.getPrix());
			//st.setString(4, pizza.);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updatePizza(String codePizza, Pizza pizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePizza(String codePizza) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pizza findPizzaByCode(String codePizza) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean pizzaExists(String codePizza) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
