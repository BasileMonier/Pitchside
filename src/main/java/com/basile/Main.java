package com.basile;

public class Main() {
    public static void main (String[] args) {


        Joueur.Poste posteChoisi = Joueur.Poste.GARDIEN;
        Joueur joueur1;

        if (posteChoisi == Joueur.Poste.GARDIEN) {
            joueur1 = new Gardien("Basile", 22, Joueur.Poste.GARDIEN, 72, 81);
            System.out.println(joueur1.overall());
        } else if (posteChoisi == Joueur.Poste.DEFENSEUR) {
            joueur1 = new Defenseur("Basile", 22, Joueur.Poste.DEFENSEUR, 72, 81, 80);
            System.out.println(joueur1.overall());
        } else if (posteChoisi == Joueur.Poste.MILIEU) {
            joueur1 = new Milieu("Caicedo", 25, Joueur.Poste.MILIEU, 84, 87, 81);
            System.out.println(joueur1.overall());
        } else if (posteChoisi == Joueur.Poste.ATTAQUANT) {
            joueur1 = new Attaquant("Estevao", 19, technique:15, );
            System.out.println(joueur1.overall());
        }
    }
}
