/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo5;

/**
 *
 * @author danil
 */
public class Exo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        new TesteCompteBancaire();
    }

    static class TesteCompteBancaire {
        TesteCompteBancaire() {
            CompteBancaire compte1 = new CompteBancaire(6500.4);
            compte1.deposer(3002.53);
            compte1.retirer(1000);
            compte1.afficherSold();
        }
    }

    static class CompteBancaire {

        double sold;

        CompteBancaire(double somme) {
            this.sold = somme;
        }

        public void deposer(double argent) {
            this.sold += argent;
            System.out.println("votre sold apres l'ajout est de :" + sold);
        }

        public void retirer(double argent) {
            if (sold - argent < 0) {
                System.out.println("transaction impossible vous n'avez pas assez dans votre compte");
            } else {
                sold -= argent;
                System.out.println("votre sold apres avoir retirer est de :" + sold);
            }
        }

        public void afficherSold() {
            System.out.println("votre sold est de :" + sold);
        }
    }
}
