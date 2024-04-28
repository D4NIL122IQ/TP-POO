/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo4;

import java.util.Scanner;

/**
 *
 * @author danil
 */
public class Exo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner clavier = new Scanner(System.in);
        System.out.println("entrez une couleur (rouge / vert / orange)");
        String str = clavier.nextLine();
        str.toLowerCase();
        clavier.close();
        switch (str) {
            case "rouge":
                System.out.println("interdiction de passer");
                break;
            case "orange":
                System.out.println("ralentir ");
                break;
            case "vert":
                System.out.println("vous pouvez passer");
                break;

            default:
                System.out.println("la couleur n'apartient pas au feux de s");
                break;
        }
    }

}
