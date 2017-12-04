package luna_DAO;
import java.util.List;


import luna_DAO.ArticleDAO;
import com.global.singleton.GlobalConnection;

import luna_Class.Article;
import luna_Class.Client;
import luna_Class.Command;
import luna_Class.Commandcreer;
import luna_Class.User;


public class DaoTest {

	public static void main(String[] args) throws NullPointerException {
		ClientDAO clientDAO=new ClientDAOMysql(GlobalConnection.getInstance());
		List<Client> clients = clientDAO.getAllClient();
		System.out.println("\n------------------------------");
		for (Client client : clients) {
			System.out.print("\t" + client.getId() + "\t |");
			System.out.print("\t" + client.getDateCreation() + "\t |");
			System.out.print("\t" + client.getCartedefidelite() + "\t |");
			System.out.print("\t" + client.getNom() + "\t |");
			System.out.print("\t" + client.getPrenom() + "\t |");
			System.out.print("\t" + client.getAdresse() + "\t |");
			System.out.print("\t" + client.getCodePostal() + "\t |");
			System.out.print("\t" + client.getFixe() + "\t |");
			System.out.print("\t" + client.getMobile() + "\t |");
			System.out.print("\t" + client.getEmail() + "\t |");
			System.out.print("\t" + client.getRemarques() + "\t |");
			System.out.println("\n------------------------------");
		}
		
		System.out.println();
		ArticleDAO articleDAO=new ArticleDAOMysql(GlobalConnection.getInstance());
		List<Article> articles = articleDAO.getAllArticle();
		System.out.println("\n------------------------------------------------------------------------------------------------------------------");
		for (Article article : articles) {
			System.out.print("\t" + article.getId() + "\t |");
			System.out.print("\t" + article.getCodeCategorie() + "\t |");
			System.out.print("\t" + article.getCategorie() + "\t |");
			System.out.print("\t" + article.getDesignation() + "\t |");
			System.out.print("\t" + article.getQuantitestock() + "\t |");
			System.out.print("\t" + article.getPrixUnitaire() + "\t |");
			System.out.println("\n------------------------------------------------------------------------------------------------------------------");
		}
		
			System.out.println();
			CommandDAO CommandDAO=new CommandDAOMysql(GlobalConnection.getInstance());
			List<Command> commands = CommandDAO.getAllCommand();
			System.out.println("\n------------------------------------------------------------------------------------------------------------------");
			for (Command command : commands) {
				System.out.print("\t" + command.getId() + "\t |");
				System.out.print("\t" + command.getLibelle() + "\t |");
				System.out.print("\t" + command.getIdclient() + "\t |");
				System.out.print("\t" + command.getDatecommand() + "\t |");
				System.out.println("\n------------------------------------------------------------------------------------------------------------------");
		}

			System.out.println();
			CommandcreerDAO CommandcreerDAO=new CommandcreerDAOMysql(GlobalConnection.getInstance());
			List<Commandcreer> commandcreers = CommandcreerDAO.getAllCommandcreer();
			System.out.println("\n------------------------------------------------------------------------------------------------------------------");
			for (Commandcreer commandcreer : commandcreers) {
				System.out.print("\t" + commandcreer.getId() + "\t |");
				System.out.print("\t" + commandcreer.getIdcommand() + "\t |");
				System.out.print("\t" + commandcreer.getIdArticle() + "\t |");
				System.out.print("\t" + commandcreer.getQuantite() + "\t |");
				System.out.println("\n------------------------------------------------------------------------------------------------------------------");		
		}
			System.out.println();
			UserDAO UserDAO=new UserDAOMysql(GlobalConnection.getInstance());
			List<User> users = UserDAO.getAllUser();
			System.out.println("\n------------------------------------------------------------------------------------------------------------------");
			for (User user : users) {
				System.out.print("\t" + user.getId() + "\t |");
				System.out.print("\t" + user.getLogin() + "\t |");
				System.out.print("\t" + user.getPass() + "\t |");
				System.out.print("\t" + user.getRole() + "\t |");
				System.out.println("\n------------------------------------------------------------------------------------------------------------------");
			
		}
	}

}
