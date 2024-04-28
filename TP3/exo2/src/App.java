//exo 2 serie 3
public class App {
    public static void main(String[] args) throws Exception {
        Voiture bm = new Voiture(310, 2022, 95000.99, 5);
        Camion rn = new Camion(110, 2012, 250000, "pneu");
        bm.demarrer();
        bm.accelerer();
        bm.setAnneeModele(2024);
        bm.caracteristiqueVehiculle();

        rn.demarrer();
        rn.chargeCargaison();
        rn.accelerer();
        rn.caracteristiqueVehiculle();

    }
}
