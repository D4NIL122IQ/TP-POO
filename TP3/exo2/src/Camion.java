public class Camion extends Vehicule {
    private String cargaison;

    public Camion(float vitesse, int annee, double prix, String cargaion) {
        super(annee, vitesse, prix);
        this.cargaison = cargaion;
    }

    public String getCargaison() {
        return cargaison;
    }

    public void setCargaison(String cargaison) {
        this.cargaison = cargaison;
    }

    @Override
    public void accelerer() {
        System.out.println("Le camion accelere ! ");
    }

    @Override
    public void demarrer() {
        System.out.println("Le camion a demarre");
    }

    @Override
    public void chargeCargaison() {
        System.out.println("la cargaison charge est :" + cargaison);
    }
}
