package luna_Class;

public class Article {

	// - - D�CLARATION DES ATTRIBUTS DE LA CLASSE "article" - - //
	private int id;
	private int codeCat�gorie;
	private String Cat�gorie;
	private String designation;
	private int quantit�stock;
	private int prixUnitaire;

	// CONSTRUCTEUR
	public Article(int id, int codeCat�gorie, String cat�gorie, String designation, int quantit�stock,
			int prixUnitaire) {
		super();
		this.id = id;
		this.codeCat�gorie = codeCat�gorie;
		Cat�gorie = cat�gorie;
		this.designation = designation;
		this.quantit�stock = quantit�stock;
		this.prixUnitaire = prixUnitaire;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "id" - - //
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "codeCat�gorie" - - //
	public int getCodeCat�gorie() {
		return codeCat�gorie;
	}

	public void setCodeCat�gorie(int codeCat�gorie) {
		this.codeCat�gorie = codeCat�gorie;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "Cat�gorie" - - //
	public String getCat�gorie() {
		return Cat�gorie;
	}

	public void setCat�gorie(String cat�gorie) {
		Cat�gorie = cat�gorie;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "designation" - - //
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "quantit�stock" - - //
	public int getQuantit�stock() {
		return quantit�stock;
	}

	public void setQuantit�stock(int quantit�stock) {
		this.quantit�stock = quantit�stock;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "prixUnitaire" - - //
	public int getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

}
