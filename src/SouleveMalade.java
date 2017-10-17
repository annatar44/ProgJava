/**
 * Created by E159453T on 28/09/17.
 */
public class SouleveMalade extends Article{

    private static String type = "Souleve Malade";
    private double capaciteLevage;
    private double pivotageFleau;

    public SouleveMalade(String reference, String marque, String modele, double prixParJour, int nbStock, double capaciteLevage, double pivotageFleau) {
        super(reference, marque, modele, prixParJour, nbStock);
        this.capaciteLevage = capaciteLevage;
        this.pivotageFleau = pivotageFleau;
    }

    public double getCapaciteLevage() {
        return capaciteLevage;
    }

    public void setCapaciteLevage(double capaciteLevage) {
        this.capaciteLevage = capaciteLevage;
    }

    public double getPivotageFleau() {
        return pivotageFleau;
    }

    public void setPivotageFleau(double pivotageFleau) {
        this.pivotageFleau = pivotageFleau;
    }

    public static String getType() {
        return type;
    }
}
