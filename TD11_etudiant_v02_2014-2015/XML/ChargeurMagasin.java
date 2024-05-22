package XML;

import donnees.CD;
import donnees.Magasin;

import java.io.File;
import java.io.IOException;

public class ChargeurMagasin {
	private String repertoire;

	public ChargeurMagasin(String repertoire) {
		this.repertoire = repertoire;
	}

	public Magasin chargerMagasin() throws IOException {
		Magasin magasin = new Magasin();
		File dossier = new File(repertoire);
		if (!dossier.exists() || !dossier.isDirectory()) {
			throw new IOException("Répertoire invalide: " + repertoire);
		}

		File[] fichiers = dossier.listFiles((dir, name) -> name.endsWith(".xml"));
		if (fichiers != null) {
			for (File fichier : fichiers) {
				try {
					ChargeurCD chargeurCD = new ChargeurCD(fichier.getAbsolutePath());
					CD cd = chargeurCD.chargerCD();
					magasin.ajouteCd(cd);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		return magasin;
	}
}
