class Note {
    protected String nomModule;
    protected double noteTP;
    protected double noteExamen;

    public Note(String nomM, double tp, double exam) {
        this.nomModule = nomM;
        this.noteTP = tp;
        this.noteExamen = exam;
    }

    public String getNomModule() {
        return nomModule;
    }

    public void setNomModule(String nomModule) {
        this.nomModule = nomModule;
    }

    public void setNoteExamen(double noteExamen) {
        this.noteExamen = noteExamen;
    }

    public double getNoteExamen() {
        return noteExamen;
    }

    public void setNoteTP(double noteTP) {
        this.noteTP = noteTP;
    }

    public double getNoteTP() {
        return noteTP;
    }

    public double moyenne() {
        return (noteTP * 0.4) + (noteExamen * 0.6);
    }

}
