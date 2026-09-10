Public class Joueur {
    private String nom;
    private int age;
    private Poste poste;
    private int stat_technique;
    private int stat_physique;
    private int stat_mental;

    public Joueur(String nom, int age, Poste poste, int stat_technique, int stat_physique, int stat_mental) {
        this.nom = nom;
        this.age = age;
        this.poste = poste;
        this.stat_technique = stat_technique;
        this.stat_physique = stat_physique;
        this.stat_mental = stat_mental;
    }

    public enum Poste {
        GARDIEN, DEFENSEUR, MILIEU, ATTAQUANT
    }




}