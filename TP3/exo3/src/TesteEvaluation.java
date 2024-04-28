
public class TesteEvaluation {
    Evaluation eva1 = new Evaluation("POO", 14, 12, 2012);
    Evaluation eva2 = new Evaluation("POO", 9, 10.5, 2013);
    Evaluation eva3 = new Evaluation("Reseau", 10, 11.75, 2012);

    public TesteEvaluation() {
        System.out.println("la moyenne de ev1 :" + this.eva1.moyenne());
        System.out.println("la moyenne de ev2 :" + this.eva2.moyenne());
        System.out.println("la moyenne de ev3 :" + this.eva3.moyenne());

        eva1.deliberer(this.eva1);
        eva2.deliberer(this.eva2);
        eva3.deliberer(this.eva3);

        eva1.comparer(this.eva1, this.eva2);
        eva2.comparer(this.eva2, this.eva3);
    }
}
