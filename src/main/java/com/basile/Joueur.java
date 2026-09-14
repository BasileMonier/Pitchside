import javax.swing.*;

public class Joueur {
    private String nom;
    private int age;
    private Poste poste;
    private int technique;
    private int physique;
    private int mental;

    public Joueur(String nom, int age, Poste poste, int technique, int physique, int mental) {
        this.nom = nom;
        this.age = age;
        this.poste = poste;
        setTechnique(technique);
        setPhysique(physique);
        setMental(mental);
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

    public int getTechnique(){
        return technique;
    }

    public int getPhysique() {
        return physique;
    }

    public int getMental() {
        return mental;
    }

    public void setTechnique(int technique) {
        if (technique < 0 || technique > 100) {
            throw new IllegalArgumentException("La valeur doit être comprise entre 0 et 100.");
        }
        this.technique = technique;
    }

    public void setPhysique(int physique) {
        if (physique < 0 || physique> 100) {
            throw  new IllegalArgumentException("La valeur doit être comprise entre 0 et 100.");
        }
        this.physique = physique;
    }

    public void setMental(int mental) {
        if (mental < 0 || mental > 100) {
            throw new IllegalArgumentException("la valeur doit être comprise entre 0 et 100.");
        }
        this.mental = mental;
    }

    public void setPoste(Poste poste) {
        this.poste = poste;
    }

    public int overall(){
        return (technique + physique + mental) / 3;
    }
}

public class Gardien extends Joueur {

    public Gardien (String nom, int age, Poste.gardien, int technique, int physique, int mental, int reflexe, int plongeon) {
        super(nom, age, gardien,  technique, physique, mental);
        this.reflexe = reflexe;
        this.plongeon = plongeon;
    }
}

public class Defenseur extends Joueur{

    public Defenseur (String nom, int age, int technique, int physique, int mental, int vitesse, int interception) {
        super(nom, age, technique, physique, mental, vitesse, interception):
        this.vitesse = vitesse;
        this.interception = interception;
    }
}

public class Milieu extends Joueur {

    public Milieu (String nom, int age, int technique, int physique, int mental, int vitesse, int passe) {
        super (nom, age, technique, physique, mental, vitesse, passe);
        this.vitesse = vitesse;
        this.passe = passe;
    }
}

public class Attaquant extends Joueur{

    public Attaquant(String nom, int age, int technique, int physique, int mental, int vitesse, int tir) {
        super(nom, age, technique, physique, mental, vitesse, tir);
        this.vitesse = vitesse;
        this.tir = tir;
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

