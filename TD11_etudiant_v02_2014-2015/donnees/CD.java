package donnees;

import java.util.ArrayList;
import java.util.List;

public class CD {
	private String nomArtiste;
	private String titre;
	private List<InfoPiste> pistes;

	public CD(String nomArtiste, String titre) {
		this.nomArtiste = nomArtiste;
		this.titre = titre;
		this.pistes = new ArrayList<>();
	}

	public String getNomArtiste() {
		return nomArtiste;
	}

	public String getTitre() {
		return titre;
	}

	public void ajoutePiste(InfoPiste piste) {
		pistes.add(piste);
	}

	public List<InfoPiste> getPistes() {
		return pistes;
	}

	@Override
	public String toString() {
		return "CD [nomArtiste=" + nomArtiste + ", titre=" + titre + ", pistes=" + pistes + "]";
	}

	public int compareToParTitre(CD autre) {
		return this.titre.compareTo(autre.getTitre());
	}

	public int compareToParArtiste(CD autre) {
		return this.nomArtiste.compareTo(autre.getNomArtiste());
	}
}
