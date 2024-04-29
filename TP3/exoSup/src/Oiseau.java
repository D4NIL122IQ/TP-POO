public class Oiseau implements Animal {

    private String nom;
    private String habitat;

    public Oiseau(String nom, String habitat) {
        this.nom = nom;
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getNom() {
        return nom;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void manger() {
        System.out.println(this.nom + " dort");
    }

    @Override
    public void dormir() {
        System.out.println(this.nom + " dort");
    }
}
