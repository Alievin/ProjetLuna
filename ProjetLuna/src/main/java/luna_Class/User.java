package luna_Class;

public class User {

	// - - DÉCLARATION DES ATTRIBUTS DE LA CLASSE "user" - - //
	private int id;
	private String login;
	private String pass;
	private int role;

	// CONSTRUCTEUR
	public User(int id, String login, String pass, int role) {
		super();
		this.id = id;
		this.login = login;
		this.pass = pass;
		this.role = role;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "id" - - //
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "login" - - //
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "pass" - - //
	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "role" - - //
	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}

}
