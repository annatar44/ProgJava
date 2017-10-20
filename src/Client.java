import java.util.ArrayList;

/**
 * Created by E159453T on 28/09/17.
 */
public class Client {
    //Attributs
    private ArrayList<Location> locations;
    private String nom;
    private String coordonnees;

    public Client(String nom, String coordonnees) {

        this.coordonnees = coordonnees;
        this.locations = new ArrayList<>();
        this.nom = nom;
    }

    public Client(String nom) {

        this.locations = new ArrayList<>();
        this.nom = nom;
        this.coordonnees = "";
    }

    public Client() {
        this.locations = new ArrayList<>();
        this.nom = "";
        this.coordonnees = "";
    }

    public String getCoordonnees() {
        return coordonnees;
    }

    public void setCoordonnees(String coordonnees) {
        this.coordonnees = coordonnees;
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

    public void louerArticle(Article article, String coordonnees, String dateDebut, String dateFin) {
        double montant = 0.0; //placeholder
        this.locations.add(new Location(article, coordonnees, dateDebut, dateFin, montant));
        article.decrementeStock();
        System.out.println("L'article a bien été ajouté à votre panier de locations.");
    }

    public void afficherLocations() {
        for(Location l : this.locations) {
            l.afficherLocation();
        }
    }
}
