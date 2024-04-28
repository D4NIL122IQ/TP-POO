public class App {
    public static void main(String[] args) throws Exception {
        int x, y, r;
        x = 6;
        y = 2;
        r = x / y;
        System.out.println("la division de " + x + " et " + y + " = " + r);

        double z, a, b;
        a = 10.44;
        b = 6.67;
        z = a / b;
        System.out.println("la division de " + a + " et " + b + " = " + z);

        boolean f, n, i;
        n = false;
        i = true;
        f = n || i;
        System.out.println(n + " || " + i + " = " + f);
        f = n && i;
        System.out.println(n + " && " + i + " = " + f);
    }
}
