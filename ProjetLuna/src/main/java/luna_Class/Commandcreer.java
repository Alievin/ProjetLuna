package luna_Class;

public class Commandcreer {
	//
	// - - DeCLARATION DES ATTRIBUTS DE LA CLASSE "commandcreer" - - //
	private int id;
	private int idcommand;
	private int idArticle;
	private int quantite;

	// CONSTRUCTEUR
	public Commandcreer(int id, int idcommand, int idArticle, int quantite) {
		super();
		this.id = id;
		this.idcommand = idcommand;
		this.idArticle = idArticle;
		this.quantite = quantite;
	}

	public Commandcreer() {
		// TODO Auto-generated constructor stub
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "id" - - //
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "idcommand" - - //
	public int getIdcommand() {
		return idcommand;
	}

	public void setIdcommand(int idcommand) {
		this.idcommand = idcommand;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "idArticle" - - //
	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "quantite" - - //
	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

}
