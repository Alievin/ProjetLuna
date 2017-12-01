package luna_Class;

public class Commandcreer {
	//
	// - - DÉCLARATION DES ATTRIBUTS DE LA CLASSE "commandcreer" - - //
	private int id;
	private int idcommand;
	private int idArticle;
	private int quantité;

	// CONSTRUCTEUR
	public Commandcreer(int id, int idcommand, int idArticle, int quantité) {
		super();
		this.id = id;
		this.idcommand = idcommand;
		this.idArticle = idArticle;
		this.quantité = quantité;
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

	// - - GETTER & SETTER DE L'ATTRIBUT "quantité" - - //
	public int getQuantité() {
		return quantité;
	}

	public void setQuantité(int quantité) {
		this.quantité = quantité;
	}

}
