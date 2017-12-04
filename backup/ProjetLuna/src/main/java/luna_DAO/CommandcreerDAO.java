package luna_DAO;

import java.util.List;
import luna_Class.Commandcreer;


public interface CommandcreerDAO {
	public void insertCommandcreer(Commandcreer commandcreer);
	public void updateCommandcreer(Commandcreer commandcreer);
	public void removeCommandcreer(int commandcreerID);
	public Commandcreer getCommandcreer(int commandcreerID);
	public List<Commandcreer> getAllCommandcreer();
}
