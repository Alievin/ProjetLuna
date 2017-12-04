package luna_Class;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class Connect {
	//
	public static void main(String[] args) {
		try {
			// Driver SQL
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("DRIVER OK !");

			String url = "jdbc:mysql://localhost:3306/luna";
			String user = "root";
			String passwd = "";

			// driverManager essaye l'instance de connexion vers la base

			Connection conn = (Connection) DriverManager.getConnection(url, user, passwd);
			System.out.println("Connection effective !");

			// Creation objet statement
			Statement state = conn.createStatement();

			// Objet ResultSet contient resultat de requete SQL
			ResultSet result = state.executeQuery("SELECT*FROM client");
			System.out.println("\n------------------------------");
			while (result.next()) {
				System.out.print("\t" + result.getInt("id") + "\t |");
				System.out.print("\t" + result.getDate("dateCreation") + "\t |");
				System.out.print("\t" + result.getInt("cartedefidelite") + "\t |");
				System.out.println("\t" + result.getString("prenom") + "\t |");

			}
			result.close();
			state.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
