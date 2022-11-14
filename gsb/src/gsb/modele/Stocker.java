package gsb.modele;

public class Stocker {
	protected String codeStock;
	protected int qteStock; 
	public Visiteur unVisiteur; 
	public Medicament unMedicament;
	
	public Stocker (String codeStock, int qteStock, Visiteur unVisiteur,Medicament unMedicament) {
		this.codeStock=codeStock;
		this.qteStock=qteStock;
		this.unVisiteur=unVisiteur;
		this.unMedicament=unMedicament;
	}

	public String getCodeStock() {
		return codeStock;
	}

	public void setCodeStock(String codeStock) {
		this.codeStock = codeStock;
	}

	public int getQteStock() {
		return qteStock;
	}

	public void setQteStock(int qteStock) {
		this.qteStock = qteStock;
	}

	public Visiteur getUnVisiteur() {
		return unVisiteur;
	}

	public void setUnVisiteur(Visiteur unVisiteur) {
		this.unVisiteur = unVisiteur;
	}

	public Medicament getUnMedicament() {
		return unMedicament;
	}

	public void setUnMedicament(Medicament unMedicament) {
		this.unMedicament = unMedicament;
	}
	
}
