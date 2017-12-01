package luna_DAO;

import java.util.List;

import luna_Class.User;

public interface UserDAO {
	public void insertUser(User user);
	public void updateUser(User user);
	public void removeUser(int userID);
	public User getUser(int userID);
	public UserDAO login(String login, String password);
	public List<User> getAllUser();
}
