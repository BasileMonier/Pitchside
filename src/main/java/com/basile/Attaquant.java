package com.basile;


public class Attaquant extends Joueur{
    private int vitesse;
    private int tir;

    public Attaquant(String nom, int age, int technique, int physique, int mental, int vitesse, int tir) {
        super(nom, age, Joueur.Poste.ATTAQUANT, technique, physique, mental);
        this.vitesse = vitesse;
        this.tir = tir;
    }
}