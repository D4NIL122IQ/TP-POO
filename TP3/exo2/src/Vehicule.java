public class Vehicule {
    protected int numMatricule;
    protected int anneeModele;
    protected float vitesseMax;
    protected double prixCreation;
    private static int nbrMat = 0;

    public Vehicule(int annee, float vitesse, double prix) {
        ++nbrMat;
        this.numMatricule = nbrMat;
        this.prixCreation = prix;
        this.vitesseMax = vitesse;
        this.anneeModele = annee;

    }

    // getters
    public int getNumMatricule() {
        return numMatricule;
    }

    public double getPrixCreation() {
        return prixCreation;
    }

    public int getAnneeModele() {
        return anneeModele;
    }

    public float getVitesseMax() {
        return vitesseMax;
    }

    // setters
    public void setPrixCreation(double prixCreation) {
        this.prixCreation = prixCreation;
    }

    public void setAnneeModele(int anneeModele) {
        this.anneeModele = anneeModele;
    }

    public void setVitesseMax(int vitesseMax) {
        this.vitesseMax = vitesseMax;
    }

    public void caracteristiqueVehiculle() {
        System.out.println(
                "Numero d'imatriculation : " + numMatricule + " annee : " + anneeModele + " prix : " + prixCreation);
    }

    public void vitesseMax() {
        System.out.println("La vitesse max de ce vehicule est : " + vitesseMax);
    }

    public void accelerer() {
        System.out.println("Le vehicule accelere ! ");
    }

    public void demarrer() {
        System.out.println("Le vehicule a demarree");
    }

    public void chargeCargaison() {
        System.out.println("La cargaison est charge dans le vehicule");
    }
}
