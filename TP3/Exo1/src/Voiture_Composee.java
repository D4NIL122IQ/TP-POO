public class Voiture_Composee extends Vehicule {
    int nombreDePortes = 2;

    Voiture_Composee(int nP, boolean mtr, int VM) {
        super(mtr, VM);
        this.nombreDePortes = nP;

    }

    public int getNombreDePortes() {
        return nombreDePortes;
    }

    public void setNombreDePortes(int nombreDePortes) {
        this.nombreDePortes = nombreDePortes;
    }

    void caratéristiqueVéhiculeComposee() {
        caratéristiqueVéhicule();
        System.out.println("le nombre de porte de ce vehicule : " + nombreDePortes);
    }
}
