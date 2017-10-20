/**
 * @author Tianyou Ni - Clément Lassalle
 */
public class SouleveMalade extends Article {

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

    public String getType() {
        return "Soulève-malade";
    }
}
