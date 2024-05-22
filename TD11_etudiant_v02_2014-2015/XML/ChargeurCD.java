package XML;

import donnees.CD;
import donnees.InfoPiste;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class ChargeurCD {
	private String fichier;

	public ChargeurCD(String fichier) {
		this.fichier = fichier;
	}

	public CD chargerCD() throws Exception {
		File xmlFile = new File(fichier);
		DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
		Document doc = dBuilder.parse(xmlFile);

		doc.getDocumentElement().normalize();

		String artiste = doc.getElementsByTagName("artist").item(0).getTextContent();
		String titre = doc.getElementsByTagName("title").item(0).getTextContent();
		CD cd = new CD(artiste, titre);

		NodeList nList = doc.getElementsByTagName("track");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Element eElement = (Element) nList.item(temp);
			String titrePiste = eElement.getElementsByTagName("title").item(0).getTextContent();
			int dureePiste = Integer.parseInt(eElement.getElementsByTagName("duration").item(0).getTextContent());
			cd.ajoutePiste(new InfoPiste(titrePiste, dureePiste));
		}
		return cd;
	}
}
