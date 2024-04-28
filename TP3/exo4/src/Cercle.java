public class Cercle implements Forme {
    private double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double surface() {

        return Math.PI * Math.pow(this.rayon, 2);
    }

    @Override
    public double perimetre() {

        return 2 * Math.PI * this.rayon;
    }
}
