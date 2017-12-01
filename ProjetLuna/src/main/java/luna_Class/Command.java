package luna_Class;

import java.util.Date;

public class Command {
	//sdfghjk
	// - - DÉCLARATION DES ATTRIBUTS DE LA CLASSE "command" - - //
	private int id;
	private String libelle;
	private int idclient;
	private Date datecommand;

	// CONSTRUCTEUR
	public Command(int id, String libelle, int idclient, Date datecommand) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.idclient = idclient;
		this.datecommand = datecommand;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "id" - - //
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "libelle" - - //
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "idclient" - - //
	public int getIdclient() {
		return idclient;
	}

	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}

	// - - GETTER & SETTER DE L'ATTRIBUT "datecommand" - - //
	public Date getDatecommand() {
		return datecommand;
	}

	public void setDatecommand(Date datecommand) {
		this.datecommand = datecommand;
	}

}
