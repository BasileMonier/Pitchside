package com.basile;

public class Milieu extends Joueur {

    public Milieu (String nom, int age, int technique, int physique, int mental, int vitesse, int passe) {
        super (nom, age, technique, physique, mental);
        this.vitesse = vitesse;
        this.passe = passe;
    }
}