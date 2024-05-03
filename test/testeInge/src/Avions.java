public class Avions {
    protected String immatriculation;
    protected String compagnie;
    protected int vitesse;
    protected boolean etat;

    public Avions(String immatriculation, String compagnie, int vitesse, boolean etat) {
        this.immatriculation = immatriculation;
        this.compagnie = compagnie;
        if (vitesse >= 0) {
            this.vitesse = vitesse;
        } else {
            this.vitesse = 0;
        }
        this.etat = etat;
    }

    public String getCompagnie() {
        return compagnie;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public int getVitesse() {
        return vitesse;
    }

    public boolean getEtat() {
        return etat;
    }

    public void setCompagnie(String compagnie) {
        this.compagnie = compagnie;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public void demarrer() {
        etat = true;
    }

    public void arreter() {
        etat = false;
    }

    public void accelerer() {
        this.vitesse += 100;
    }

    public void freiner() {
        if (vitesse - 100 >= 0) {
            this.vitesse -= 100;
        }
    }

    public void decoller() {
        if (this.vitesse >= 300) {
            System.out.println("l'avion decolle");
        } else {
            System.out.println("manque de vitesse, decollage impossible");
        }
    }

    public void atterir() {
        if (this.vitesse < 300) {
            System.out.println("l'avion atterrit");
        } else {
            System.out.println("vitesse trop elever, veuillez ralentir pour atterrir");
        }
    }
}
