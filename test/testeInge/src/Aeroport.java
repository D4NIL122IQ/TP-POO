public class Aeroport {
    public static void main(String[] args) throws Exception {
        AvionsPassagers avions1 = new AvionsPassagers("A35F", "Air Agerie", 0, false, 235, 200);
        AvionsGuerre avions2 = new AvionsGuerre("B1776", "FBI", 0, false, null, 0);
        avions1.embarquer();
        avions1.demarrer();
        avions1.accelerer();
        avions1.accelerer();
        avions1.accelerer();
        avions1.accelerer();
        avions1.accelerer();
        avions1.decoller();
        avions1.freiner();
        avions1.atterir();

        avions2.prepationTirMissile();
        avions2.tirMissile();

    }
}
