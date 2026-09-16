package com.basile;

import Joueur;

public class Gardien extends Joueur {

    public Gardien (String nom, int age, int technique, int physique, int mental, int reflexe, int plongeon) {
        super(nom, age, Joueur.Poste.GARDIEN, technique, physique, mental);
        this.reflexe = reflexe;
        this.plongeon = plongeon;
    }
}