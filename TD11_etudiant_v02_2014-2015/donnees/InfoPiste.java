package donnees;

public class InfoPiste {
	private String titre;
	private int duree;  // durée en secondes

	public InfoPiste(String titre, int duree) {
		this.titre = titre;
		this.duree = duree;
	}

	public String getTitre() {
		return titre;
	}

	public int getDuree() {
		return duree;
	}

	@Override
	public String toString() {
		return titre + " (" + duree + " sec)";
	}
}
