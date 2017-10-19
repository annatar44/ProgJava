import java.util.ArrayList;

/**
 * Created by E159453T on 28/09/17.
 */
public class Client {
    //Attributs
    private Location location;
    private String nom;

    public Client(String nom, Location location) {

        this.location = location;
        this.nom = nom;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return this.location;
    }

    public String getNom() {
        return nom;
    }

    public void louerArticle(Article... article) {
        for (Article a : article)
        {
            this.location.ajouterArticle(a);
        }
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
