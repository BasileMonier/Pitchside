public class Vehicule {
    private String marque;
    private int vitesseMax;

    public Vehicule(String marque, int vitesseMax) {
        this.marque = marque;
        this.vitesseMax = vitesseMax;
    }

    public String getMarque() {
        return marque;
    }

    public int getVitesseMax(){
        return vitesseMax;
    }
}

void main() {
    Vehicule voiture = new Vehicule("Peugeot", 180);
}

