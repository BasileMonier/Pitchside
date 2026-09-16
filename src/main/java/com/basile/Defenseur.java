package com.basile;


public class Defenseur extends Joueur{
    private int vitesse;
    private int interception;


    public Defenseur (String nom, int age, int technique, int physique, int mental, int vitesse, int interception) {
        super(nom, age, Joueur.Poste.DEFENSEUR, technique, physique, mental);
        this.vitesse = vitesse;
        this.interception = interception;
    }
}