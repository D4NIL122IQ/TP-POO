
package TP1;

import java.util.Scanner;

public class exo1 {

    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("entrez le premier entier");
            int i = sc.nextInt();
            System.out.println("entrez le deuxieme entier");
            int x = sc.nextInt();
            System.out.println("entrez l'operateur");
            char opeeration = sc.next().charAt(0);
            sc.close();
            int resu;
            switch (opeeration) {
                case '+':
                    resu = i + x;
                    System.out.println("resultat : " + resu);
                    break;
                case '*':
                    resu = i * x;
                    System.out.println("resultat : " + resu);
                    break;
                case '-':
                    resu = i - x;
                    System.out.println("resultat : " + resu);
                    break;
                case '/':
                    if (x == 0) {
                        System.out.println("erreur division par 0");
                    } else {
                        resu = i / x;
                        System.out.println("resultat : " + resu);
                    }
                    break;
                default:
                    System.out.println("error operateur");
                    break;
            }
        }
    }
}