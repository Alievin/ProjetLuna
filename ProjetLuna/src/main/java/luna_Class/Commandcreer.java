package luna_Class;

public class Commandcreer {
	//
	// - - D�CLARATION DES ATTRIBUTS DE LA CLASSE "commandcreer" - - //
	private int id;
	private int idcommand;
	private int idArticle;
	private int quantit�;

	// CONSTRUCTEUR
	public Commandcreer(int id, int idcommand, int idArticle, int quantit�) {
		super();
		this.id = id;
		this.idcommand = idcommand;
		this.idArticle = idArticle;
		this.quantit� = quantit�;
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

	// - - GETTER & SETTER DE L'ATTRIBUT "quantit�" - - //
	public int getQuantit�() {
		return quantit�;
	}

	public void setQuantit�(int quantit�) {
		this.quantit� = quantit�;
	}

}
