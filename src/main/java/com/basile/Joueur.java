package com.basile;

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

