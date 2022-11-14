package gsb.modele.dao;

import java.sql.ResultSet;
import java.util.ArrayList;

import gsb.modele.Visiteur;

public class VisiteurDao {
	
	public static Visiteur rechercher(String numMatricule){
		Visiteur unVisiteur=null;
		ResultSet req = ConnexionMySql.execReqSelection("select * from Visiteur where numeroAffaire="+numMatricule);
		try {
			if (req.next()) {
				String matricule = req.getString(1);
				String nom = req.getString(2);
				String prenom = req.getString(3);
				String login = req.getString(4);
				String mdp = req.getString(5);
				String adresse = req.getString(6);
				String codePostal = req.getString(7);
				String dateEntree = req.getString(8);
				String codeUnit = req.getString(9);
				String nomUnit = req.getString(10);
				// affectation des taches de l'affaire
				Visiteur lesVisiteurs = VisiteurDao.rechercher(matricule);
				unVisiteur = new Visiteur(matricule, nom, prenom, login, mdp, adresse, codePostal, dateEntree, codeUnit, nomUnit);	
				unVisiteur.setLesVisiteurs(lesVisiteurs);
			};
			}
		catch(Exception e) {
			System.out.println("Echec AffaireDao.selectAffaire");
			e.printStackTrace();
			}
		ConnexionMySql.fermerConnexionBd();
		return uneAffaire;
	}
}
