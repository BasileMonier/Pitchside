public class Joueur {
    private String nom;
    private int age;
    private Poste poste;
    private int stat_technique;
    private int stat_physique;
    private int stat_mental;

    public Joueur(String nom, int age, Poste poste, int stat_technique, int stat_physique, int stat_mental) {
        this.nom = nom;
        this.age = age;
        this.poste = poste;
        setStat_technique(stat_technique);
        setStat_physique(stat_physique);
        setStat_mental(stat_mental);
    }

    public enum Poste {
        GARDIEN, DEFENSEUR, MILIEU, ATTAQUANT
    }

    public String getNom(){
        return nom;
    }

    public int getAge(){
        return age;
    }

    public Poste getPoste(){
        return poste;
    }

    public int getStat_technique(){
        return stat_technique;
    }

    public int getStat_physique() {
        return stat_physique;
    }

    public int getStat_mental() {
        return stat_mental;
    }

    public void setStat_technique(int stat_technique) {
        if (stat_technique < 0 || stat_technique > 100) {
            throw new IllegalArgumentException("La valeur doit être comprise entre 0 et 100.");
        }
        this.stat_technique = stat_technique;
    }

    public void setStat_physique(int stat_physique) {
        if (stat_physique < 0 || stat_physique> 100) {
            throw  new IllegalArgumentException("La valeur doit être comprise entre 0 et 100.");
        }
        this.stat_physique = stat_physique;
    }

    public void setStat_mental(int stat_mental) {
        if (stat_mental < 0 || stat_mental > 100) {
            throw new IllegalArgumentException("la valeur doit être comprise entre 0 et 100.");
        }
        this.stat_mental = stat_mental;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public int overall(){
        return (stat_technique + stat_physique + stat_mental) / 3;
    }
}


void main() {
    Joueur joueur1 = new Joueur("Basile", 22, Joueur.Poste.DEFENSEUR, 72, 81, 80);
    System.out.println(joueur1.overall());

    Joueur joueur2 = new Joueur("Caicedo", 25, Joueur.Poste.MILIEU, 84, 87, 81);
    System.out.println(joueur2.overall());

    Joueur joueur3 = new Joueur("Estevao", 19, Joueur.Poste.ATTAQUANT, 88, 80, 78 );
    System.out.println(joueur3.overall());
}