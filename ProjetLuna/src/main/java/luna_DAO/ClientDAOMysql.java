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
				client.setCartedefidelité(result.getInt("cartedefidelité"));
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
		return null;
	}

	@Override
	public void insertClient(Client client) {
	}

	public ClientDAO login(String login, String password) {
		return null;
	}

	@Override
	public void removeClient(int clientID) {
	}

	@Override
	public void updateClient(Client client) {
	}

}
