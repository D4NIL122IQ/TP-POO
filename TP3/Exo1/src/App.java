public class App {
    public static void main(String[] args) throws Exception {
        Voiture_Composee nouvelleVoiture = new Voiture_Composee(3, true, 310);
        // Vehicule newVH = new Vehicule(true, 430);

        nouvelleVoiture.setMoteur(false);

        nouvelleVoiture.caratéristiqueVéhiculeComposee();

    }
}
