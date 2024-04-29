public class Mammifere implements Animal {
    private String nom;
    private int age;

    public Mammifere(String nom, int age) {
        this.nom = nom;
        this.age = age;

    }

    public int getAge() {
        return age;
    }

    public String getNom() {
        return nom;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public void dormir() {
        System.out.println(this.nom + " dort");
    }

    @Override
    public void manger() {
        System.out.println(this.nom + " mange");
    }
}
