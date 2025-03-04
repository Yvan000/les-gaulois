package test_fonctionnel;

public class Chaudron {
    private int quantitePotion;

    public Chaudron(int quantitePotion) {
        this.quantitePotion = quantitePotion;
    }

    public boolean resterPotion() {
        return quantitePotion == 0;
    }

    public void fabriquerPotion(int dose) {
        quantitePotion += dose;
        System.out.println("La potion a été fabriquée. Quantité actuelle dans le chaudron : " + quantitePotion);
    }

    public void remplirChaudron(int dose) {
        quantitePotion = dose;
        System.out.println("Le chaudron a été rempli avec " + dose + " de potion.");
    }

    public int getQuantitePotion() {
        return quantitePotion;
    }
}
