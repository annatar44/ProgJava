import java.util.ArrayList;

/**
 * Created by E159453T on 28/09/17.
 */
public class Client {
    //Attributs
    private ArrayList<Location> locations;
    private String nom;

    public Client(String nom) {

        this.locations = new ArrayList<>();
        this.nom = nom;
    }

    public void setLocations(ArrayList<Location> locations) {
        this.locations = locations;
    }

    public ArrayList<Location> getLocation() {
        return this.locations;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void louerArticle(Article... article) {
        for (Article a : article)
        {
            this.locations.add(new Location(a));
        }
    }
}
