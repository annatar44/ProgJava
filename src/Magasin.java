import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by E159453T on 28/09/17.
 */
public class Magasin {
    //Attributs
    private ArrayList<Article> articles;
    private ArrayList<Client> clients;

    public Magasin(ArrayList<Article> articles, ArrayList<Client> clients) {
        this.articles = articles;
        this.clients = clients;
    }

    public Magasin(ArrayList<Article> articles) {
        this.articles = articles;
        this.clients = new ArrayList<>();
    }

    public ArrayList<Article> getArticles() {
        return articles;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void ajouterClient(Client client) {
        this.clients.add(client);
    }

    /**
     * Méthode permettant d'afficher l'ensemble des articles en stock, avec tous les détails
     */
    public ArrayList<String> afficherArticles()
    {
        ArrayList<String> infoArticles = new ArrayList<>();

        for(Article a : this.articles)
        {
            String tmp = "Article " + a.getReference() + " de type " + a.getType();
            infoArticles.add(tmp);
        }

        return infoArticles;
    }

    /**
     * Méthode permettant d'afficher l'ensemble des clients du magasin
     */
    public void afficherClients()
    {
        for(Client c : this.clients)
        {
            System.out.println("Client " + c.getNom());
        }
    }

    /**
     * Méthode permettant d'afficher l'article correspondant à la référence passée en paramètre
     * @param ref représentant la référence de l'article à afficher
     */
    public String afficherParReference(String ref) {

        String infoRef = "";
        for(Article a : this.articles)
        {
            if(a.getReference().equals(ref))
            {
                infoRef = "Article " + a.getReference() + " de type " + a.getType();
            }
        }

        return infoRef;
    }

    /**
     * Méthode permettant d'afficher l'article correspondant à la marque passée en paramètre
     * @param marque représentant la marque de l'article à afficher
     */
    public ArrayList<String> afficherParMarque(String marque) {
        ArrayList<String> infoMarque = new ArrayList<>();
        for(Article a : this.articles)
        {
            if(a.getMarque().equals(marque))
            {
                String tmp = "Article " + a.getReference() + " de type " + a.getType();
                infoMarque.add(tmp);
            }
        }

        return infoMarque;
    }

    /**
     * Méthode permettant d'afficher l'article correspondant au modele passée en paramètre
     * @param modele représentant le modele de l'article à afficher
     */
    public ArrayList<String> afficherParModele(String modele) {
        ArrayList<String> infoModele = new ArrayList<>();

        for(Article a : this.articles)
        {
            if(a.getModele().equals(modele))
            {
                String tmp = "Article " + a.getReference() + " de type " + a.getType();
               infoModele.add(tmp) ;
            }
        }

        return infoModele;
    }

    /**
     * Méthode permettant d'afficher l'article correspondant au prix passé en paramètre
     * @param prixParJour représentant le prix par jour de location de l'article à afficher
     */
    public ArrayList<String> afficherParPrix(double prixParJour) {
        ArrayList<String> infoPrix = new ArrayList<>();

        for(Article a : this.articles)
        {
            if(a.getPrixParJour() == prixParJour)
            {
                String tmp = "Article " + a.getReference() + " de type " + a.getType();
                infoPrix.add(tmp);
            }
        }

        return infoPrix;
    }

    public void choixRecherche(int choix) {
        Scanner reader = new Scanner(System.in);

        if(choix == 1) {
            System.out.println("Vous avez choisi de visualiser la liste complète des articles.");
            for (String s : this.afficherArticles()) {
                System.out.println(s);
            }
        }

        if(choix == 2) {
            System.out.println("Vous avez choisi la recherche par référence ; veuillez saisir la référence de l'article que vous souhaitez trouver :");
            String reference = reader.next();
            System.out.println(this.afficherParReference(reference));
        }

        if(choix == 3) {
            System.out.println("Vous avez choisi la recherche par marque ; veuillez saisir un nom de marque :");
            String marque = reader.next();
            for (String s : this.afficherParMarque(marque)) {
                System.out.println(s);
            }
        }

        if(choix == 4) {
            System.out.println("Vous avez choisi la recherche par modele ; veuillez saisir un nom de modele :");
            String modele = reader.next();
            for (String s : this.afficherParModele(modele)) {
                System.out.println(s);
            }
        }

        if(choix == 5) {
            System.out.println("Vous avez choisi la recherche par prix par jour de location ; veuillez saisir un prix :");
            double prixParJour = reader.nextDouble();
            for (String s : this.afficherParPrix(prixParJour)) {
                System.out.println(s);
            }
        }

        reader.close();
    }
}
