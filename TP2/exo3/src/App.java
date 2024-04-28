import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Circle c = new Circle(3, 0, 6);
        System.out.println("le rayon de ce cercle : " + c.getRadius());
        c.getCenter();
        c.calculatArea();
        c.calculateCircumference();
        c.moveTo(4, 4);
        c.getCenter();
    }

    static class Circle {
        point centre;
        double rayon;

        Circle(double R, double CX, double CY) {
            if (R > 0)
                this.rayon = R;
            else
                System.out.println("le rayon ne peut pas etre negatif");
            centre = new point(CX, CY);
        }

        public double getRadius() {
            return this.rayon;
        }

        public void getCenter() {
            centre.afficher();
        }

        public void calculateCircumference() {
            System.out.println("la circonference de ce cercle :" + (Math.PI * 2 * this.rayon));
        }

        public void calculatArea() {
            System.out.println("la surface de ce cercle : " + (Math.pow(this.rayon, 2) * Math.PI));
        }

        public void moveTo(double ncx, double ncy) {
            centre.moveTo(ncx, ncy);
        }

        static class point {
            double x;
            double y;

            point(double x, double y) {
                this.x = x;
                this.y = y;
            }

            public double getX() {
                return x;
            }

            public double getY() {
                return y;
            }

            public void afficher() {
                System.out.printf("le centre de ce cercle : %f , %f \n", this.x, this.y);

            }

            public void moveTo(double nx, double ny) {
                this.x = nx;
                this.y = ny;
            }
        }
    }
}
