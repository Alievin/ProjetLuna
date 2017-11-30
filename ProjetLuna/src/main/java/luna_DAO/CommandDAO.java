package luna_DAO;
import java.util.List;

import luna_Class.Command;

public interface CommandDAO {
	
	public void insertCommand(Command command);
	public void updateCommand(Command command);
	public void removeCommand(int commandId);
	public Command getCommand(int commandId);
	public List<Command> getAllCommand();
}
