public class App {
    public static void main(String[] args) throws Exception {
        new Teste();
    }

    static class Teste {
        private Compte cp1 = new Compte(11156765, 45000);
        private Compte cp2 = new Compte(11167523, 20000);

        Teste() {
            this.cp1.retraitCompte(5000);
            this.cp2.retraitCompte(7000);
            this.cp1.depotCompte(8000);
            this.cp2.depotCompte(12000);
            this.cp1.affichageSold();
            this.cp2.affichageSold();
        }

    }

    static class Compte {
        private float soldCompte;
        private int numCompte;

        Compte(int nC, float sold) {
            this.numCompte = nC;
            if (sold > 0)
                this.soldCompte = sold;
        }

        public void setSoldCompte(float soldCompte) {
            this.soldCompte = soldCompte;
        }

        public float getSoldCompte() {
            return soldCompte;
        }

        public void depotCompte(float depotA) {
            if (depotA > 0)
                this.soldCompte += depotA;
        }

        public void retraitCompte(float retraitA) {
            if (retraitA <= this.soldCompte)
                this.soldCompte -= retraitA;
            else
                System.out.println("retrait impossible sold insufisant ");
        }

        public void affichageSold() {
            System.out.printf("compte numero : %d , solde a %f\n", numCompte, soldCompte);
        }
    }
}
