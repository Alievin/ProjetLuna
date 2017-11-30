package luna_Class;

public class Article {

	// - - DÉCLARATION DES ATTRIBUTS DE LA CLASSE "article" - - //
	private int id;
	private int codeCatégorie;
	private String Catégorie;
	private String designation;
	private int quantitéstock;
	private int prixUnitaire;

	// CONSTRUCTEUR
	public Article(int id, int codeCatégorie, String catégorie, String designation, int quantitéstock,
			int prixUnitaire) {
		super();
		this.id = id;
		this.codeCatégorie = codeCatégorie;
		Catégorie = catégorie;
		this.designation = designation;
		this.quantitéstock = quantitéstock;
		this.prixUnitaire = prixUnitaire;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "id" - - //
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "codeCatégorie" - - //
	public int getCodeCatégorie() {
		return codeCatégorie;
	}

	public void setCodeCatégorie(int codeCatégorie) {
		this.codeCatégorie = codeCatégorie;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "Catégorie" - - //
	public String getCatégorie() {
		return Catégorie;
	}

	public void setCatégorie(String catégorie) {
		Catégorie = catégorie;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "designation" - - //
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "quantitéstock" - - //
	public int getQuantitéstock() {
		return quantitéstock;
	}

	public void setQuantitéstock(int quantitéstock) {
		this.quantitéstock = quantitéstock;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "prixUnitaire" - - //
	public int getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(int prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

}
