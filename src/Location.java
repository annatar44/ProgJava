import java.io.InputStream;
import java.util.ArrayList;

/**
 * Created by E159453T on 28/09/17.
 */
public class Location {
    //Attributs
    private Article article;
    private String coordonnees;
    private String dateDebut;
    private String dateFin;
    private double montant;

    public Location(Article article, String coordonnees, String dateDebut, String dateFin, double montant) {
        this.article = article;
        this.coordonnees = coordonnees;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.montant = montant;
    }

    public Location(Article article) {
        this.article = article;
    }

    public Location() {
        this.article = null;
    }

    //Getters et Setters

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(String coordonnees) {
        this.coordonnees = coordonnees;
    }

    public String getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    public String getDateFin() {
        return dateFin;
    }

    public void setDateFin(String dateFin) {
        this.dateFin = dateFin;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    //Méthodes

    public void enregistrerLocation() {
        
    }

    public void afficherLocation() {
        System.out.println(this.getArticle().getType() + " loué du " + this.getDateDebut() + " au " + this.getDateFin() + " pour la somme de " + this.getMontant() + "€. Coordonnées du client : " + this.getCoordonnees());
    }
}
