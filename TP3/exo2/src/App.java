//exo 2 serie 3@Overrid   
public class App {
    public static void main(String[] args) throws Exception {
        Camion rn = new Camion(110, 2012, 250000, "pneu");

        rn.demarrer();
        rn.chargeCargaison();
        rn.accelerer();
        rn.caracteristiqueVehiculle();

    }
}
