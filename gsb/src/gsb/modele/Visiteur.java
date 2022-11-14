package gsb.modele;

import java.util.ArrayList;

public class Visiteur {
	public String matricule;
	public String nom;
	public String prenom;
	public String login;
	public String mdp;
	public String adresse;
	public String code_postal;
	public String date_entree;
	public String code_unit;
	public String nom_unit;
	public ArrayList<Visiteur> lesVisiteurs;
	
	public Visiteur(String matricule,String nom, String prenom, String login, String mdp, String adresse, String code_postal, String date_entree,
			String code_unit, String nom_unit) {
		this.matricule = matricule;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.mdp = mdp;
		this.adresse = adresse;
		this.code_postal = code_postal;
		this.date_entree = date_entree;
		this.code_unit = code_unit;
		this.nom_unit = nom_unit;
		lesVisiteurs=new ArrayList<Visiteur>();
	}

	public String getMatricule() {
		return matricule;
	}

	public ArrayList<Visiteur> getLesVisiteurs() {
		return lesVisiteurs;
	}

	public void setLesVisiteurs(ArrayList<Visiteur> lesVisiteurs) {
		this.lesVisiteurs = lesVisiteurs;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCode_postal() {
		return code_postal;
	}

	public void setCode_postal(String code_postal) {
		this.code_postal = code_postal;
	}

	public String getDate_entree() {
		return date_entree;
	}

	public void setDate_entree(String date_entree) {
		this.date_entree = date_entree;
	}

	public String getCode_unit() {
		return code_unit;
	}

	public void setCode_unit(String code_unit) {
		this.code_unit = code_unit;
	}

	public String getNom_unit() {
		return nom_unit;
	}

	public void setNom_unit(String nom_unit) {
		this.nom_unit = nom_unit;
	}
	
}
