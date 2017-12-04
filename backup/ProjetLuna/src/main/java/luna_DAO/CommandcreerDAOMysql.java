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
				commandcreer.setQuantité(result.getInt("quantité"));
				commandcreers.add(commandcreer);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commandcreers;
	}

	public Commandcreer getCommandcreer(int commandcreerID) {
		return null;
	}

	@Override
	public void insertCommandcreer(Commandcreer commandcreer) {
	}

	public CommandcreerDAO login(String login, String password) {
		return null;
	}

	@Override
	public void removeCommandcreer(int commandcreerID) {
	}

	@Override
	public void updateCommandcreer(Commandcreer commandcreer) {
	}

}