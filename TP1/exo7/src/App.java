import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        int[] tab = { 7, 2, 9, 2, 6, 10, 2, 10, 13, 9, 2, 20, 15 };
        int occ = 0;
        int nbrCherche;
        Scanner ns = new Scanner(System.in);
        System.out.println("entrez un entier : ");
        nbrCherche = ns.nextInt();
        ns.close();

        for (int i : tab) {
            if (i == nbrCherche) {
                occ++;
            }
        }
        System.out.println("le nombre d'occurrence de " + nbrCherche + " est :" + occ);
    }
}
