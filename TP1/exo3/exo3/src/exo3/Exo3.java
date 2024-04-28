/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exo3;

import java.util.Scanner;

/**
 *
 * @author danil
 */
public class Exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 0;
        int D;
        int cpt = 0;
        int min = 2, max = 2;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("entrez un entier");
            x = sc.nextInt();
        } while (x <= 1000 || x % 2 != 0);
        sc.close();

        D = x - 1000;

        System.out.println("La difference par rapport a 1000 est :" + D);
        for (int i = 1; i <= D / 2; i++) {
            if (D % i == 0) {
                cpt++;
                max = i;
            }
        }

        System.out.println("les diviseurs de la difference :" + cpt);
        System.out.println("le max des diviseurs : " + max);
        System.out.println("le min des diviseurs : " + min);
    }

}