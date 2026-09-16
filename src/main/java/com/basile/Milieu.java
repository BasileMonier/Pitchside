package com.basile;


public class Milieu extends Joueur {
    private int vitesse;
    private int passe;


    public Milieu (String nom, int age, int technique, int physique, int mental, int vitesse, int passe) {
        super (nom, age, Joueur.Poste.MILIEU, technique, physique, mental);
        this.vitesse = vitesse;
        this.passe = passe;
    }
}