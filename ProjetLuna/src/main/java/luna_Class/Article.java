package luna_Class;

public class Article {
	public Article() {
		super();
	}

	//
	// - - DeCLARATION DES ATTRIBUTS DE LA CLASSE "article" - - //
	private int id;
	private int codeCategorie;
	private String Categorie;
	private String designation;
	private int quantitestock;
	private int prixUnitaire;

	// CONSTRUCTEUR
	public Article(int id, int codeCategorie, String categorie, String designation, int quantitestock,
			int prixUnitaire) {
		super();
		this.id = id;
		this.codeCategorie = codeCategorie;
		this.Categorie = categorie;
		this.designation = designation;
		this.quantitestock = quantitestock;
		this.prixUnitaire = prixUnitaire;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "id" - - //
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "codeCategorie" - - //
	public int getCodeCategorie() {
		return codeCategorie;
	}

	public void setCodeCategorie(int codeCategorie) {
		this.codeCategorie = codeCategorie;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "Categorie" - - //
	public String getCategorie() {
		return Categorie;
	}

	public void setCategorie(String categorie) {
		Categorie = categorie;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "designation" - - //
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "quantitestock" - - //
	public int getQuantitestock() {
		return quantitestock;
	}

	public void setQuantitestock(int quantitestock) {
		this.quantitestock = quantitestock;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "prixUnitaire" - - //
	public int getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

}
