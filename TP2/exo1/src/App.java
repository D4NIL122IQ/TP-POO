public class App {
    public static void main(String[] args) throws Exception {

        Etudiant Anno = new Etudiant("dan", -4, 17);
        System.out.println("Nom: " + Anno.getName());
        System.out.println("Age: " + Anno.getAge());
        System.out.println("Moyenne : " + Anno.getNoteMoyenne());
        Anno.setNoteMoyenne(-3);
        System.out.println("Moyenne : " + Anno.getNoteMoyenne());
    }

    /**
     * Etudiant
     */
    static class Etudiant {
        private String nom;
        private int age;
        private double moyenne;

        Etudiant(String n, int a, double m) {
            this.nom = n;
            if (a > 2) {
                this.age = a;
            } else {
                System.out.println("age inacceptable");
            }
            if (m >= 0 && m <= 20) {
                this.moyenne = m;
            } else {
                System.out.println("moyenne" + m + " inacceptable");
            }
        }

        public double getNoteMoyenne() {
            return moyenne;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return nom;
        }

        public void setMoyenne(double moyenne) {
            this.moyenne = moyenne;
        }

        public void setNoteMoyenne(float nm) {
            if (nm >= 0 && nm <= 20) {
                this.moyenne = nm;
            } else {
                System.out.println("moyenne " + nm + " inacceptable");
            }
        }
    }
}
