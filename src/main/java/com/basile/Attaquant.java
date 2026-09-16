package com.basile;

public class Attaquant extends Joueur{

    public Attaquant(String nom, int age, int technique, int physique, int mental, int vitesse, int tir) {
        super(nom, age, technique, physique, mental);
        this.vitesse = vitesse;
        this.tir = tir;
    }
}