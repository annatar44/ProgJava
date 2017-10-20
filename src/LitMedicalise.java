/**
 * @author Tianyou Ni - Clément Lassalle
 */
public class LitMedicalise extends SupportMedical
{
    private boolean barrieres ;

    public LitMedicalise(String reference, String marque, String modele, double prixParJour, int nbStock, Dimensions dimensions, double poids, boolean barrieres)
    {
        super(reference, marque, modele, prixParJour, nbStock, dimensions, poids);
        this.barrieres = barrieres ;
    }

    //getter&setter
    public boolean isBarrieres() {
        return barrieres;
    }

    public void setBarrieres(boolean barrieres) {
        this.barrieres = barrieres;
    }

    public String getType() {
        return "Lit médicalisé";
    }
}
