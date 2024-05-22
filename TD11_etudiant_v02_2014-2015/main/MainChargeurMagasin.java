package main;

import java.io.IOException;
import java.util.Scanner;

import donnees.Magasin;
import XML.ChargeurMagasin;

public class MainChargeurMagasin {
	public static void main(String[] args) throws IOException {
		String repertoire = "../magasinCD_donnees/musicbrainzSimple/";
		ChargeurMagasin charge = new ChargeurMagasin(repertoire);
		Magasin resultat = charge.chargerMagasin();
		System.out.println(resultat);

		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		sc.close();

		resultat.trierParTitre();
		System.out.println(resultat);

		resultat.trierParArtiste();
		System.out.println(resultat);
	}
}
