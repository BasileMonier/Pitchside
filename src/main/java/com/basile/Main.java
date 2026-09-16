package com.basile;

void main() {

    Poste posteChoisi = Poste;
    Joueur joueur1;

    if (posteChoisi == Poste.GARDIEN) {
        Joueur joueur1 = new Gardien("Basile", 22, Joueur.Poste.GARDIEN, 72, 81, 80, );
        System.out.println(joueur1.overall());
    }
    Joueur joueur1 = new Joueur("Basile", 22, Joueur.Poste.DEFENSEUR, 72, 81, 80);
    System.out.println(joueur1.overall());

    Joueur joueur2 = new Joueur("Caicedo", 25, Joueur.Poste.MILIEU, 84, 87, 81);
    System.out.println(joueur2.overall());

    Joueur joueur3 = new Joueur("Estevao", 19, Joueur.Poste.ATTAQUANT, 88, 80, 78 );
    System.out.println(joueur3.overall());
}
