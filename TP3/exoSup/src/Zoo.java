public class Zoo {
    private Animal[] tabAnimals;

    public Zoo() {
        this.tabAnimals[1] = new Mammifere("vache", 5);
        this.tabAnimals[2] = new Mammifere("chien", 3);
        this.tabAnimals[3] = new Oiseau("Meqnin", "dehors");
        this.tabAnimals[4] = new Oiseau("canari", "cage");
        this.tabAnimals[5] = new Oiseau("hiboux", "arbre");
        for (int i = 0; i < tabAnimals.length; i++) {
            tabAnimals[i].manger();
            tabAnimals[i].dormir();
        }
    }
}
