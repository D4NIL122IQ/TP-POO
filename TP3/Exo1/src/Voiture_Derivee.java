public class Voiture_Derivee extends Vehicule {
    int nombreDePortes = 2;

    Voiture_Derivee(int nP, boolean mtr, int vm) {
        super(mtr, vm);
        this.nombreDePortes = nP;
    }

    public int getNombreDePortes() {
        return nombreDePortes;
    }

    public void setNombreDePortes(int nombreDePortes) {
        this.nombreDePortes = nombreDePortes;
    }

    void caratéristiqueVéhiculeDerivee() {
        System.out.println("le nombre de porte : " + nombreDePortes);
    }
}
