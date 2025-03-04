package test_fonctionnel;

import personnages.Gaulois;

import java.util.Random;

public class Druide {
    private String nom;
    private int effetPotionMin;
    private int effetPotionMax;
    private int dosePotion;
    
    public Druide(String nom, int effetPotionMin, int effetPotionMax) {
        this.nom = nom;
        this.effetPotionMin = effetPotionMin;
        this.effetPotionMax = effetPotionMax;
    }
    
    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println("Le Druide " + nom + " : \"" + texte + "\"");
    }

    public void prendreParole() {
        System.out.println("Le Druide " + nom + " prend la parole.");
    }

    public void preparerPotion() {
        Random random = new Random();
        dosePotion = random.nextInt(effetPotionMax - effetPotionMin + 1) + effetPotionMin;
        parler("J'ai concocté 4 doses de potion magique. Elle a une force de " + dosePotion + ".");
    }

    public void boosterGaulois(Gaulois gaulois) {
        if (gaulois.getNom().equals("Obélix")) {
            parler("Non, Obélix Non !... Et tu le sais très bien !");
        } else {
            parler("Tiens " + gaulois.getNom() + ", un peu de potion magique.");
            gaulois.boirePotion(3);
        }
    }
}

