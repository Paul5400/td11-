package test;

import donnees.CD;
import donnees.Magasin;
import org.junit.Test;
import static org.junit.Assert.*;

public class MagasinTest {

    @Test
    public void testTrierCdsParTitre() {
        Magasin magasin = new Magasin();
        CD cd1 = new CD("Artiste1", "Zebra");
        CD cd2 = new CD("Artiste2", "Alpha");
        CD cd3 = new CD("Artiste3", "Mango");
        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd2);
        magasin.ajouteCd(cd3);

        magasin.trierParTitre();

        assertEquals("Alpha", magasin.getCd(0).getTitre());
        assertEquals("Mango", magasin.getCd(1).getTitre());
        assertEquals("Zebra", magasin.getCd(2).getTitre());
    }

    @Test
    public void testTrierCdsParArtiste() {
        Magasin magasin = new Magasin();
        CD cd1 = new CD("Zebra", "Album1");
        CD cd2 = new CD("Alpha", "Album2");
        CD cd3 = new CD("Mango", "Album3");
        magasin.ajouteCd(cd1);
        magasin.ajouteCd(cd2);
        magasin.ajouteCd(cd3);

        magasin.trierParArtiste();

        assertEquals("Alpha", magasin.getCd(0).getNomArtiste());
        assertEquals("Mango", magasin.getCd(1).getNomArtiste());
        assertEquals("Zebra", magasin.getCd(2).getNomArtiste());
    }
}
