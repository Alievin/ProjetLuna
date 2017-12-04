package luna_DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import luna_Class.Command;

public class CommandDAOMysql implements CommandDAO {
	
	Connection conn = null;
	Statement state = null;
	ResultSet result = null;
	
	public CommandDAOMysql(Connection connection){
		this.conn=connection;
	}

	@Override
	public List<Command> getAllCommand() {
		List<Command> commands=new ArrayList<Command>();
		Command command=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM Command");

			while (result.next()) {
				command=new Command();
				command.setId(result.getInt("id"));
				command.setLibelle(result.getString("libelle"));
				command.setIdclient(result.getInt("idclient"));
				command.setDatecommand(result.getDate("datecommand"));
				commands.add(command);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commands;
	}

	@Override
	public Command getCommand(int commandID) {
		return null;
	}

	@Override
	public void insertCommand(Command command) {
	}

	public CommandDAO login(String login, String password) {
		return null;
	}

	@Override
	public void removeCommand(int commandID) {
	}

	@Override
	public void updateCommand(Command command) {
	}

}