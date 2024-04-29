public class Voiture extends Vehicule {
    private int nbrPorte;

    public Voiture(float vitesse, int annee, double prix, int np) {
        super(annee, vitesse, prix);
        this.nbrPorte = np;
    }

    public int getNbrPorte() {
        return nbrPorte;
    }

    public void setNbrPorte(int nbrPorte) {
        this.nbrPorte = nbrPorte;
    }

    @Override
    public void demarrer() {
        System.out.println("La voiture a demarree");
    }

    @Override
    public void accelerer() {
        System.out.println("La voiture accelere ! ");
    }

    @Override
    public void caracteristiqueVehiculle() {
        System.out.println(
                "Numero d'imatriculation : " + this.numMatricule + " annee : " + this.anneeModele
                        + " nombre de porte : " + this.nbrPorte + " prix : " + this.prixCreation);
    }

    @Override
    public void chargeCargaison() {
    }
}
