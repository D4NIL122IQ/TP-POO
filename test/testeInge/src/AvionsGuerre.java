public class AvionsGuerre extends Avions {
    private String typeArmement;
    private int nbrMissileBord;

    public AvionsGuerre(String immatriculation, String compagnie, int vitesse, boolean etat, String typeArmenet,
            int nbrMissile) {
        super(immatriculation, compagnie, vitesse, etat);
        this.typeArmement = typeArmenet;
        this.nbrMissileBord = nbrMissile;
    }

    public int getNbrMissileBord() {
        return nbrMissileBord;
    }

    public String getTypeArmement() {
        return typeArmement;
    }

    public void setNbrMissileBord(int nbrMissileBord) {
        this.nbrMissileBord = nbrMissileBord;
    }

    public void setTypeArmement(String typeArmement) {
        this.typeArmement = typeArmement;
    }

    public void prepationTirMissile() {
        System.out.println("Prepation en cours ...");
    }

    public void tirMissile() {
        System.out.println("tir dans 3 \n 2 \n 1 \n Tire missile reussi ");
    }
}
