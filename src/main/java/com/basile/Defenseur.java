package com.basile;

import Joueur;

public class Defenseur extends Joueur{

    public Defenseur (String nom, int age, int technique, int physique, int mental, int vitesse, int interception) {
        super(nom, age, Joueur.Poste.DEFENSEUR, technique, physique, mental);
        this.vitesse = vitesse;
        this.interception = interception;
    }
}