package luna_Class;

import java.util.Date;

public class Client {

	// - - DÉCLARATION DES ATTRIBUTS DE LA CLASSE "client" - - //
	private int id;
	private Date dateCreation;
	private int cartedefidelité;
	private String prenom;
	private String nom;
	private String adresse;
	private int fixe;
	private int mobile;
	private String email;
	private String remarques;

	// CONSTRUCTEUR
	public Client(int id, Date dateCreation, int cartedefidelité, String prenom, String nom, String adresse, int fixe,
			int mobile, String email, String remarques) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.cartedefidelité = cartedefidelité;
		this.prenom = prenom;
		this.nom = nom;
		this.adresse = adresse;
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
	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "cartedefidelité" - - //
	public int getCartedefidelité() {
		return cartedefidelité;
	}

	public void setCartedefidelité(int cartedefidelité) {
		this.cartedefidelité = cartedefidelité;
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
