import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @author Tianyou Ni - Clément Lassalle
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

    public ArrayList<Location> getLocations() {
        return this.locations;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void louerArticle(Article article, String coordonnees, String dateDebut, String dateFin) {
        SimpleDateFormat myFormat = new SimpleDateFormat("dd MM yyyy");
        double montant = 0.0; //placeholder
        long diff = 0;
        String tmp1 = dateToSimpleDate(dateDebut);
        String tmp2 = dateToSimpleDate(dateFin);

        try {
            Date date1 = myFormat.parse(tmp1);
            Date date2 = myFormat.parse(tmp2);
            diff = date2.getTime() - date1.getTime();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        float days = (diff / (1000 * 60 * 60 * 24));
        montant = article.getPrixParJour() * days;
        this.locations.add(new Location(article, coordonnees, dateDebut, dateFin, montant));
    }

    public String dateToSimpleDate(String date){
        if (date.contains("/")){
            String[] parts = date.split("/");
            String part1 = parts[0];
            String part2 = parts[1];
            String part3 = parts[2];
            date = part1+" "+part2+" "+part3;
        }else {
            throw new IllegalArgumentException("Date " + date + " does not contain /");
        }
        return date;
    }

    public void afficherLocations() {
        for(Location l : this.locations) {
            l.afficherLocation();
        }
    }
}
