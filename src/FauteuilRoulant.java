/**
 * Created by E159453T on 28/09/17.
 */
public class FauteuilRoulant extends Article {

    //Attributs
    private double largeurAssise;
    private double poids;

    //Constructeurs
    public FauteuilRoulant(String reference, String marque, String modele, double prixParJour, int nbStock, double largeurAssise, double poids) {
        super(reference, marque, modele, prixParJour, nbStock);
        this.largeurAssise = largeurAssise;
        this.poids = poids;
    }

    public double getLargeurAssise() {
        return largeurAssise;
    }

    public double getPoids() {
        return poids;
    }

    public void setLargeurAssise(double largeurAssise) {
        this.largeurAssise = largeurAssise;
    }

    public void setPoids(double poids) {
        this.poids = poids;
    }

    public String getType() {
        return "Fauteuil roulant";
    }
}
