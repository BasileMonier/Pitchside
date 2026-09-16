package com.basile;

public class Main{
    public static void main (String[] args) {


        Joueur.Poste posteChoisi = Joueur.Poste.MILIEU;
        Joueur joueur1;

        if (posteChoisi == Joueur.Poste.GARDIEN) {
            joueur1 = new Gardien("Basile", 22, 80, 72, 81,82, 78 );
            System.out.println(joueur1.overall());
        } else if (posteChoisi == Joueur.Poste.DEFENSEUR) {
            joueur1 = new Defenseur("Basile", 22, 50, 72, 81, 80, 83);
            System.out.println(joueur1.overall());
        } else if (posteChoisi == Joueur.Poste.MILIEU) {
            joueur1 = new Milieu("Caicedo", 25, 76, 86, 81, 75, 87);
            System.out.println(joueur1.overall());
        } else if (posteChoisi == Joueur.Poste.ATTAQUANT) {
            joueur1 = new Attaquant("Estevao", 19, 86, 77, 73, 88, 84);
            System.out.println(joueur1.overall());
        }
    }
}
