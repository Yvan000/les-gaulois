package test_fonctionnel;

import personnages.Gaulois;
import personnages.Romain;

public class TestGaulois {
	public static void main(String[] args) {
		Gaulois asterix = new Gaulois("Astérix", 8);
        Gaulois obelix = new Gaulois("Obélix", 16);
        Romain brutus = new Romain("Brutus", 14);
        Druide panoramix = new Druide("Panoramix", 2, 5);

        int dosePotion = 3;
        for (int i = 0; i < 4; i++) {
            panoramix.preparerPotion();
        }

        panoramix.boosterGaulois(obelix);

        panoramix.boosterGaulois(asterix);

        for (int i = 0; i < 3; i++) {
            asterix.frapper(brutus);
        }
    }
}