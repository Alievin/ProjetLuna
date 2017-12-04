package luna_DAO;

import java.util.List;

import luna_Class.User;

public interface UserDAO {
	public void insertUser(User user);
	public void updateUser(User user);
	public void removeUser(int userID);
	public User getUser(int userID);
	public boolean getUserConnection(String user, String passwd);
	public List<User> getAllUser();
}
