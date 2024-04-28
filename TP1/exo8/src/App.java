import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int[] tab = new int[10];
        int min;
        float moyenne = 0;
        Scanner clavier = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.println("entrez un entier a mettre dans la " + (i + 1) + " eme position dans le tableau :");
            tab[i] = clavier.nextInt();
        }
        clavier.close();

        min = tab[0];
        for (int i : tab) {
            moyenne += i;
            if (min > i) {
                min = i;
            }
        }
        System.out.println("le minimum du tableau est : " + min);
        System.out.println("la moyenne du tableau est : " + (moyenne / 10));
    }
}
