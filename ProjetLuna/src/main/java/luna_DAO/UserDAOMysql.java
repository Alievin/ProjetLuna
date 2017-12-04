package luna_DAO;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import luna_Class.User;

public class UserDAOMysql implements UserDAO {
	
	Connection conn = null;
	Statement state = null;
	ResultSet result = null;
	
	public UserDAOMysql(Connection connection){
		this.conn=connection;
	}

	@Override
	public List<User> getAllUser() {
		List<User> users=new ArrayList<User>();
		User user=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT * FROM User");

			while (result.next()) {
				user=new User();
				user.setId(result.getInt("id"));
				user.setLogin(result.getString("login"));
				user.setPass(result.getString("pass"));
				user.setRole(result.getInt("role"));
				users.add(user);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

	@Override
	public User getUser(int userID) {
		User user=null;
		try {
			
			state = conn.createStatement();
			result = state.executeQuery("SELECT "+userID+" FROM User");

			while (result.next()) {
				user=new User();
				user.setId(result.getInt("id"));
				user.setLogin(result.getString("login"));
				user.setPass(result.getString("pass"));
				user.setRole(result.getInt("role"));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

	@Override
	public void insertUser(User user) {
		try 
		{
			state=conn.createStatement();
			state.executeUpdate("INSERT INTO user(login, pass, role) "
					+ "VALUES ('"+user.getLogin()+"','"+user.getPass()+"','"+user.getRole()+"')");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	

	@Override
	public void removeUser(int userID) {
		try 
		{
			state=conn.createStatement();
			state.executeUpdate("DELETE FROM user WHERE id='"+userID+"'");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}

	@Override
	public void updateUser(User user) {
		try 
		{
			state=conn.createStatement();
			state.executeUpdate("UPDATE user SET login='"+user.getLogin()+
					"',pass='"+user.getPass()+
					"',role='"+user.getRole()+
					"' WHERE id='"+user.getId()+"'");
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
	}
	
	@Override
	public   boolean getUserConnection(String user, String passwd){
		
		try 
		{
			state=conn.createStatement();
			ResultSet resultat= state.executeQuery("select login,role from user where login='"+user+"' and pass='"+passwd+"'");
			if(resultat.next()!=false)
			{
				return true;
			}
			else
			{
				return false;
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return false;
	}

}