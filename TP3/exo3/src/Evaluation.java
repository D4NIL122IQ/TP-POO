public class Evaluation extends Note {
    private int anneeEvaluation;

    public Evaluation(String nom, double tp, double exam, int annee) {
        super(nom, tp, exam);
        this.anneeEvaluation = annee;
    }

    public int getAnneeEvaluation() {
        return anneeEvaluation;
    }

    public void setAnneeEvaluation(int anneeEvaluation) {
        this.anneeEvaluation = anneeEvaluation;
    }

    public void deliberer(Note module) {
        if (super.moyenne() >= 10) {
            System.out.println("Admis(e)");
        } else {
            System.out.println("Ajourné(e)");
        }
    }

    public void comparer(Evaluation eva1, Evaluation eva2) {
        if (eva1.getNomModule() == eva2.getNomModule()) {
            if (eva1.getNoteTP() >= eva2.getNoteTP()) {
                System.out.println("la meilleur note entre les deux evaluation : " + eva1.getNoteTP());
            } else {
                System.out.println("la meilleur note entre les deux evaluation : " + eva2.getNoteTP());
            }
        } else {
            System.out.println("ATTENTION CES DEUX EVALUATIONS NE CONCERNENT PAS LE MEME MODULE !!!");
        }
    }

}
