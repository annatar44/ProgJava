/**
 * Created by E155074J on 12/10/17.
 */
public class Dimensions {

    private double longueur;
    private double largeur;
    private double hauteur;

    public Dimensions(double longueur, double largeur, double hauteur) {
        this.longueur = longueur;
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    public double getLongueur() {
        return longueur;
    }

    public void setLongueur(double longueur) {
        this.longueur = longueur;
    }

    public double getLargeur() {
        return largeur;
    }

    public void setLargeur(double largeur) {
        this.largeur = largeur;
    }

    public double getHauteur() {
        return hauteur;
    }

    public void setHauteur(double hauteur) {
        this.hauteur = hauteur;
    }
}
