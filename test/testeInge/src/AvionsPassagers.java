public class AvionsPassagers extends Avions {
    private int capaciteMaxPassagers;
    private int nbrActuelPassagers;

    public AvionsPassagers(String immatriculation, String compagnie, int vitesse, boolean etat, int capacite,
            int nbrPassagers) {
        super(immatriculation, compagnie, vitesse, etat);
        this.capaciteMaxPassagers = capacite;
        if (nbrPassagers <= capacite) {
            this.nbrActuelPassagers = nbrPassagers;
        } else {
            this.nbrActuelPassagers = 0;
        }

    }

    public void setCapaciteMaxPassagers(int capaciteMaxPassagers) {
        this.capaciteMaxPassagers = capaciteMaxPassagers;
    }

    public void setNbrActuelPassagers(int nbrActuelPassagers) {
        this.nbrActuelPassagers = nbrActuelPassagers;
    }

    public int getCapaciteMaxPassagers() {
        return capaciteMaxPassagers;
    }

    public int getNbrActuelPassagers() {
        return nbrActuelPassagers;
    }

    public void embarquer() {
        System.out.println("tout les passagers ont enbarque");
    }

    public void debarquer() {
        System.out.println("tout les passagers ont debarquer");
    }
}
