import java.util.ArrayList;
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

    /**
     * Méthode permettant d'afficher l'ensemble des articles en stock, avec tous les détails
     */
    public String afficherArticles()
    {
        String infoArticles = "";

        for(Article a : this.articles)
        {
            infoArticles = "Article " + a.getReference() + " de type " + a.getType();
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
    public String afficherParMarque(String marque) {
        String infoMarque = "";
        for(Article a : this.articles)
        {
            if(a.getMarque().equals(marque))
            {
                infoMarque = "Article " + a.getReference() + " de type " + a.getType();
            }
        }

        return infoMarque;
    }

    /**
     * Méthode permettant d'afficher l'article correspondant au prix passé en paramètre
     * @param prixParJour représentant le prix par jour de location de l'article à afficher
     */
    public String afficherParPrix(double prixParJour) {
        String infoPrix = "";

        for(Article a : this.articles)
        {
            if(a.getPrixParJour() == prixParJour)
            {
                infoPrix = "Article " + a.getReference() + " de type " + a.getType();
            }
        }

        return infoPrix;
    }

    /**
     * Méthode permettant d'afficher l'article correspondant au modele passée en paramètre
     * @param modele représentant le modele de l'article à afficher
     */
    public String afficherParModele(String modele) {
        String infoModele = "";

        for(Article a : this.articles)
        {
            if(a.getModele().equals(modele))
            {
               infoModele = "Article " + a.getReference() + " de type " + a.getType();
            }
        }

        return infoModele;
    }

    public String choixRecherche(int choix) {
        Scanner reader = new Scanner(System.in);

        if(choix == 1) {
            System.out.println(this.afficherArticles());
        }

        if(choix == 2) {
            System.out.println("Vous avez choisi la recherche par référence ; veuillez saisir la référence de l'article que vous souhaitez trouver :");
            String reference = reader.next();
            System.out.println(this.afficherParReference(reference));
        }

        if(choix == 3) {
            System.out.println("Vous avez choisi la recherche par marque ; veuillez saisir un nom de marque :");
            String marque = reader.next();
            System.out.println(this.afficherParMarque(marque));
        }

        if(choix == 4) {
            System.out.println("Vous avez choisi la recherche par modele ; veuillez saisir un nom de modele :");
            String modele = reader.next();
            System.out.println(this.afficherParMarque(modele));
        }

        if(choix == 5) {
            System.out.println("Vous avez choisi la recherche par prix par jour de location ; veuillez saisir un prix :");
            double prixParJour = reader.nextDouble();
            System.out.println(this.afficherParPrix(prixParJour));
        }

        //System.out.println("Veuillez saisir un chiffre entre 1 et 5.");

        return null;
    }
}
