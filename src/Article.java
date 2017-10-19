import java.util.Objects;

/**
 * Created by E159453T on 28/09/17.
 */
public class Article {
    
    //Attributs
    private String reference;
    private String marque;
    private String modele;
    private double prixParJour;
    private int nbStock;

    //Constructeurs
    public Article(String reference, String marque, String modele, double prixParJour, int nbStock) {
        this.reference = reference;
        this.marque = marque;
        this.modele = modele;
        this.prixParJour = prixParJour;
        this.nbStock = nbStock;
    }

    //getter&setter
    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public double getPrixParJour() {
        return prixParJour;
    }

    public void setPrixParJour(double prixParJour) {
        this.prixParJour = prixParJour;
    }

    public int getNbStock() {
        return nbStock;
    }

    public void setNbStock(int nbStock) {
        this.nbStock = nbStock;
    }

    public String getType() {
        return "Article";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Article)) return false;
        Article article = (Article) o;
        return Double.compare(article.getPrixParJour(), getPrixParJour()) == 0 &&
                getNbStock() == article.getNbStock() &&
                Objects.equals(getReference(), article.getReference()) &&
                Objects.equals(getMarque(), article.getMarque()) &&
                Objects.equals(getModele(), article.getModele());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getReference(), getMarque(), getModele(), getPrixParJour(), getNbStock());
    }

    @Override
    public String toString() {
        return "Article{" +
                "reference='" + reference + '\'' +
                ", marque='" + marque + '\'' +
                ", modele='" + modele + '\'' +
                ", prixParJour=" + prixParJour +
                ", nbStock=" + nbStock +
                '}';
    }
}
