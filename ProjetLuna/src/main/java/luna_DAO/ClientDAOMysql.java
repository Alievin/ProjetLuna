package luna_DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import luna_Class.Client;

public class ClientDAOMysql implements ClientDAO {
	
	Connection conn = null;
	Statement state = null;
	ResultSet result = null;
	
	public ClientDAOMysql(Connection connection){
		this.conn=connection;
	}

	@Override
	public List<Client> getAllClient() {
		List<Client> clients=new ArrayList<Client>();
		Client client=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM Client");

			while (result.next()) {
				client=new Client();
				client.setId(result.getInt("id"));
				client.setDateCreation(result.getDate("dateCreation"));
				client.setCartedefidelite(result.getInt("cartedefidelite"));
				client.setNom(result.getString("nom"));
				client.setPrenom(result.getString("prenom"));
				client.setAdresse(result.getString("adresse"));
				client.setCodePostal(result.getInt("codePostal"));
				client.setFixe(result.getInt("fixe"));
				client.setMobile(result.getInt("mobile"));
				client.setEmail(result.getString("email"));
				client.setRemarques(result.getString("remarques"));
				clients.add(client);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clients;
	}

	@Override
	public Client getClient(int clientID) {
		Client client=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM Client");

			while (result.next()) {
				client=new Client();
				client.setId(result.getInt("id"));
				client.setDateCreation(result.getDate("dateCreation"));
				client.setCartedefidelite(result.getInt("cartedefidelite"));
				client.setNom(result.getString("nom"));
				client.setPrenom(result.getString("prenom"));
				client.setAdresse(result.getString("adresse"));
				client.setCodePostal(result.getInt("codePostal"));
				client.setFixe(result.getInt("fixe"));
				client.setMobile(result.getInt("mobile"));
				client.setEmail(result.getString("email"));
				client.setRemarques(result.getString("remarques"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return client;

	}

	@Override
	public void insertClient(Client client) {
		try 
		{
			state=conn.createStatement();
			state.executeUpdate("INSERT INTO client(dateCreation, cartedefidelite, nom, prenom, adresse, codePostal, fixe, mobile, email, remarques) "
					+ "VALUES ('"+client.getDateCreation()+
					"','"+client.getCartedefidelite()+
					"','"+client.getNom()+
					"','"+client.getPrenom()+
					"','"+client.getAdresse()+
					"','"+client.getCodePostal()+
					"','"+client.getFixe()+
					"','"+client.getMobile()+
					"','"+client.getEmail()+
					"','"+client.getRemarques()+"')");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}


	@Override
	public void removeClient(int clientID) {
		try 
		{
			state=conn.createStatement();
			state.executeUpdate("DELETE FROM client WHERE id='"+clientID+"'");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void updateClient(Client client) {
		try 
		{
			state=conn.createStatement();
			state.executeUpdate("UPDATE client SET dateCreation='"+client.getDateCreation()+
					"',cartedefidelite='"+client.getCartedefidelite()+
					"',prenom='"+client.getPrenom()+
					"',nom='"+client.getNom()+
					"',adresse='"+client.getAdresse()+
					"',codePostal='"+client.getCodePostal()+
					"',fixe='"+client.getFixe()+
					"',mobile='"+client.getMobile()+
					"',email='"+client.getEmail()+
					"',remarques='"+client.getRemarques()+
					"' WHERE id='"+client.getId()+"'");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

}
