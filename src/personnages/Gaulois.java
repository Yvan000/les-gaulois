package personnages;

public class Gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	public Gaulois(String nom, int force) {
        this.nom = nom;
        this.force = force;
    }

    public String getNom() {
        return nom;
    }

    public void parler(String texte) {
        System.out.println(prendreParole() + "\"" + texte + "\"");
    }

    private String prendreParole() {
        return "Le gaulois " + nom + " : ";
    }

    public void frapper(Romain romain) {
        int forceCoup = (force * effetPotion) / 3;
        System.out.println(nom + " envoie un grand coup dans la mâchoire de " + romain.getNom());
        romain.recevoirCoup(forceCoup);

                if (effetPotion > 1) {
            effetPotion--;
        }
    }

    public void boirePotion(int dose) {
        effetPotion = dose; 
        System.out.println(nom + " boit une potion et sa force passe à " + (force * effetPotion) + " !");
    }

    @Override
    public String toString() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public void setForce(int force) {
        this.force = force;
    }
}
