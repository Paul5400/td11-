package donnees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Magasin {
	private List<CD> cds;

	public Magasin() {
		this.cds = new ArrayList<>();
	}

	public void ajouteCd(CD cd) {
		cds.add(cd);
	}

	public CD getCd(int index) {
		return cds.get(index);
	}

	public void trierParTitre() {
		Collections.sort(cds, new Comparator<CD>() {
			public int compare(CD cd1, CD cd2) {
				return cd1.compareToParTitre(cd2);
			}
		});
	}

	public void trierParArtiste() {
		Collections.sort(cds, new Comparator<CD>() {
			public int compare(CD cd1, CD cd2) {
				return cd1.compareToParArtiste(cd2);
			}
		});
	}

	@Override
	public String toString() {
		return "Magasin [cds=" + cds + "]";
	}
}
