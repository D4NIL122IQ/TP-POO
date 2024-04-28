public class Rectangle implements Forme {

    private double logueur;
    private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.logueur = longueur;
        this.largeur = largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public void setLogueur(double logueur) {
        this.logueur = logueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public double getLogueur() {
        return logueur;
    }

    @Override
    public double surface() {
        return this.largeur * this.logueur;
    }

    @Override
    public double perimetre() {
        return 2 * (this.largeur + this.logueur);
    }

}
