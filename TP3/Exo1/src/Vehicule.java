/**
 * Vehicule
 */
public class Vehicule {

    boolean moteur = false;
    int vitesseMax = 0;

    Vehicule(boolean mtr, int vM) {
        this.moteur = mtr;
        this.vitesseMax = vM;
    }

    public int getVitesseMax() {
        return vitesseMax;
    }

    public void setMoteur(boolean moteur) {
        this.moteur = moteur;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    void caratéristiqueVéhicule() {
        System.out.println("le moteur de ce vehicule : " + moteur);
        System.out.println("la vitesse max du vehicule est de " + vitesseMax);
    }

    void VitesseMax() {
        System.out.println("la vitesse max de ce vehicule : " + vitesseMax);
    }
}