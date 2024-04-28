/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exoetudiant;

/**
 *
 * @author danil
 */
public class ExoEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Etudiant danil = new Etudiant("danil", 19, 14);
        // Etudiant jsp = new Etudiant("jsp", 24, 10);
        danil.afficherInfoEtudiant();
        // jsp.afficherInfoEtudiant();
        // jsp.augmenterMoyenneEtudiant(0.5);
        // jsp.afficherInfoEtudiant();
    }

    /**
     * Etudiant
     * 
     */
    static class Etudiant {
        private String nom;
        private int age;
        private double moyenne;

        Etudiant(String n, int a, double m) {
            nom = n;
            age = a;
            moyenne = m;
        }

        private void afficherInfoEtudiant() {
            System.out.println("Nom :" + nom);
            System.out.println("Age :" + age);
            System.out.println("Moyenne :" + moyenne);
            System.out.println("--------------");
        }

        public void augmenterMoyenneEtudiant(double valeur) {
            moyenne += valeur;
        }
    }

}
