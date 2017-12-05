package luna_Class;


public class Client {
	public Client() {
		super();
	}

	////////
	// - - DeCLARATION DES ATTRIBUTS DE LA CLASSE "client" - - //
	private int id;
	private String dateCreation;
	private int cartedefidelite;
	private String prenom;
	private String nom;
	private String adresse;
	private int codePostal;
	private int fixe;
	private int mobile;
	private String email;
	private String remarques;

	// CONSTRUCTEUR
	public Client(String dateCreation, int cartedefidelite, String prenom, String nom, String adresse, int codePostal, int fixe,
			int mobile, String email, String remarques) {
		super();
		this.dateCreation = dateCreation;
		this.cartedefidelite = cartedefidelite;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.fixe = fixe;
		this.mobile = mobile;
		this.email = email;
		this.remarques = remarques;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "id" - - //
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "dateCreation" - - //
	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "cartedefidelite" - - //
	public int getCartedefidelite() {
		return cartedefidelite;
	}

	public void setCartedefidelite(int cartedefidelite) {
		this.cartedefidelite = cartedefidelite;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "prenom" - - //
	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "nom" - - //
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "adresse" - - //
	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	// - - GETTER & SETTER DE L'ATTRIBUT "codePostal" - - //
	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}
	// - - GETTER & SETTER DE L'ATTRIBUT "fixe" - - //
	public int getFixe() {
		return fixe;
	}

	public void setFixe(int fixe) {
		this.fixe = fixe;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "mobile" - - //
	public int getMobile() {
		return mobile;
	}

	public void setMobile(int mobile) {
		this.mobile = mobile;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "email" - - //
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "remarques" - - //
	public String getRemarques() {
		return remarques;
	}

	public void setRemarques(String remarques) {
		this.remarques = remarques;
	}

}
