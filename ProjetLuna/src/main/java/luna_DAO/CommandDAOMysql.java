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
				command.setDatecommand(result.getString("datecommand"));
				commands.add(command);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return commands;
	}

	@Override
	public Command getCommand(int commandID) {
		Command command=null;
		try {			
			state = conn.createStatement();
			result = state.executeQuery("SELECT "+commandID+" FROM Command");

			while (result.next()) {
				command=new Command();
				command.setId(result.getInt("id"));
				command.setLibelle(result.getString("libelle"));
				command.setIdclient(result.getInt("idclient"));
				command.setDatecommand(result.getString("datecommand"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return command;
	}

	@Override
	public void insertCommand(Command command) {
		try 
		{
			
			state = conn.createStatement();
			state.executeUpdate("INSERT INTO command (libelle, idclient, datecommand) VALUES  ('"+command.getLibelle()+"', '"
																							   	 +command.getIdclient()+"', '"
																								 +command.getDatecommand()+"'");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public CommandDAO login(String login, String password) {
		return null;
	}

	@Override
	public void removeCommand(int commandID) {
		try 
		{			
			state = conn.createStatement();
			state.executeUpdate("DELETE FROM command WHERE id='"+commandID+"'");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateCommand(Command command) {
		try 
		{			
			state = conn.createStatement();
			state.executeUpdate("UPDATE commmand SET libelle='"+command.getLibelle()
											   +"', idclient='"+command.getIdclient()
											   +"', datecommand='"+command.getDatecommand()
											   +"' WHERE id='"+command.getId()+"'");
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
	}

}