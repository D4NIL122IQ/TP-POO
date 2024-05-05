public class Zoo {
    public static void main(String[] args) throws Exception {
        Animal[] tabAnimals = new Animal[5];
        tabAnimals[0] = new Mammifere("vache", 5);
        tabAnimals[1] = new Mammifere("chien", 3);
        tabAnimals[2] = new Oiseau("Meqnin", "dehors");
        tabAnimals[3] = new Oiseau("canari", "cage");
        tabAnimals[4] = new Oiseau("hiboux", "arbre");
        for (int i = 0; i < tabAnimals.length; i++) {
            tabAnimals[i].manger();
            tabAnimals[i].dormir();
        }
    }
}
