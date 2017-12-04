package luna_DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import luna_Class.Commandcreer;

public class CommandcreerDAOMysql implements CommandcreerDAO {
	
	Connection conn = null;
	Statement state = null;
	ResultSet result = null;
	
	public CommandcreerDAOMysql(Connection connection){
		this.conn=connection;
	}

	@Override
	public List<Commandcreer> getAllCommandcreer() {
		List<Commandcreer> commandcreers=new ArrayList<Commandcreer>();
		Commandcreer commandcreer=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM Commandcreer");

			while (result.next()) {
				commandcreer=new Commandcreer();
				commandcreer.setId(result.getInt("id"));
				commandcreer.setIdcommand(result.getInt("idcommande"));
				commandcreer.setIdArticle(result.getInt("idArticle"));
				commandcreer.setQuantite(result.getInt("quantite"));
				commandcreers.add(commandcreer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commandcreers;
	}

	public Commandcreer getCommandcreer(int commandcreerID) {
		Commandcreer commandcreer=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM Commandcreer");

			while (result.next()) {
				commandcreer=new Commandcreer();
				commandcreer.setId(result.getInt("id"));
				commandcreer.setIdcommand(result.getInt("idcommande"));
				commandcreer.setIdArticle(result.getInt("idArticle"));
				commandcreer.setQuantite(result.getInt("quantite"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commandcreer;
	}

	@Override
	public void insertCommandcreer(Commandcreer commandcreer) {
		try 
		{
			
			state = conn.createStatement();
			state.executeUpdate("INSERT INTO commandcreer (idcommande, idArticle, quantite) VALUES  ('"+commandcreer.getIdcommand()+"', '"
																									   +commandcreer.getIdArticle()+"', '"
																								   	   +commandcreer.getQuantite()+"'");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void removeCommandcreer(int commandcreerID) {
		try 
		{			
			state = conn.createStatement();
			state.executeUpdate("DELETE FROM commandcreer WHERE id='"+commandcreerID+"'");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
	}

	@Override
	public void updateCommandcreer(Commandcreer commandcreer) {
		try 
		{			
			state = conn.createStatement();
			state.executeUpdate("UPDATE article SET idcommand='"+commandcreer.getIdcommand()
											   +"', idArticle='"+commandcreer.getIdArticle()
											   +"', quantite='"+commandcreer.getQuantite()
											   +"' WHERE id='"+commandcreer.getId()+"'");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}